package java8;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		
		Date date1 = new Date();
		
		System.out.println(date1);
		
		LocalDate date2 =  LocalDate.now();
		
		System.out.println(date2);
		
		LocalTime time = LocalTime.now();
		
		System.out.println(time);
		
		
	}
}
