package OOP.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchOrnek2 {
	/*
	 * bir metot ile dısarıdan bir index alalım sonra o indexteki değeri yazdıralım
	 * hata var try catchlede yakalıyalım
	 * array uzerinde gezerken toplayabildigimiz degerleri toplama ekleyelim
	 * bir sayac ile hata sayisini tutalim ve döngü sonunda da toplamı ve hata sayısını yazdıralım
	 */

	public static void main(String[] args) {
		String[] array = {"a","30","20",null,"abc","50"};
		//yakala(array);
		//toplam(array);
		//toplam2(array);
		for (String string : array) {
			try {
				nullCheck2(string);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e.toString());
				
			}
		}
		for (String string : array) {
			nullCheck3(string);
		}
	}
	
	public static void yakala(String[]arr) {
		Scanner input = new Scanner(System.in);
		System.out.println("Istediginiz indexi giriniz: ");
		try {
			int a = input.nextInt();input.nextLine();
			System.out.println("girdiginiz index ==> "+ arr[a]);
			
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Girdiginiz index degeri dizi boyutu disindadir lutfen 0 ile " + arr.length +" arasinda sayi giriniz..");
			// TODO: handle exception
			System.out.println(e.toString());
		}catch (InputMismatchException ex) {
			
			System.out.println("Lutfen bir sayi degeri giriniz..");
		}
		finally {
			input.close();
		}
	}
//		for (int i = 0; i < arr.length; i++) {
//			if (i == a) {
//				System.out.println(arr[i]);
//			}
//		}
	public static void toplam(String[] arr) {
		int sayac = 0;
		int sayac2 =0;
		int top=0;
		for (String string : arr) {
			try {
				top += Integer.parseInt(string);				
				
				
			} catch (NumberFormatException e) {
				System.out.println(e.toString());
				sayac++;
			}			
		}
		System.out.println(sayac + " tane hata cikti");
		System.out.println("Toplamlar " + top);
//		boolean kontrol = false;
//		do {
//			try {
//				for (int i = 0; i < arr.length; i++) {
//					Integer.parseInt(i);
//					top += i;
//				}
//				System.out.println(top);
//				
//			} catch (Exception e) {
//				// TODO: handle exception
//				sayac++;
//				kontrol=true;
//			}
//			
//		} while (kontrol);
//		System.out.println(sayac + " tane hata cikti");
//		System.out.println("Toplamlar " + top);
	}
	public static String nullCheck(String string) {
		if (string == null) {
			throw new NullPointerException();
		}
		return string;
		
		}
	public static void toplam2(String[] arr) {
		int sayac = 0;
		
		int top=0;
		for (String string : arr) {
			try {
				string=nullCheck(string);
				top += Integer.parseInt(string);
				
				
				
			} catch (NumberFormatException e) {
				System.out.println(e.toString());
				sayac++;
			}catch (Exception e) {
				// TODO: handle exception
				System.out.println("Baska hata: " +e.toString());
				sayac++;
			}		
		}
		System.out.println(sayac + " tane hata cikti");
		System.out.println("Toplamlar " + top);
	}
	public static String nullCheck2(String string) throws Exception{//checked exception'dir
		if (string == null) {
			throw new NullPointerException();
		}
		return string;
		
		}
	public static String nullCheck3(String string) throws NullPointerException{//Unchecked exception'dir
		if (string == null) {
			throw new NullPointerException();
		}
		return string;
		
		}
}


