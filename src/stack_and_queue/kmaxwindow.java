package stack_and_queue;
import java.util.*;

public class kmaxwindow {
	
	public static  void PrintMax(int [] arr , int k)
	{
		Deque <Integer> queue = new LinkedList <>();
		int i;
		for(i=0; i<k; i++)
		{
			while(!queue.isEmpty() && arr[i] > arr[queue.getLast()])
			{
				queue.removeLast();
			}
			queue.addLast(i);
		}
		
		for(; i<arr.length; i++)
		{
			System.out.print(arr[queue.getFirst()] + "  ");
			while(! queue.isEmpty() && queue.getFirst() <= i-k)
			{
				queue.removeFirst();
			}
			
			while(!queue.isEmpty() && arr[i] > arr[queue.getLast()])
			{
				queue.removeLast();
			}
			
			queue.addLast(i);
		}
		
		System.out.println(arr[queue.getFirst()]);
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
		
		PrintMax(arr , k);

	}

}
