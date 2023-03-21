package arrays;

import java.util.Scanner;

public class ArrayQuestion1Sinifta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] dizi = { "Türkiye", "Japonya", "Moğolistan", "Fransa", "Danimarka", "Norveç" };
		Scanner input = new Scanner(System.in);
		System.out.println("Bir ülke giriniz: ");
		String ulke = input.next();
		boolean kontrol = false;

		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i].equalsIgnoreCase(ulke)) {
				System.out.println("Ülke bulundu");
				kontrol = true;
				break;

			}

		}
		if (kontrol == false) {
			System.out.println("Böyle bir ülke yok");

		}
		System.out.println("******** --ÇÖZÜM 2-- *********");
		String kontrol2 = "Girdiginiz ülke yok";
		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i].equalsIgnoreCase(ulke)) {
				kontrol2 = "Girdiğiniz ülke bulundu";
				break;

			}
		}
		System.out.println(kontrol2);
		input.close();
	}

}
