package Function_array;
import java.util.*;

public class prime_visit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int t = sc.nextInt();
		for(int k=0; k<t; k++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			int count =0;
			for(int i=a; i<=b ; i++)
			{
				if(i ==1)
				{
					count++;
					continue;
				}
				for(int j=2; j<i; j++)
				{
					if(i%j == 0)
					{
						count++;
						break;
					}
				}
			}
			
			int ans  = b-a+1-count;
			System.out.println(ans);
			
		}
		

	}

}
