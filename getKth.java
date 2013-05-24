//returns kth largest element of a binary search tree
//0th element is defined to be the smallest element
public E getKth (BinaryTreeNode<E> root, int k){
	//kick off in order traversal that will cease once kth element is reached
	//we use an arrayList that only stores one element at a time
	//this element will be replaced during the recursive in order traversal until kth is reached
	ArrayList<E> elements = new ArrayList<E>(1);
	elements.add(null);
	//count keeps track of how many elements have been seen during the traversal
	int [] count = {-1};
	getKthHelper(root, k, elements, count);
	return elements.get(0);
	//algorithm thus finds the kth element in time O(n) using constant space
}
 
//performs in-order traversal from root and returns kth element of BST
private void getKthHelper (BinaryTreeNode<E> node, int k, ArrayList<E> elements, int [] count){
	//continue traversing while node != null and count < k
	if (node != null && count[0] < k)
	{
		getKthHelper (node.getLeft(), k, elements, count);
		if (count[0] < k){
			elements.set(0, node.getData());
			++count[0];
		}
		getKthHelper (node.getRight(), k, elements, count);
	}
}