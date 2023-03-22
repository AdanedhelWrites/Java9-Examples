package arrays;

public class ArrayQuestion6Together {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sayilar = { 1, 4, 5, 6, 1, 1, 4, 8 };
		int adet1 = 0;
		int adet4 = 0;
		boolean kontrol = false;
		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i] == 1) {
				adet1++;
			} else if (sayilar[i] == 4) {
				adet4++;
			}
		}
		if (adet1 > adet4) {
			kontrol = true;
			System.out.println(kontrol);
		} else if (adet4 == adet1) {
			System.out.println("Eşittir");
		}
		System.out.println(kontrol);
		System.out.println("1 sayisi: " + adet1);
		System.out.println("4 sayisi: " + adet4);
	}

}
