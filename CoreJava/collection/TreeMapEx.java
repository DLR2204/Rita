package collection;

import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {

		TreeMap tm = new TreeMap();

		tm.put(100, "Ramesh");

		tm.put(103, "Naresh");

		tm.put(102, "Mahesh");

		tm.put(104, "Suresh");
		
		tm.put(100, "Ramesh");

		tm.put(103, "Naresh");

		tm.put(102, "Mahesh");

		tm.put(104, "Suresh");

		System.out.println(tm);
	}

}
