package Recursion;

public class bubble_sort {
	
	public static void bubble(int [] arr, int si , int li)
	{
		if(li == 0)
		{
			return;
		}
		
		if(si == li)
		{
			bubble(arr, 0, li-1);
			return;
		}
		
		if(arr[si] > arr[si+1])
		{
			int temp = arr[si];
			arr[si] = arr[si+1];
			arr[si+1] = temp;
		}
		
		bubble(arr, si+1 , li);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     int[]  arr = {9,5,3,4,8,19,17};
	     
	     bubble(arr, 0 , 6);
	     
	     for(int i=0; i<6; i++)
	     {
	    	 System.out.print(arr[i] + " ");
	     }
	     
	}

}
