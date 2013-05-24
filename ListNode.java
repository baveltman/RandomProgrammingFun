/**
 * A class that represents a node to be used in a linked list.
 * These nodes are singly linked.
 * 
 * This Node class modifies the DoubleListNode class created by Professor Michael Scott at The University of Texas at Austin
 *
 */
 
 public class ListNode<E>
 {
 
	 /* instance variables */
 
	// the data to store in this node
	private E myData;
 
	// the link to the next node (presumably in a list)
	private ListNode<E> myNext;
 
 
	/**
	 * default constructor.
	 */
	public ListNode() {
		this(null, null);
	}
 
	/**
	 * creates a ListNode that holds the specified data
	 * and refers to the specified next node in the list.
	 * @param data the data this ListNode holds
	 * @param next the next node
	 */
	public ListNode(E data, ListNode<E> next)
	{	myData = data;
		myNext = next;
	}
 
	/**
	 * returns the data in this node.
	 */
	public E getData()
	{	
		return myData;	
	}
 
	/**
	 * return the ListNode this ListNode points to.
	 */
	public ListNode<E> getNext()
	{	return myNext;	}
 
 
	/**
	 * sets the data in this node.
	 * The old data is over written.
	 */
	public void setData(E data)
	{	
		myData = data;	
 
	}
 
	/**
	 * sets the next node this ListNode points to.
	 */
	public void setNext(ListNode<E> next)
	{	
		myNext = next;	
 
	}
}