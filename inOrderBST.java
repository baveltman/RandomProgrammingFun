//performs in-order traversal of a binary search tree
//and returns elements of tree in a List
public List<E> inOrderTraversal() 
{
	//a List container is created to store all elements in sorted ascending order
	List<E> list = new ArrayList<E> ();
	//add elements of BST to result in course of an in order traversal by using a helper
	//root is the root node of your tree
	inOrderTraversalHelper (root, list);
	return list;
}
 
 
//helper method for inOrderTraversal
//performs actual traversal and adds elements of tree to list in correct order
private void inOrderTraversalHelper(BinaryTreeNode<E> node, List<E> list) 
{
	//continue traversing while node != null
	if (node != null)
	{
		inOrderTraversalHelper (node.getLeft(), list);
		list.add(node.getData());
		inOrderTraversalHelper (node.getRight(), list);
	}
 
}