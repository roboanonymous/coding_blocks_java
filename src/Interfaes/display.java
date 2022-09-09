package Interfaes;

public class display {
	
	public static <T> void display1(T [] arr)
	{
		for( T val: arr)
		{
			System.out.print(val + " ");
		}
		
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a = {10,20,30,40,50,60,70};
		String[] b = {"abc", "def", "ghi", "jkl"};
//		display1(a);
		display1(b);
		
	}

}
