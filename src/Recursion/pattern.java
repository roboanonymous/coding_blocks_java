package Recursion;

public class pattern {
	
	public static void patt(int n, int r, int c)
	{
		if(r>n)
		{
			return;
		}
		if(c > r)
		{
			System.out.println();
			patt(n, r+1,1);
			return;
		}
		
		System.out.print("* ");
		patt(n, r, c+1);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		patt(5,1,1);

	}

}
