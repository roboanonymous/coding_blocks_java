package Strings;
import java.util.*;
public class ascii_diif {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String str = sc.nextLine();
		
		StringBuilder str2 = new StringBuilder ("");
		int n = str.length();
		int l = (2*n)-1;
		int count =0;
		for(int i=0; i<l; i++)
		{
			if(i%2 == 0)
			{
				str2.append(str.charAt(count));
				count++;
			}
			else
			{
				int temp = str.charAt(count) - str.charAt(count-1);
				str2.append(temp);
			}
		}
		
		
		System.out.println(str2);

	}

}
