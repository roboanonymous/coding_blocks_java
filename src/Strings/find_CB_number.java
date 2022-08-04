package Strings;

import java.util.*;

public class find_CB_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int count = 0;
		for(int i=0; i< str.length(); i++)
		{
			for(int j=i+1; j<=str.length(); j++)
			{
				String s = str.substring(i, j);
				int a;
				
				try {
				   a = Integer.parseInt(s);
				}
				catch (NumberFormatException e) {
				   a = 0;
				}
				
				
				
				if(a == 0 || a == 1 )
				{
					continue;
				}
				
				else if (a == 2 || a == 3 || a == 5 || a == 7 || a == 11 || a == 13 || a == 17 || a == 19 || a == 23 || a == 29)
				{
					count++;
					continue;
				}
				
				else if ( a%2 != 0 &&  a%3 != 0 && a%5 != 0 && a%7 != 0 && a%11 != 0 && a%13 != 0 && a%17 != 0 &&  a%19 != 0 && a%23 != 0 &&  a%29 != 0)
				{
					count++;
				}
				
				else
				{
					continue;
				}
				
			}
		}
		
		System.out.println(count);
	}

}
