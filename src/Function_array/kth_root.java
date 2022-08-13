package Function_array;
import java.util.*;

public class kth_root {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i=0; i<t; i++)
		{
	    	long n=sc.nextLong();
		    long k=sc.nextLong();

          double y = Math.pow(n, (1.0 / k));
          long x =(long)(y);
           if (Math.pow(x+1,k )==n)
                System.out.println(x+1);
           else 
                System.out.println(x);  
			
			
		}
	}

}
