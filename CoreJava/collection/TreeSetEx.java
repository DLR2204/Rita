package collection;

import java.util.TreeSet;

//Set:-
//1.Not allows duplicates
//2.insertion order :- alphabetical/ascending order

public class TreeSetEx {
	
	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet();
		
		ts.add("banana");
		
		ts.add("cherry");
		
		ts.add("kiwi");
		
		ts.add("avacado");
		
		ts.add("pear");
		
		ts.add("mango");
		
		ts.add("grapes");
		
		
		for(Object obj :ts) {
			System.out.println(obj);
		}
	}

}
