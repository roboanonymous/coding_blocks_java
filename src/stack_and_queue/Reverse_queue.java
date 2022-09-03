package stack_and_queue;

import java.util.*;

public class Reverse_queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue <Integer> q = new LinkedList<>();
		Stack <Integer> s = new Stack<>();
		
		for(int i = 1; i<10; i++)
		{
			q.add(i*10);
		}
		
		System.out.println(q);
		
		while(!q.isEmpty())
		{
			int a = q.peek();
			s.push(a);
			q.poll();
		}
		
		System.out.println(s);
		
		while(!s.isEmpty())
		{
			int b = s.peek();
			q.add(b);
			s.pop();
		}
		
		System.out.println(q);
		
	}

}
