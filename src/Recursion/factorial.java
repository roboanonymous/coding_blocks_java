package Recursion;

public class factorial {
	
	public static int factorials (int n)
	{
		if(n==1)
		{
			return 1;
		}
		
		
		int a = n*factorials(n-1);
		
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = factorials(10);
		System.out.println(a);
	}

}
