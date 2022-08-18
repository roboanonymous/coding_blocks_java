package OOPS;

public class DynamicQueue extends queue {

	@Override
	public void enqueue(int n) throws Exception {
		
		if(isfull())
		{
            int [] na = new int [data.length*2];
			
			// copy the element
			
			for(int i=0; i<=size; i++)
			{
				int idx = (i+front) % data.length;
				
				na[i] = data[idx];
			}
			
			
			//referance to new array
			data = na;
			front =0;
		}
		
		super.enqueue(n);
	}
}
