package Function_array;

import java.util.*;


public class Insretion_sort {

	public static void insertion(int n , int [] arr)
	{
		for(int i=0; i<n; i++)
		{
			int curr = arr[i];
			int j = i-1;
			while(j >= 0 && curr < arr[j])
			{
				arr[j+1] = arr[j];
				j--;
			}
			
			arr[j+1] = curr;
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
		
		insertion(n, arr);

	}
}
