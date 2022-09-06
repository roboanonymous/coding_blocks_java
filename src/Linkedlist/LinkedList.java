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
			Node lv = getNodeat(this.size-1);
			this.tail = lv;
			tail.next = null;
			this.size--;
		}
		
		
		return rv;
	}
	
	public int removeat(int idx) throws Exception {
		if(this.size == 0)
		{
			throw new Exception ("LL is Empty");
		}
		
		if(idx < 0 || idx>= this.size)
		{
			throw new Exception ("Invalid Index");
		}
		
		if(idx == 0)
		{
			return removeFirst();
		}
		else if (idx == this.size -1)
		{
			return removelast();
		}
		
		else
		{
			Node a = getNodeat(idx);
			Node b = getNodeat(idx-1);
			Node c = getNodeat(idx+1);
			
			int rv = a.data;
			
			b.next = c;
			
			return rv;
		}	
		
	}
	
	public void reversedata()

	{
		int left = 0;
		int right = size-1;
		
		while(left < right)
		{
			Node ln = getNodeat(left);
			Node rn = getNodeat(right);
			
			int temp = ln.data;
			ln.data = rn.data;
			rn.data = temp;
			
			left++;
			right--;
			
		}
	}

	public void reversepointers()
	{
		Node prev = this.head;
		Node curr = prev.next;
		
		while(curr != null)
		{
			Node ahead = curr.next;
			curr.next = prev;
			prev = curr;
			curr = ahead;
		}
		
		Node t = this.head;
		this.head = this.tail;
		this.tail = t;
		
		this.tail.next = null;
	}

	
	public int midpoint()
	{
		Node a = head;
		Node b = head;
		
		while(b.next != null && b.next.next != null)
		{
			a = a.next;
			b = b.next.next;
		}
		return a.data;
	}
}
