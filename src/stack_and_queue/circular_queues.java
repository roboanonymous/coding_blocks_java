package stack_and_queue;


public class circular_queues {
	
	private int[] arr;
	private int front;
	private int rear;
	private int cs;
	private int ms;
	
	public static int Default_capaity = 10; 
	
	circular_queues()
	{
		this(Default_capaity);
	}
	circular_queues(int capacity)
	{
		this.arr = new int [capacity];
		this.front = 0;
		this.rear = capacity-1;
		this.cs = 0;
		 this.ms = capacity;
		
	}
	
	public boolean isfull()
	{
		return cs == ms;
	}
	
	public boolean isempty()
	{
		return cs == 0;
	}
	
	public void enqueue(int data)
	{
		if(!this.isfull())
		{
			this.rear = (this.rear+1)% this.arr.length;
			this.arr[this.rear] = data;
			this.cs = cs+1;		
		}
		
	}
	
	public void dequeue()
	{
		if(!this.isempty())
		{
			this.front = (this.front+1)% this.arr.length;
			this.cs = cs-1;		
		}
		
	}
	
	public int getfront()
	{
		return this.arr[this.front];
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circular_queues queue = new circular_queues();
		for(int i=0; i<7; i++)
		{
			queue.enqueue(i);
		}
		
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		
		System.out.println(queue.getfront());

	}

}
