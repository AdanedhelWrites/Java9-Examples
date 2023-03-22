package arrays;

public class ArrayQuestion2BenimCozum {

	public static void main(String[] args) {
		// Dizide en büyük ve en küçük öğeyi bulma int[] sayilar = { 0, 120, 5, 85,
		// -256, 16, 1258, 81,14 };
		int[] dizi = { 0, 120, 5, 85, -256, 16, 1258, 81, 14 };
		int max = dizi[0];
		int min = dizi[0];
		//int min2 = Integer.MAX_VALUE;
		//int max2 = Integer.MIN_VALUE;
		for (int i = 0; i < dizi.length; i++) {
			if (max <= dizi[i]) {
				max = dizi[i];

			}

			if (min >= dizi[i]) {
				min = dizi[i];

			}

		}
		System.out.println("Min: " + min + "\n" + "Max: " + max);

	}

}
