package collection;

import java.util.LinkedList;

public class LinkedListEx {
	
	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		
		ll.add(12);

		ll.add(3.14f);

		ll.add(true);

		ll.add("apple");

		ll.add('c');

		System.out.println(ll);

		ll.add(12);

		ll.add(3.14f);

		ll.add(true);

		System.out.println(ll);
	}

}
