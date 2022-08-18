package Recursion;

public class Fibonacci {
	
	public static int fibb (int n)
	{	
		if(n==0)
		{
			return 0;
		}
		
		if(n==1)
		{
			return 1;
		}
		
		int a = fibb(n-1) + fibb(n-2);
		
		return a;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = fibb(7);
		System.out.println(a);
	}

}
