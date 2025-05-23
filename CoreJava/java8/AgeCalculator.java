package java8;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		
		LocalDate bday = LocalDate.of(2017, 8, 15);
		
		Period p = Period.between(bday, today);
		
		System.out.printf("Your age is :- %d years %d months %d days",p.getYears(),p.getMonths(),p.getDays());
		
	}
}
