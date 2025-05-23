package intro;

public class StringEx {
	
	public static void main(String[] args) {
		
		String name1 = "apple";   //String literal
		
		name1.concat(" iphone");
		
		StringBuffer name2 = new StringBuffer("grapes");
		
		name2.append(" n fruits");
		
		StringBuilder name3 = new StringBuilder("kiwi");
		
		name3.append(" n pear");
		
		System.out.println(name1);
		
		System.out.println(name2);
		
		System.out.println(name3);
		
		
	}

}
