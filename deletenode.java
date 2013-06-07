//deletes a node from the middle singly linked list, given access only to that node
//runs in constant time
public void deleteNode (ListNode<Integer> node){
	//check for exceptions
	if (node == null)
	{
		throw new IllegalArgumentException ("node is null");
	}
	//since we only have access to the node that is to be deleted 
	//and we can't go backwards we will obtain the data from the next node
	//and cope this data into node
	ListNode<Integer> nextNode = node.getNext();
	if (nextNode != null){
		node.setData(nextNode.getData());
	} else {
		node = null;
	}
	//now we will disconnect nextNode from the linked list
	//and connect node to nextNode.getNext();
	if (node != null){
		node.setNext(nextNode.getNext());
	}
}