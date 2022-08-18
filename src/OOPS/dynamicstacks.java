package OOPS;

public class dynamicstacks extends stack {
	
	@Override
	public void push(int a)throws Exception {
		
		if(isfull())
		{
			int [] na = new int [data.length*2];
			
			// copy the element
			
			for(int i=0; i<=tos; i++)
			{
				na[i] = data[i];
			}
			
			
			//referance to new array
			data = na;
		}
		
		super.push(a);
		
	}
	
	

}
