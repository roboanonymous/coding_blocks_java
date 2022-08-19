package Recursion;

public class first_index {
	
	public static int first(int [] arr, int x, int n)
	{
		if(n == arr.length)
		{
			return 0;
		}
		
		if(arr[n] == x)
		{
			return n;
		}
		
		return first(arr, x, n+1) ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int[]  arr = {1,2,3,4,8,9,17};
		
		System.out.println(first(arr, 9, 0));

	}

}
