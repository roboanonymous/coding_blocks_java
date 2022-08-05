package Recursion;

public class print_num {
	
	public static void pd(int n)
	{
		if(n  == 0)
		{
			return;
		}
		
		pd(n-1);
		System.out.println(n);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		pd(5);

	}

}
