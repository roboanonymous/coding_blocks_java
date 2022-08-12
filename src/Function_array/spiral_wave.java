package Function_array;
import java.util.*;
public class spiral_wave {
	
	public static void spiralprint(int [][] arr, int m, int n)
	{
		ArrayList <Integer> list = new ArrayList <>();
		
		int left  =0, top = 0, down = m-1, right = n-1;
		int x =0;
		while(left<=right && top <= down)
		{
			if (x==0)
			{
				for(int i= left; i <= right ; i++)
				{
					list.add(arr[top][i]);
				}
				top++;
			}
			
			else if (x==1)
			{
				for(int i= top; i <= down ; i++)
				{
					list.add(arr[i][right]);
				}
				right--;
			
			}
			
			else if (x==2)
			{
				for(int i= right; i >= left ; i--)
				{
					list.add(arr[down][i]);
				}
				down--;
				
			}
			
			
			if (x==3)
			{
				for(int i= right; i >= left ; i--)
				{
					list.add(arr[i][left]);
				}
				left++;
				
			}
			
			x++;
			x = x%4;
		}
		
		System.out.println(list);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner (System.in);
	int m = sc.nextInt();
	int n = sc.nextInt();
		
		int[][] arr = new int [m][n];
		for(int i=0; i<m; i++)
		{
			for(int j=0; j<n; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		
		
		spiralprint(arr , m, n);

	}

}
