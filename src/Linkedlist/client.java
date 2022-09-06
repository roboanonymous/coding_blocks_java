package Linkedlist;

public class client {

	public static void main (String[] args) throws Exception {
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
		System.out.println(ll.getNodeat(3));
		
		ll.addat(3, 70);
		ll.display();
		
		System.out.println(ll.removeFirst());
		ll.display();
		
		System.out.println(ll.removelast());
		
		System.out.println(ll.removeat(3));
		
		ll.display();
		
		ll.reversedata();
		ll.display();

	}

}
