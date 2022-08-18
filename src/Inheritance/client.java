package Inheritance;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Case 1
		p obj1 = new p ();
		System.out.println(obj1.d);
		System.out.println(obj1.d1);
		obj1.fun();
		obj1.fun2();
		
		// Case 2
		p obj2 = new c ();
		obj2.fun();
		System.out.println(obj2.d);
		System.out.println(obj2.d1);
		System.out.println(((c)obj2).d2);
		obj2.fun();
		((c)obj2).fun1();
		obj2.fun2();
		

	}

}
