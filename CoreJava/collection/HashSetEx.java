package collection;

import java.util.HashSet;

//Set:-
//1.Not allows duplicates
//2.insertion order :- random order

public class HashSetEx {

	public static void main(String[] args) {

		HashSet hs = new HashSet();

		hs.add("apple");
		
		hs.add(1);
		
		hs.add('c');

		hs.add(1234);
		
		hs.add("hello");

		hs.add(3.14f);

		hs.add(true);

		hs.add("apple");

		hs.add(1234);

		hs.add(3.14f);

		hs.add(true);
		
		System.out.println(hs);

	}

}
