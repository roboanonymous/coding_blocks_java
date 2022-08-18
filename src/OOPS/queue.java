package OOPS;

public class queue {
	
	protected int [] data;
	protected int front;
	protected int size;
	
	public queue()
	{
		data = new int [5];
		front = 0;
		size = 0;
	}
	
	public queue(int n)
	{
		data = new int [n];
		front = 0;
		size = 0;
	}
	
	public void enqueue (int n) throws Exception
	{
		if(isfull())
		{
			throw new Exception ("Queue is full");
		}
		
		int idx = (front+size)%data.length;
		data[idx] = n;
		size++;
	}
	
	public int dequeue() throws Exception
	{
		if(isempty())
		{
			throw new Exception ("Queue is empty");
		}
		
		int temp = data[front];
		data[front] = 0;
		front = (front +1)% data.length;
		size--;
		return temp;
	}
	
	
	public int getfront()
	{
		int temp = data[front];
		return temp;
	}
	
	public int size()
	{
		return size;
	}
	
	public boolean isempty()
	{
		return size==0;
	}

	public boolean isfull()
	{
		return size== data.length;
	}
	
	public void display()
	{
		System.out.println("-----------------------");
		for(int i=0; i<size; i++)
		{
			int idx = (i+front)%data.length;
			System.out.print(data[idx] + "  ");
		}
		System.out.println();
		System.out.println("-----------------------");
	}
	
}
