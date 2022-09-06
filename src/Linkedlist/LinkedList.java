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
	
	public Node getNodeat(int idx)
	{
		Node temp = head;
		for(int i=0; i<idx; i++)
		{
			temp = temp.next;
		}
		
		return temp;
	}
	
	public void addat(int idx , int data)
	{
		
		Node temp = head;
		for(int i=0; i<idx-1; i++)
		{
			temp = temp.next;
		}
		
		Node ne = new Node();
		ne.data = data;
		ne.next = temp.next;
		
		temp.next = ne;
		this.size++;
		
	}
	
	public int removeFirst() throws Exception {
		if(this.size == 0)
		{
			throw new Exception ("LL is Empty");
		}
		
		int rv = head.data;
		if (this.size == 1)
		{
			this.head = null;
			this.tail = null;
			this.size = 0;
		}
		
		else
		{
			this.head = this.head.next;
			this.size--;
		}
		
		
		return rv;
	}
	
	public int removelast() throws Exception {
		if(this.size == 0)
		{
			throw new Exception ("LL is Empty");
		}
		
		int rv = this.tail.data;
		if (this.size == 1)
		{
			this.head = null;
			this.tail = null;
			this.size = 0;
		}
		
		else
		{
			Node lv = getNodeat(this.size-2);
			this.tail = lv;
			this.size--;
		}
		
		
		return rv;
	}
	
	
}
