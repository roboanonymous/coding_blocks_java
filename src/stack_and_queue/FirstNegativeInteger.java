package stack_and_queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class FirstNegativeInteger {
	
	public static void firstNegeative(int [] arr , int k)
	{
		Deque <Integer> queue = new LinkedList <>();
		int i;
		for(i=0; i<k; i++)
		{
			
			if(arr[i] < 0)
			{
				queue.addLast(i);
			}
		}
		
		for(; i<arr.length; i++)
		{
			if(! queue.isEmpty())
			{
				System.out.print(arr[queue.getFirst()] + "  ");
			}
			
			else
			{
				System.out.print("0" + "  ");
			}
			
			
			while(! queue.isEmpty() && queue.getFirst() <= i-k)
			{
				queue.removeFirst();
			}
			
			if(arr[i] < 0)
			{
				queue.addLast(i);
			}
		}
		
		if(! queue.isEmpty())
		{
			System.out.print(arr[queue.getFirst()] + "  ");
		}
		
		else
		{
			System.out.print("0" + "  ");
		}
		
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int [n];
		for(int i=0; i<n ; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int k = sc.nextInt();
		
		firstNegeative(arr , k);
	}

}
