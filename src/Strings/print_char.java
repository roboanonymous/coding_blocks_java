package Strings;
import java.util.*;

public class print_char {
	
	public static void charac(String str)
	{
		for(int i=0 ; i< str.length(); i++)
		{
			System.out.println(str.charAt(i));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		charac(str);
	}

}
