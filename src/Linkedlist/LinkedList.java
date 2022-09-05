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
		System.out.println("----------------------");
		Node temp = this.head;
		while (temp != null)
		{
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
		System.out.println("----------------------");
	}
	
	
	public void addlast (int item)
	{
		Node nn = new Node();
		nn.data = item;
		nn.next = null;
		
		if(this.size >= 1)
		{
			this.tail.next = nn;
			
		}
		
		if(this.size == 0)
		{
			this.head = nn;
			this.tail = nn;
			this.size++;
			
		}
		
		
		else
		{
			this.tail = nn;
			this.size++;
		}
		
	}
}
