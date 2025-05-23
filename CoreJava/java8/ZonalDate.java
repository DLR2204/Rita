package java8;

import java.time.ZoneId;
import java.time.ZonedDateTime;



public class ZonalDate {
	
	public static void main(String[] args) {
		
//		Set set  = ZoneId.getAvailableZoneIds();
//		
//		for(Object obj :set) {
//			System.out.println(obj);
//		}
		
		ZoneId zone = ZoneId.of("US/Eastern");
		
		ZonedDateTime time = ZonedDateTime.now(zone);
		
		System.out.println(time);
		
	}

}
