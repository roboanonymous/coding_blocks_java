package Strings;
import java.util.*;
public class magical_park {
	
	public static void magical(int n, int m , int k, int s, char[][] arr)
	{
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
				if(k > s)
				{
					System.out.println("No");
					System.exit(0);
				}
				if(arr[i][j] == '.')
				{
					s = s-2;
				}
				
				else if (arr[i][j] == '*')
				{
					s = s+5;
				}
				
				else
				{
					break;
				}
				
				
				if(j < m-1)
				{
					s = s-1;
				}
				
				
			}
			
		}
		
		if(k > s)
		{
			System.out.println("No");
		}
		
		else {
			System.out.println("Yes");
			System.out.println(s);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int s = sc.nextInt();
		
		char[][] arr = new char [n][m];
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
				arr[i][j] = sc.next().charAt(0);
			}
		}
		
		magical(n,m,k,s,arr);
		
	}

}
