package Linkedlist;

public class LinkedList {
	
	private class Node
	{
		int data;
		Node next;
		
	}
	
	private Node head;
	private Node tail;
	private int size;
	
	public void display()
	{
		Node temp = this.head;
		while (temp != null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
}
