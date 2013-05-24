//returns true if a singly linked list has a loop, false otherwise
//O(n) time and O(1) space
static ListNode<Integer> findBeginningOfLoop (ListNode<Integer> first){
	//check for exceptions
	if (first == null)
	{
		throw new IllegalArgumentException ("Linked List is empty");
	} 
 
	//We use two pointers, one of which will travel at a rate twice as fast as the other
	//if a loop exists the two pointers will meet eventually
	ListNode<Integer> doubleStep = first;
	ListNode<Integer> singleStep = first;
 
	//we loop until doubleStep = null, in which case there is no loop in the linked list
	//or until doubleStep and singleStep meet and confirm we have looped 
	while (doubleStep != null){
		doubleStep = doubleStep.getNext();
		//avoid potential null pointer exception
		if (doubleStep != null) {
			doubleStep = doubleStep.getNext();
			singleStep = singleStep.getNext();
		}
		if (doubleStep == singleStep){
			//we found a loop
			//now we find the beginning of the loop by setting one of the pointers to first node
			//and traversing in single steps until the two pointers meet again
			//Once the two pointers meet we have found the beginning of the loop
			singleStep = first;
			while (singleStep != doubleStep){
				singleStep = singleStep.getNext();
				doubleStep = doubleStep.getNext();
			}
			return singleStep;	
		}
	}
	//no loop in this list
	return null;
}