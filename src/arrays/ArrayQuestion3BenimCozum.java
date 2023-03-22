package arrays;

public class ArrayQuestion3BenimCozum {

	public static void main(String[] args) {
		// Dizide en büyük 2.sayıyı bulalım int[] sayilar = { 0, 120, 5, 85, -256, 16,
		// 1258, 81, 14 };
		int[] dizi = { 0, 120, 5, 85, -256, 16, 1258, 81, 148 };
		int max = dizi[0];
		int max2 = dizi[0];
		for (int i = 0; i < dizi.length; i++) {
			if (max <= dizi[i]) {
				max2 = max;
				max = dizi[i];

			} else if (dizi[i] > max2) {
				max2 = dizi[i];
			}

		}
		System.out.println("En buyuk ikinci sayi: " + max2);

	}
}


