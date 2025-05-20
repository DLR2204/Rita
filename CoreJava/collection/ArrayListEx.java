package collection;

import java.util.ArrayList;

//List:- 
//1.Allowing duplicates
//
//2.Storing insertion order

public class ArrayListEx {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add(12);

		al.add(3.14f);

		al.add(true);

		al.add("apple");

		al.add('c');

		System.out.println(al);

		al.add(12);

		al.add(3.14f);

		al.add(true);

		System.out.println(al);

	}

}
