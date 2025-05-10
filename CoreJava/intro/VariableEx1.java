package intro;

public class VariableEx1 {
	
	String name = "apple";    //instance g.v
	
	static String name1 = "orange";  //static g.v
	
	public static void main(String[] args) {
		
		VariableEx1 obj = new VariableEx1();  //object 
		
		System.out.println(obj.name);
		
		System.out.println(VariableEx1.name1);
		
		
	}

}
