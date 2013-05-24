//finds middle element of a singly linked list in a single pass
//a linked list is made of nodes with some data and a reference to the next node in the list
//even lists have no clear "middle". This method returns elemnt at "index" size/2 + 1;
static ListNode<Integer> findMiddleOfList (ListNode<Integer> first){
	//check for exceptions
	if (first == null)
	{
		throw new IllegalArgumentException ("Linked List is empty");
	} 
	//naive solution will involve traversing the list fully once while counting the number of nodes
	//Then going again from the beginning of the list to the middle. This solution will require a pass and a half through the list
	//However, the optimal solution can obtain the middle node in a single pass
 
	//we use two pointers, trading off more space for less time
	//the first pointer moves at a rate of two nodes per iteration
	//the second pointer moves at a rate of one node per iteration
	ListNode<Integer> doubleStep = first;
	ListNode<Integer> singleStep = first;
	while (doubleStep != null){
		doubleStep = doubleStep.getNext();
		//avoid potential null pointer exception
		if (doubleStep != null) {
			doubleStep = doubleStep.getNext();
			singleStep = singleStep.getNext();
		}
	}
 
	//by the time we reach the end of the list we will have traveled twice the distance of singleStep
	//Therefore, singleStep will be half the distance from the end of the list (ie the middle)
	return singleStep;
}