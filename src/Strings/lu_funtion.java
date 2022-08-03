package Strings;

import java.util.Scanner;

public class lu_funtion {
	
	public static char func (char c)
	{
		if(c>='A' && c<='Z'){
			return 'U';
		}
		else if(c>='a' && c<='z'){
			return 'L';
		}
		
		return 'I';
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		
		System.out.println(func(c));
		
		
	}

}
