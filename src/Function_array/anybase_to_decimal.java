package Function_array;
import java.util.*;

public class anybase_to_decimal {
	
	public static void anybase(int a, int b)
	{
		int n = a;
		int ans = 0;
		int mult = 1;
		while(n != 0)
		{
			int rem = n%10;
			ans = ans+ (rem* mult);
			mult = mult*b;
			n= n/10;
		}
		
		System.out.println(ans);
		 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		anybase(a,b);
		

	}

}
