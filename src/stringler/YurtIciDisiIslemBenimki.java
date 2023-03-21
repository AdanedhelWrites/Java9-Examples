package stringler;

import java.util.Scanner;

public class YurtIciDisiIslemBenimki {

	public static void main(String[] args) {
		/*
		 * Dışarıdan bir ıban değeri girelim TR 1001005001 ,TR 1001005002 veya OTH
		 * 2002002000 gibi daha sonra bu değerleri kontrol edelim eğer Tr ile başlıyorsa
		 * yurt içi işlemler yazsın ve Eğer 5001 ile Bitiyorsa Ziraat 5002 ile bitiyorsa
		 * Garanti 5003 ile bitiyorsa İş bankası yazdırsın eğer OTH ise Yurt dışı
		 * işlemler yazdıralım 2000 ile bitiyorsa kıta içi işelmeler ve OTH yerine  Ki
		 * 200200… değilse kıta dışı işlemler yazsın ve OTH yerine Kd 200201…
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("IBAN numaranızı giriniz: ");
		String iban = input.next();

		if (iban.contains("TR")) {
			System.out.println("Yurtiçi işlemlere Hoşgeldiniz");
			if (iban.endsWith("5001")) {

				System.out.println("Ziraat");
			} else if (iban.contains("5002")) {
				System.out.println("Garanti");

			} else if (iban.contains("5003")) {
				System.out.println("İş bankası");
			} else {
				System.out.println("Geçerli bir IBAN değildir.");
			}

		} else if (iban.contains("OTH")) {
			if (iban.endsWith("2000")) {
				System.out.println("Kıta içi işlemler");
				if (iban.length() - 1 == 0) {

					System.out.println(iban.replace("OTH", "Kİ"));
				}

			}

			else if (iban.endsWith("2001")) {

				System.out.println("Kıta dışı işlemler");

				System.out.println(iban.replace("OTH", "KD"));
			}
			else {
				System.out.println("Diğer bölge");
			}

		} else {
			System.out.println("Geçersizdir");
		}
		input.close();
	}
}
