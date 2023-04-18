package OOP.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchOrnek {
	/*
	 * bolme metodu oluşturalım 2 tane sayı alalım ve bir hata varsa yakalayıp hata
	 * mesajı yazalım
	 * 
	 * metodumuz bizden dogru sonuc alana kadar calissin bir döngü kuracagız ve bu
	 * döngü bizden 2. degeri 0 aldıkca tekrar calıssın
	 * 
	 */
	public static void main(String[] args) {

//		try {
//			bolmem();
//
//		} catch (ArithmeticException e) {
//			// e.printStackTrace();
//
//			System.err.println("sayi 0'a bolunemez" + e.getMessage());
//		} catch (InputMismatchException e) {
//			// TODO: handle exception
//			System.err.println("Lutfen sadece sayi giriniz");
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.err.println("Bir hata olustu !!" + e.getMessage());
//		}
		bolme();

	}

	public static void bolmem() {

		Scanner input = new Scanner(System.in);
		System.out.println("1. sayi girin: ");
		int sayi1 = input.nextInt();
		input.nextLine();
		System.out.println("Kaca bolelim?");
		int sayi2 = input.nextInt();
		input.nextLine();
		int bolum = sayi1 / sayi2;
		System.out.println(bolum);
	}

	public static double bolme() {
		Scanner scanner = new Scanner(System.in);
		boolean kontrol = false;
		double sonuc = 0;
		do {
			try {
				System.out.println("Lütfen 1.sayıyı giriniz");
				int sayi1 = scanner.nextInt();
				System.out.println("Lütfen 2.sayıyı giriniz");
				int sayi2 = scanner.nextInt();
				sonuc = (sayi1 / sayi2);
				System.out.println(sonuc);
				kontrol = false;
			} catch (ArithmeticException e) {
				System.out.println("2.sayıyı sıfır girdniz" + e.getMessage());
				e.printStackTrace();
				kontrol=true;
			} catch (InputMismatchException ex) {
				System.out.println("Lütfen sadece sayı giriniz" + ex.getMessage());
				kontrol=true;
			} catch (Exception e) {
				System.out.println("Bir hata olustu:");
				kontrol=true;
			}finally {
				scanner.nextLine();
			}
		}while (kontrol);
		return sonuc;
		
	}
}
