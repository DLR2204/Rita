package  oops;
class Parent5{
	
	public void display() {
		
		System.out.println("Iam from the parent class");
		
	}
	
	public void add(int a, int b) {
		System.out.println("The sum is :- "+(a*b));
	}
	
}

public class Child5 extends Parent5{
	
	public static void main(String[] args) {
		
		Child5 obj = new Child5();
		
		obj.display();
		
		obj.add(2, 5);
		
		
	}
	@Override
	public void add(int a, int b) {
		System.out.println("The sum is :- "+(a+b));
	}

}
