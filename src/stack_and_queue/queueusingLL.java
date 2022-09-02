package stack_and_queue;

import java.util.*;

public class queueusingLL {
	
	LinkedList <Integer> queue;
	
	queueusingLL()
	{
		queue = new LinkedList<>();
		
	}
	
	public boolean isempty()
	{
		return queue.isEmpty();
	}
	
	public void enqueue(int data)
	{
		queue.addLast(data);
		
	}
	
	public void dequeue()
	{
		queue.removeFirst();
		
	}
	
	public int getfront()
	{
		return queue.getFirst();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queueusingLL queue = new queueusingLL();
		
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
