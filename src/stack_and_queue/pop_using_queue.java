package stack_and_queue;

import java.util.LinkedList;
import java.util.Queue;

public class pop_using_queue {
	
	Queue <Integer> q1 = new LinkedList<>();
	Queue <Integer> q2 = new LinkedList<>();
	
	public int size()
	{
		return q1.size();
	}
	
	public void push(int a)
	{
		while(q1.size() != 0)
		{
			q2.add(q1.remove());
		}
		
		 q1.add(a);
		
		while(q2.size() != 0)
		{
			q1.add(q2.remove());
		}
	}
	
	public int pop()
	{
		return q1.poll();
		
	}
	
	public void display() {
		System.out.println(q1);
	}

}
