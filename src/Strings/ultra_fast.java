package Strings;
import java.util.*;

public class ultra_fast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
//		int a = sc.nextInt();
//		
//		for(int i=0; i<a; i++)
//		{
//			
//		}
		
		String str = sc.nextLine();
		String str2 = sc.nextLine();
		
		StringBuilder str3 = new StringBuilder ("");
		for(int j=0; j<str.length() ; j++ )
		{
			if(str.charAt(j) == str2.charAt(j))
			{
				str3.append('0');
			}
			
			else
			{
				str3.append('1');
			}
			
			
		}
		
		System.out.println(str3);
	}

}
