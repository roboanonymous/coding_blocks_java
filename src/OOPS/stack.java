package OOPS;

public class stack {

	int [] data;
	int tos;
	
	public stack ()
	{
		data = new int [5];
		tos = -1;
		
	}
	
	public stack (int n)
	{
		data = new int [n];
		tos  = -1;
	}
	
	public void push(int a)
	{
		tos++;
		data[tos] = a;
	}
	
	public int pop()
	{
		int temp = data[tos];
		data[tos] = 0;
		tos--;
		
		return temp;
	}
	
	
	public int peek()
	{
		int temp = data[tos];
		return temp;
	}
	
	
	public int size()
	{
		int temp = tos +1;
		return temp;
	}
}
