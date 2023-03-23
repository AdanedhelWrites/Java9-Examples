package arrays;

public class ArrayQuestion9BenimCozum {
	/*
	 *      * Bir başlangıç ve bitiş değeri arasında ki sıralı sayılardan eğer sayı
	 * 3 katı      * ise bilge 5 ise adam hem3 ve hem 5 ise bilgeadam yazdıralım int
	 * start=2; int      * end=22; çıktı
	 * [2,bilge,4,adam,bilge,7.......14,bilgeadam......bilge]      *       *      
	 */
	public static void main(String[] args) {
		int son = 30;
		int bas = 2;
		String[] dizi = new String[son - bas+1];

		for (int i = 0; i < dizi.length; i++) {
			int sayi = i + bas;
			if (sayi % 15 == 0) {

				dizi[i] = "Turin Turambar";
			} else if (sayi % 3 == 0) {
				dizi[i] = "Turin";
			} else if (sayi % 5 == 0) {
				dizi[i] = "Turambar";
			} else {
				dizi[i] = sayi+"";
			}

			
		}
		for (String string : dizi) {
			System.out.println(string);
			
		}

	}

}
