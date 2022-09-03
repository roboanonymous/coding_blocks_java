package stack_and_queue;

import java.util.*;

public class push_using_queue {

		Queue <Integer> q1 = new LinkedList<>();
		Queue <Integer> q2 = new LinkedList<>();
		
		public int size()
		{
			return q1.size();
		}
		
		public void push(int a)
		{
			q1.add(a);
		}
		
		public int pop()
		{
			while(q1.size() != 1)
			{
				q2.add(q1.remove());
			}
			
			int x =  q1.remove();
			
			while(q2.size() != 0)
			{
				q1.add(q2.remove());
			}
			
			return x;
		}
		
		public void display() {
			System.out.println(q1);
		}

}
