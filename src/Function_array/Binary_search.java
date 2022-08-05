package Function_array;
import java.util.*;

public class Binary_search {
	
	public static int binary(int n , int[] arr, int k)
	{
		int start = 0, end = n-1;
		int mid = (start + end)/2;
		
		while(start <= end)
		{
			if (arr[mid] == k)
			{
				return mid;
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
		
		return -1;
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
		
		
		int a = binary(n, arr, k);
		
		System.out.println(a);
	}

}
