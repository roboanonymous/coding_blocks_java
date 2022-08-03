package Strings;

import java.util.*;

public class Palindrom {
	
	public static boolean palin(String str)
	{
		int n = str.length()/2;
		for(int i=0; i<n; i++)
		{
			if(str.charAt(i) != str.charAt(str.length()-1-i))
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println(palin(str));

	}

}
