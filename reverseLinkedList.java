//reverses linked list in place
//O(n) time and O(1) space
static void reverseList (ListNode<Integer> head){
	//check for exceptions
	if (head == null)
	{
		throw new IllegalArgumentException ("Linked List is empty");
	}
 
	//if list only has 1 node it is already reversed
	if (head.getNext() != null) {
		//set first node to be last node
		ListNode<Integer> tail = head;
		ListNode<Integer> middle = head.getNext();
		//nextTail will give access to the next node to reverse
		ListNode<Integer> nextTail = middle.getNext();
		tail.setNext(null);
		middle.setNext(tail);
		//previousMiddle is the last node we reversed. 
		//We need access to this node when reversing next tail in next iteration
		ListNode<Integer> previousMiddle = middle;
		//once nextTail = null, we know we have reversed the entire list
		while (nextTail != null){
			tail = nextTail;
			middle = tail.getNext();
			nextTail = middle;
			tail.setNext(previousMiddle);
			//avoid null pointer exceptions
			if (middle != null){
				nextTail = middle.getNext();
				middle.setNext(tail);
				previousMiddle = middle;
			}
		}
	}
 
}