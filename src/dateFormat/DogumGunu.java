package dateFormat;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DogumGunu {

	public static void main(String[] args) {
		String dogumGunu= "24/04/1962";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");		
		LocalDate dogumGunum = LocalDate.parse(dogumGunu, formatter);
		
		LocalDate suan = LocalDate.now();
		
		long ay = dogumGunum.until(suan, ChronoUnit.MONTHS);
		long yil = dogumGunum.until(suan, ChronoUnit.YEARS);
		long hafta = dogumGunum.until(suan, ChronoUnit.WEEKS);
		long gun = dogumGunum.until(suan, ChronoUnit.DAYS);
		System.out.println(gun + " Gun\n"+ ay + " Ay\n"+ yil + " Yil\n" + hafta + " hafta olmustur." );
	}

}
