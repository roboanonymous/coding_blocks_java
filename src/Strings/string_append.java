package Strings;
import java.util.*;
public class string_append {
	
	public static void append(int n)
	{
		String str = "";
		for(int i=0; i<=n; i++)
		{
			str = str + i;
		}
		

	}
	
	public static void append2(int n)
	{
		
		StringBuilder str2 = new StringBuilder ();
		for(int i=0; i<=n; i++)
		{
			str2 = str2.append(i);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		append(100000);
		long end = System.currentTimeMillis();
		
		System.out.println(end-start);
		
		long start2 = System.currentTimeMillis();
		append2(100000);
		long end2 = System.currentTimeMillis();
		System.out.println(end2-start2);

	}

}
