package Function_array;
import java.applet.*;
import java.util.ArrayList;
import java.util.Scanner;

public class column_wave_print {

	public static void waveprints(int [][] arr)
	{
		ArrayList <Integer> list = new ArrayList <>();
		
		for(int j=0; j<4; j++)
		{
			
			if(j%2 == 0)
			{
				for(int i=0; i<4; i++)
				{
					list.add(arr[i][j]);
				}
			}
			
			else
			{
				for(int i=3; i>=0; i--)
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
		
		
		waveprints(arr);
	}


}
