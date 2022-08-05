package Function_array;

import java.util.Scanner;

public class lower_bound {
	
	public static void lower(int n , int[] arr, int k)
	{
		int start = 0, end = n-1;
		int mid = (start + end)/2;
		int lower = n-1;
		while(start <= end)
		{
			if (arr[mid] == k)
			{
				lower = Integer.min(mid, lower);
				end = mid-1;
				mid = (start + end)/2;
				
			}
			
			else if (arr[mid] > k)
			{
				end = mid-1;
				mid = (start + end)/2;
			}
			
			else
			{
				start = mid+1;
				mid = (start + end)/2;
			}
		}
		
		System.out.println(lower);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int[] arr;
		arr = new int [n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int k = sc.nextInt();
		
		
		lower(n, arr, k);
	}

}
