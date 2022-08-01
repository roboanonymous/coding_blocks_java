package Strings;

import java.util.Scanner;

public class print_substring {
	
	public static void subst(String str)
	{
		for(int i=0; i< str.length(); i++)
		{
			for(int j=i; j<str.length()+1; j++)
			{
				System.out.println(str.substring(i, j));
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		subst(str);

	}

}
