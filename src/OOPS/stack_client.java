package OOPS;

public class stack_client {

	public static void main (String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		stack sk = new stack(4);
		sk.push(7);
		sk.push(9);
		
		sk.display();
		
		sk.push(10);
		sk.display();
		int a = sk.peek();
		System.out.println(a);
	}

}
