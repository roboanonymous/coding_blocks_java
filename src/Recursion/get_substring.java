package Recursion;
import java.util.*;
public class get_substring {

	public static ArrayList<String> substring (String str)
	{
		if(str.length() == 0)
		{
			ArrayList <String> baseresult = new ArrayList ();
			baseresult.add(" ");
			return baseresult;
		}
		
		char cc = str.charAt(0);
		
		String ros = str.substring(1);
		
		ArrayList <String> result = new ArrayList ();
		ArrayList <String> list = substring(ros);
		
		for(int i=0; i< list.size(); i++)
		{
			result.add(list.get(i));
			result.add(cc + list.get(i));
			
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		
		
		System.out.println(substring(str));

	}

}
