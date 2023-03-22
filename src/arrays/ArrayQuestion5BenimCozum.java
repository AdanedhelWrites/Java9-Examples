package arrays;

import java.lang.reflect.Array;

public class ArrayQuestion5BenimCozum {

	public static void main(String[] args) {
		// bir dizideki tüm sayıların toplamı ve her sayı için bu sayı tektir ve ya
		// çifttir
		int[] dizi = { 1500, 120, 5, 85, -256, 16, 1258, -435, 148 };
		int top = 0;
		for (int i = 0; i < dizi.length; i++) {
			top += Array.getInt(dizi, i);
			if (top % 2 == 0) {
				System.out.println("Bu sayi çifttir: " + top);

			} else {

				System.out.println("Bu sayi tektir: " + top);
			}
		}
		
	}

}
