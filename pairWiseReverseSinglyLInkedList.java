//pairwise swaps nodes of a singly linked list in place
//returns head of new list
//O(n) time and O(1) space
static ListNode<Integer> pairwiseSwapList (ListNode<Integer> head){
	//check for exceptions
	if (head == null)
	{
		throw new IllegalArgumentException ("Linked List is empty");
	}
	//obtain the new head to the list once swapping is completed
	//if there's only one node it remains the head, otherwise second node will become the head
	ListNode<Integer> newHead = (head.getNext() == null)? head : head.getNext();
	//if list only has 1 node it cannot be pairwise swapped
	if (head.getNext() != null) {
		//swap first two nodes, and obtain pointers to next two nodes to be swapped
		ListNode<Integer> first = head;
		ListNode<Integer> second = first.getNext();
		ListNode<Integer> nextFirst = second.getNext();
		//ensure that two more nodes actually exist
		ListNode<Integer> nextSecond = (nextFirst == null)? null : nextFirst.getNext();
		second.setNext(first);
		first.setNext((nextSecond == null)? nextFirst : nextSecond);
		//repeat pairwise swapping until finished
		//stop if only one node or no nodes remain after a previous swap
		while (nextFirst != null && nextSecond != null){
			first = nextFirst;
			second = nextSecond;
			nextFirst = second.getNext();
			nextSecond = (nextFirst == null)? null : nextFirst.getNext();
			second.setNext(first);
			first.setNext((nextSecond == null)? nextFirst : nextSecond);
		}
	}
	return newHead;
}