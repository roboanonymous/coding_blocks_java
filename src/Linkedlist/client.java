package Linkedlist;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList ();
		
		ll.addlast(10);
		ll.addlast(20);
		ll.addlast(30);
		ll.addlast(40);
		ll.addlast(50);
		ll.addfirst(60);
		
		ll.display();
		
		System.out.println(ll.getfirst());
		System.out.println(ll.getlast());
		System.out.println(ll.getat(3));

	}

}
