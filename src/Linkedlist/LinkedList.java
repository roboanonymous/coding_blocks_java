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
	
	
	public void addfirst(int item)
	{
		Node nn = new Node();
		nn.data = item;
		nn.next = this.head;
		
		if(this.size == 0)
		{
			this.head = nn;
			this.tail = nn;
			this.size++;
			
		}
		
		
		else
		{
			this.head = nn;
			this.size++;
		}
	}
	
	public int getfirst()
	{
		return head.data;
	}
	
	public int getlast()
	{
		return tail.data;
	}
	
	public int getat(int idx)
	{
		Node temp = head;
		for(int i=0; i<idx; i++)
		{
			temp = temp.next;
		}
		
		return temp.data;
	}
	
	
	
	
}
