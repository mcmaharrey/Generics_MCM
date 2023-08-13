package main;
import linkedlist.Node;
import linkedlist.LinkedList;
import linkedlist.GenericNode;
import linkedlist.GenericLinkedList;

public class TestLinkedList {

	public static void main(String[] args) {
		
		LinkedList myList=new LinkedList();
		
		Node aNode=new Node();
		aNode.setData("Element 1");
		myList.addNode(aNode);
		aNode = new Node();
		aNode.setData("Element 2");
		myList.addNode(aNode);
		
		Node tempnode=myList.getList();
		do 
		{
			System.out.println(tempnode.getData());
			tempnode=tempnode.getNextNode();
		} while (tempnode!=null);

		
		//Tests Integers
		GenericLinkedList<Integer> integerList = new GenericLinkedList<>();
		GenericNode<Integer> iNode = new GenericNode<Integer>();
		
		iNode.setData(12);
		integerList.addNode(iNode);
		iNode = new GenericNode<Integer>();
		iNode.setData(24);
		integerList.addNode(iNode);
		iNode = new GenericNode<Integer>();
		iNode.setData(453);
		integerList.addNode(iNode);
        
		
		GenericNode<Integer> tempInode=integerList.getList();
        do {
        	System.out.println(tempInode.getData());
            tempInode = tempInode.getNextNode();
        } while (tempInode != null);
        
        //Double
        GenericLinkedList<Double> doubleList = new GenericLinkedList<>();
		GenericNode<Double> dNode = new GenericNode<Double>();
		
		dNode.setData(23.5);
		doubleList.addNode(dNode);
		dNode = new GenericNode<Double>();
		dNode.setData(4.2);
		doubleList.addNode(dNode);
		dNode = new GenericNode<Double>();
		dNode.setData(100.34);
		doubleList.addNode(dNode);
        
		
		GenericNode<Double> tempDnode=doubleList.getList();
        do {
        	System.out.println(tempDnode.getData());
            tempDnode = tempDnode.getNextNode();
        } while (tempDnode != null);
        
        //String
        GenericLinkedList<String> stringList = new GenericLinkedList<>();
		GenericNode<String> sNode = new GenericNode<String>();
		
		sNode.setData("Number 23");
		stringList.addNode(sNode);
		sNode = new GenericNode<String>();
		sNode.setData("Number 343");
		stringList.addNode(sNode);
		sNode = new GenericNode<String>();
		sNode.setData("Number 2.34");
		stringList.addNode(sNode);
        
		
		GenericNode<String> tempSnode=stringList.getList();
        do {
        	System.out.println(tempSnode.getData());
            tempSnode = tempSnode.getNextNode();
        } while (tempSnode != null);
        
        
	}//end main

}//end class
