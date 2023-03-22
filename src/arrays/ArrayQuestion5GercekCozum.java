package arrays;

public class ArrayQuestion5GercekCozum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sayilar = { 1500, 120, 5, 85, -256, 16, 1258, -435, 148 };
		int toplam = 0;
		for (int i = 0; i < sayilar.length; i++) {
			toplam = toplam + sayilar[i];

			if (sayilar[i] % 2 == 0) {
				System.out.println("dizi[" + i + "]=" + sayilar[i] + " sayısı çiftdir.");
			} else {
				System.out.println("dizi[" + i + "]=" + sayilar[i] + " sayısı tekdir.");

			}

		}
		System.out.println("toplam= " + toplam);
	}
}
