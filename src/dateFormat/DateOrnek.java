package dateFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateOrnek {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		LocalDate date2 = LocalDate.now();
		System.out.println(date2);
		LocalDateTime date3 = LocalDateTime.now();
		System.out.println(date3);
		LocalDate date4 = LocalDate.of(2005, Month.MAY, 21);
		System.out.println(date4);
		System.out.println(date4.getDayOfMonth());
		System.out.println(date4.getEra());
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		String date5 = LocalDate.now().format(formatter);
		System.out.println(date5);
		String string = "10/04/2020";
		String string2 = "10/04/2020";
		String format2 = "dd/MM/yyyy";
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern(format2);
		LocalDate date6 = LocalDate.parse(string,formatter);
		System.out.println(date6);
		LocalDate date7 = LocalDate.parse(string,formatter2);
		System.out.println(date7);
		
		LocalDate date8 = LocalDate.now();
		
		LocalDate date9 = LocalDate.of(2023,03,03);
		long ay = date9.until(date8, ChronoUnit.MONTHS);
		long gun = date9.until(date8, ChronoUnit.DAYS);
		System.out.println(ay +" " +gun);
		long hafta = ChronoUnit.WEEKS.between(date9, date8);
		System.out.println(hafta);
		
		Period period = Period.between(date9, date8);
		System.out.println(period);
	}

}
