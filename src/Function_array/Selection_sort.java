package Function_array;

import java.util.*;


public class Selection_sort {
	
	public static void selection(int n , int [] arr)
	{
		for(int i=0; i<n-1; i++)
		{
			int min = i;
			for(int j=i+1; j<n; j++)
			{
				if(arr[min] > arr[j])
				{
					min = j;
				}
				
				
			}
			
			if(arr[i] > arr[min] )
			{
				int temp = arr[i];
				arr[i]= arr[min];
				arr[min] = temp;
			}
		}
		
		 System.out.println(Arrays.toString(arr));
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
		
		selection(n, arr);
	}

}
