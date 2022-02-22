package Java10_EX;

import java.time.*;
import java.time.temporal.*;

public class Exercise10_4 {

	public static void main(String[] args) {
		LocalDate birthDay = LocalDate.of(1992, 03, 04);
		LocalDate now = LocalDate.now();
		
		long days = birthDay.until(now, ChronoUnit.DAYS);
		System.out.println("birth day = " + birthDay);
		System.out.println("today     = " + now);
		System.out.println("days      =  " + days);
	}

}
