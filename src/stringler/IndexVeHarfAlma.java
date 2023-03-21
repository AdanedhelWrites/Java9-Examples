package stringler;

import java.util.Scanner;

public class IndexVeHarfAlma {

	public static void main(String[] args) {
		// Dışarıdan bir kelime alınız her harfin başına index numarası gelicek şekilde
		// yazdır
		Scanner input = new Scanner(System.in);
		System.out.println("Bir kelime giriniz: ");
		String a = input.next();
		for (int i = 0; i < a.length(); i++) {

			System.out.println(i + " " + a.charAt(i));
		}

		input.close();

	}

}
