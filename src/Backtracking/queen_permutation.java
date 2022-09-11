package Backtracking;

import javax.swing.Box;

public class queen_permutation {
	
	static int count =0;
	
	public static void QueenPermutation (boolean [] boxes , int qpsf , int tq, String ans)
	{
		if(qpsf == tq)
		{
			count++;
			System.out.println(count + ".  " +ans);
			return ;
		}
		for(int i=0 ; i< boxes.length; i++)
		{
			if(boxes[i] == false)
			{
				boxes[i] = true;
				QueenPermutation(boxes, qpsf+1, tq, ans + "q" + qpsf + "b" + i+ " ");
				boxes[i] = false;
			}
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueenPermutation(new boolean [4], 0, 2, "");
	}

}
