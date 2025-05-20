package exceptions;

public class ThrowsEx {

	public static void div(int a, int b) throws ArithmeticException {
		System.out.println(a / b);
	}

	public static void main(String[] args) {

		div(4, 0);

	}

}
