package Recursion;

public class power {
	
	public static int powers(int x, int n)
	{
		if(n == 1)
		{
			return x;
		}
		
		int ans1 =  powers(x, n-1);
		int  ans = x* ans1;
		return ans;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(powers(2, 5));

	}

}
