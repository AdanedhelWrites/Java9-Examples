package arrays;

import java.util.Scanner;

public class ArrayQuestion1BenimCozum {

	public static void main(String[] args) {
		// Kullanıcıdan bir ülke ismi alıp bu olup olmadığını kontrol edelim..
		// Ülke dizide yoksa girdiğiniz ülke yoktur yazalım
		String[] dizi = { "Türkiye", "Japonya", "Moğolistan", "Fransa", "Danimarka", "Norveç" };
		Scanner input = new Scanner(System.in);
		System.out.println("Bir ülke giriniz: ");
		String ulke = input.next();
		for (int i = 0; i < dizi.length; i++) {
			if (ulke.equalsIgnoreCase(dizi[i])) {
				System.out.println("Ülke Bulundu");
				break;
			} else {
				if (i == dizi.length - 1) {
					System.out.println("Ülke yok");
				}
			}
		}

		input.close();

	}

}
