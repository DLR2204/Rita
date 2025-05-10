package intro;

public class VariableEx3 {
	
	static String nationality;   //static g.v
	
	int aadhar;  //instance g.v
	
	public void display() {
		System.out.println("Nationality:- "+nationality);
		
		System.out.println("Aadhar:- "+aadhar);
	}
	
	public static void main(String[] args) {
		
		VariableEx3 ramesh  = new VariableEx3();
		
		VariableEx3 suresh  = new VariableEx3();
		
		VariableEx3 naresh  = new VariableEx3();
		
		ramesh.aadhar= 100;suresh.aadhar=200;naresh.aadhar=300;
		
		ramesh.nationality= "Indian";
		
		System.out.println("Ramesh:- ");
		ramesh.display();
		System.out.println();
		System.out.println("Suresh:- ");
		suresh.display();
		System.out.println();
		System.out.println("Naresh:- ");
		naresh.display();
		
		
		
		
		
	}

}
