package linkedlist;

/**
 * This class models a Node object which contains Strings. Each
 * node has its internal data (a String) and pointers to the next 
 * node in the list.
 * 
 * @author rkelley/njohnson
 * Programming Project 1 Start Project
 * CS131ON
 */
public class Node {
	
	private String data;  //data that the object stores
	private Node nextNode; //pointer to the nextNode that will be in LinkedList
	
	/**
	 * Constructor build Node object. Initializes nextNode and data
	 * to null.
	 */
	public Node()
	{
		setNextNode(null);
		data=null;
	}//end empty-argument constructor
	
	/**
	 * This method sets the data of the object.
	 * @param data
	 */
	public void setData(String data) {
		this.data=data;
	}//end setData
	
	/**
	 * This method returns the data of the object.
	 * @return String (data)
	 */
	public String getData() {
		return this.data;
	}//end getData
	
	/**
	 * This method returns itself to the caller.
	 * @return
	 */
	public Node getNode() {
		return this;
	}//end getNode
	
	/**
	 * This method updates the pointer for the next node.
	 * @param nextNode
	 */
	public void setNextNode(Node nextNode)
	{
		this.nextNode=nextNode;
	}//end setNextNode
	
	/**
	 * This method returns the node stored in the next node pointer.
	 * @return Node object
	 */
	public Node getNextNode() {
		return nextNode;
	}//end getNextNode
	
}//end class
