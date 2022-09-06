package Linkedlist;

import java.util.*;
public class mid_point {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList ll = new LinkedList();
		
		for(int i=1; i<10; i++)
		{
			ll.addlast(i*10);
		}
		
		ll.display();
		
		System.out.println(ll.midpoint());
		
	}

}
