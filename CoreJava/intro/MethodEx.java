package intro;

public class MethodEx {
	
	public String hi() {						//string -dynamic
		return "Hi, Iam from the hi method";
	}
	
	public static int add(int a,int b) {				//int-static
		return (a+b);
	}
	
	
	public void display() {						//void-dynamic
		
		System.out.println("Iam from the display method");
	}
	
	public static void main(String args[]) {	//void-static
		
		MethodEx obj = new MethodEx();
		
		obj.display();
		
		System.out.println(obj.hi());
		
		System.out.println(add(23,34));
		
		
	}
	

}
