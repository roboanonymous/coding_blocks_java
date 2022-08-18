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
		
		dynamicstacks sk2 = new dynamicstacks();
		sk2.push(10);
		sk2.push(20);
		sk2.push(30);
		sk2.push(40);
		sk2.push(50);
		sk2.push(60);
		
		sk2.display();
		System.out.println(sk2.size());
		
	}

}
