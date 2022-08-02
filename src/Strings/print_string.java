package Strings;
import java.util.*;
public class print_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello";
		System.out.println(str);
		System.out.println(str.length());
		System.out.println(str.charAt(0));
		System.out.println(str.substring(2, 4));
		System.out.println(str.substring(1, 5));
		System.out.println(str.substring(3, 4));
		
		String str1 = "Samyak";
		String str2 = "Jain";
		String s3 = str1 + str2;
		System.out.println(s3);
		
		String s4 = str1.concat(str2);
		System.out.println(s4);
		
		String s1 = "Hello";
		String s2 = "Hello";
		String st3 = "hello";
		String st4 = new String ("Hello");
		
		System.out.println((s1 == s2) + " , " + (s1.equals(s2)));
		System.out.println((s1 == st3) + " , " + (s1.equals(st3)));
		System.out.println((s1 == st4) + " , " + (s1.equals(st4)));
		
		
		System.out.println(str.indexOf("lo"));
		
		StringBuilder strng = new StringBuilder ("Samyakjain");
		strng.setCharAt(4, 'r');
		System.out.println(strng);
		
		strng.deleteCharAt(7);
		System.out.println(strng);
		
		strng.append('o');
		System.out.println(strng);
		
		String abc = strng.toString();
		System.out.println(abc);
	}

}
