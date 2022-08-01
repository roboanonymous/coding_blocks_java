package Strings;

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
		
		
	}

}
