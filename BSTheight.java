//returns the height of a binary search tree when passed the root node
private int findHeightHelper(BinaryTreeNode<E> node) 
{
	//check if tree is empty, or if you've reached the end of a path down the tree
	if (node == null)
	{
		return -1;
	}
	else
	{
		//continue measuring depth of tree
		//ascertain which subtree is deeper at each recursion
		//add 1 for each level of the tree traveled
		return 1 + Math.max(findHeightHelper(node.getLeft()), findHeightHelper(node.getRight()));
	}
}