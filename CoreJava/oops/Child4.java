package oops;

public class Child4 implements Calculator{

	@Override
	public void add(int a, int b) {
		System.out.println("The sum is :-" +(a+b));
		
	}

	@Override
	public void sub(int a, int b) {
		System.out.println("The sub is :-" +(a-b));
		
	}

	@Override
	public void div(int a, int b) {
		System.out.println("The div is :-" +(a/b));
		
	}

	@Override
	public void mul(int a, int b) {
		System.out.println("The mul is :-" +(a*b));
		
	}

}
