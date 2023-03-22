package arrays;

public class ArrayQuestion6BenimCozum {

	public static void main(String[] args) {
		// dizi içerisinde 1 ve 4 sayısının adeti ve 4 sayısının adeti 1den kucukse true
		// yazsın
		int[] sayilar = { 1, 4, 5, 6, 1, 1, 4, 8 };
		int sayac = 0;
		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i] == 1) {
				sayac++;
			}
		}
		System.out.println(sayac);
		int sayac2 = 0;
		for (int j = 0; j < sayilar.length; j++) {
			if (sayilar[j] == 4) {
				sayac2++;
			}
		}
		System.out.println(sayac2);
		if (sayac2 > sayac) {
			System.out.println(true);
		} else
			System.out.println(false);
	}
}
