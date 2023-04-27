package dateFormat.faturaodeme;
/*
 * Bir alisveris tarihimiz olsun
 * daha sonra birde her ayin 15i bizim fatura kesim tarihimiz olsun
 * 
 * 1 - Alısveris tarihi fatura tarihinden önce mi sonra mı kontrolu
 */

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;


public class SiparisGunu {
	public static void main(String[] args) {
		LocalDate alisverisTarihi = LocalDate.of(2023, Month.MAY, 21);
		LocalDate faturaKesim = LocalDate.ofYearDay(alisverisTarihi.getYear(), 15);
		
		int fGun = faturaKesim.getDayOfMonth();
		int aGun = alisverisTarihi.getDayOfMonth();
		if (fGun > aGun) {
			System.out.println(fGun - aGun + " gun sonra faturaniz kesilcek");			
		}
		else
			System.out.println(aGun - fGun + " fatura kesim tarihini geçirdiniz");			
		
		LocalDate alisverisTarihim = alisverisTarihiAl();
		LocalDate faturaTarihi = LocalDate.of(alisverisTarihim.getYear(),alisverisTarihim.getMonth(), 15);
		faturaTarihKontrol(alisverisTarihim, faturaTarihi);
		
	}
	
	public static LocalDate alisverisTarihiAl() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Lutfen fatura tarihi gir (yil-ay-gun)");
		String tarih = sc.nextLine();
		
		return LocalDate.parse(tarih);
		
	}
	public static void faturaTarihKontrol(LocalDate alisVerisTarihi,LocalDate faturaTarihi) {
		if (alisVerisTarihi.isBefore(faturaTarihi)) {
			System.out.println("Fatura tarihine daha var");
		}else if (alisVerisTarihi.isEqual(faturaTarihi)) {
			System.out.println("Fatura tarihi bugun");
		}else {
			System.out.println("Fatura tarihi gecmis");
			faturaTarihi.plusMonths(1);
			long kalanGun = ChronoUnit.DAYS.between(faturaTarihi, alisVerisTarihi);
			System.out.println(kalanGun + " gun gecmis");
		}
			
	}
	
}
