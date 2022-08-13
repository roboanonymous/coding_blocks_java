package Function_array;
import java.util.*;
public class linear_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [] arr = new int[n];
		
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int start = 0, mid = 0, last = n-1;
		
		while(mid <= last)
		{
			if(arr[mid] == 0)
			{
				int temp = arr[mid];
				arr[mid] = arr[start];
				arr[start] = temp;
				start++;
				mid++;
				
			}
			
			else if(arr[mid] == 1)
			{
				mid++;
			}
			
			else
			{
				int temp = arr[mid];
				arr[mid] = arr[last];
				arr[last] = temp;
				last--;
			}
			
		}
		

		for(int i=0; i<n; i++)
		{
			System.out.println(arr[i]);
		}
		

	}

}
