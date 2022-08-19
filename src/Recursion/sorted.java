package Recursion;

public class sorted {
	
	public static boolean sort (int [] arr, int n)
	{
		if(n == 0)
		{
			return true;
		}
		
		if(arr[n] > arr[n-1])
		{
			return sort(arr, n-1);
			
		}
		
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]  arr = {1,2,3,4,8,9,17};
		
		System.out.println(sort(arr, 6));

	}

}
