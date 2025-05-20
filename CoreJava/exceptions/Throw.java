package exceptions;

public class Throw {

	public static void check(int age) {
		if (age > 18) {
			System.out.println("You are eligible to vote");
		} else {
			throw new ArithmeticException();
		}

	}

	public static void main(String[] args) {
		
		check(12);

	}
}
