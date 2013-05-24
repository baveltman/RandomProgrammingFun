/**
 * This class contains code for a node to be used in a binary search tree
 * the code for this class is adapted from code written by professor Michael Scott
 * as part of the CS314 data structures course at the University of Texas at Austin
 * 
 */
public class BinaryTreeNode<E extends Comparable<? super E> >{
 
	//instance variables
	private E myData;
	private BinaryTreeNode<E> myLeft;
	private BinaryTreeNode<E> myRight;
 
	public BinaryTreeNode() {
		this(null);
	}
 
	public BinaryTreeNode(E val) {
		this(null, val, null); 
	}
 
	public BinaryTreeNode(BinaryTreeNode<E> left,
			E val,        
			BinaryTreeNode<E> right) {
		myData = val; 
		myLeft = left; 
		myRight = right; 
	}
 
	public E getData() { 
		return myData; 
	}
 
	public BinaryTreeNode<E> getLeft() { 
		return myLeft;
	}
 
	public BinaryTreeNode<E> getRight() { 
		return myRight; 
	}
 
	public void setData(E val) { 
		myData = val; 
	}
 
	public void setLeft(BinaryTreeNode<E> left) { 
		myLeft = left; 
	}
 
	public void setRight(BinaryTreeNode<E> right) { 
		myRight = right; 
	} 
}