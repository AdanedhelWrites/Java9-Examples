package stringler;

import java.util.Scanner;

public class YurtIciDisiIslemSinifla {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Iban giriniz: ");
		String iban = input.nextLine();
		
		
		if (iban.startsWith("TR")) {
			System.out.println("YURTİÇİ İŞLEMLER");
			if (iban.endsWith("5001")) {
				System.out.println("Ziraat Bankası");
				
			}else if (iban.endsWith("5002")) {
				System.out.println("Garanti");
				
			}else if (iban.endsWith("5003")) {
				System.out.println("İş Bankası");
				
			}else {
				System.out.println("Diğer");
			}
			
		}else if (iban.startsWith("OTH")) {
			System.out.println("YURTDIŞI İŞLEMLER");
			if (iban.endsWith("2000")) {
				System.out.println("KITA İŞİ İŞLEMLER");
				System.out.println(iban.replace("OTH", "Kİ"));
				
			}else if (iban.endsWith("2001")) {
				System.out.println("KITA DIŞI İŞLEMLER");
				System.out.println(iban.replace("OTH", "KD"));
				
			}		
			else {
				System.out.println("YURTDIŞI DİĞER");
			}
		}
		else {
			System.out.println("GEÇERSİZ IBAN");
		}
		input.close();
	}

}
