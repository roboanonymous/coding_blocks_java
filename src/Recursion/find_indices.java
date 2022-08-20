package Recursion;

public class find_indices {
	
	public static int[]  indices(int [] arr, int si , int data , int count)
	{
		
		if(si == arr.length)
		{
			int [] base = new int [count];
			return base;
		}
		int [] ind = null;
		
		if(arr[si] == data)
		{
			ind = indices(arr, si+1 , data , count+1);
		}
		
		else
		{
			ind = indices(arr, si+1 , data , count);		
		}
		
		if(arr[si] == data)
		{
			ind[count] = si;
		}
		
		return ind;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     int[]  arr = {9,8,3,4,8,19,8};
	     
	     int [] ans = indices(arr, 0 , 8 , 0);
	     
	     for(int i=0; i<ans.length; i++)
	     {
	    	 System.out.print(ans[i] + " ");
	     }
	     
	}

}
