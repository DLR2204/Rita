package collection;

import java.util.LinkedHashSet;

//Set:-
//1.Not allows duplicates
//2.insertion order storing

public class LinkedHashSetEx {

	public static void main(String[] args) {

		LinkedHashSet lhs = new LinkedHashSet();

		lhs.add("apple");
		
		lhs.add(1);
		
		lhs.add('c');
		
		lhs.add(1234);
		
		lhs.add("hello");
		
		lhs.add(1232);

		lhs.add(3.14f);

		lhs.add(true);

		lhs.add("apple");

		lhs.add(1234);

		lhs.add(3.14f); 	

		lhs.add(true);
		
		for(Object rita:lhs) {
			System.out.println(rita);
		}
}
}