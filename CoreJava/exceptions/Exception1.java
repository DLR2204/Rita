package exceptions;

import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the numerator:- ");

		int num = scan.nextInt();

		System.out.print("Enter the denominator:- ");

		int den = scan.nextInt();

		try {

			int result = num / den;

			System.out.println("The division result is :- " + result);
		}

		catch (NullPointerException e) {
			System.out.println("Please don't enter 0 as the denominator");
		}
		
		finally {
			System.out.println("Im from the finally block");
		}

		System.out.println("The remaning 10000 lines");
	}

}
