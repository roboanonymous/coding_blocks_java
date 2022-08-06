package Function_array;

import java.util.*;

public class wave_print {
	
	public static void waveprint(int [][] arr)
	{
		ArrayList <Integer> list = new ArrayList <>();
		
		for(int i=0; i<4; i++)
		{
			
			if(i%2 == 0)
			{
				for(int j=0; j<4; j++)
				{
					list.add(arr[i][j]);
				}
			}
			
			else
			{
				for(int j=3; j>=0; j--)
				{
					list.add(arr[i][j]);
				}
			}
			
		}
		
		System.out.println(list);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int[][] arr = new int [4][4];
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<4; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		
		
		waveprint(arr);
	}

}
