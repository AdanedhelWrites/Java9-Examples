package threadgiris.okulapp;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Utility {
	private static Scanner sc = new Scanner(System.in);
	/**
	 * 
	 * @param stringDate GUN/AY/YIL biciminde string deger giriyorsunz "dd/MM/yyyy"
	 * @return LocalDate turunde bir veri gelicek
	 */
	public static LocalDate stringToLocalDateDayMonthYear(String stringDate) {
		LocalDate date = null;
		try {
			String format = "dd/MM/yyyy";
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
			date = LocalDate.parse(stringDate,formatter);		
		} catch (Exception e) {
			System.err.println("Gecerli bir tarih formati kullaniniz !!! gun/ay/yil");
		}
		return date;			
	}
	/**
	 * 
	 * @param Kullanicidan gelicek olan stringDate'i GUN/AY/YIL biciminde string deger giriyorsunz "dd/MM/yyyy"
	 * @return LocalDate turunde bir veri gelicek
	 */
	
	public static LocalDate stringToLocalDateDayMonthYear() {
		System.out.println("Lutfen gun/ay/yil formatinda tarih giriniz: ");
		String stringDate = sc.nextLine();
		LocalDate date = null;
		try {
			String format = "dd/MM/yyyy";
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
			date = LocalDate.parse(stringDate,formatter);		
		} catch (Exception e) {
			System.err.println("Gecerli bir tarih formati kullaniniz !!! gun/ay/yil");
		}
		return date;			
	}
}
