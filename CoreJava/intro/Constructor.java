package intro;

public class Constructor {
	
	public Constructor() {  //default constr
		System.out.println("Iam from the default constructor");
	}

	public Constructor(String name) {  //parametrized constr
		
		System.out.println("My name is :- "+name);
	}
	
	public static void main(String[] args) {
		
		Constructor obj = new Constructor("Rita");	//calling constru
		
	}
}
