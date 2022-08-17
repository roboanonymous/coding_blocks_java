package OOPS;

public class queue {
	
	private int [] data;
	private int front;
	private int size;
	
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
		
		int idx = front+size;
		data[idx] = n;
		size++;
	}
	
	public int dequeue()
	{
		int temp = data[front];
		data[front] = 0;
		front++;
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
	
	
	
}
