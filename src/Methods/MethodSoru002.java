package Methods;

public class MethodSoru002 {

	public static void main(String[] args) {
		/*
		 *           * Bir metot yazalım bu metot dizi içindeki tek sayıları alıp başka
		 * bir tek boyutlu diziye atasın      * daha sonra başka bir metot üzerinden bu
		 * tek sayılar dizisini yazdıralım.
		 */
		int[][] matris = { { 56, 23, 678, 231, 5 }, { 234, 21, 78, 26, 6 }, { 654, 33, 32, 67, 2 },
				{ 189, 35, 56, 89, 8 } };
		int[] tekSayilar2 = tekSayilariAta(matris);
		arrayYazdir(tekSayilar2);
		System.out.println(tekSayilar2);
	}

	public static int[] tekSayilariAta(int[][] matris) {
		int[] tekSayilar = new int[matris.length * matris[0].length]; // 4x5 = 20
		int sayac = 0;
		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris[i].length; j++) {
				if (matris[i][j] % 2 == 1) {
					tekSayilar[sayac] = matris[i][j];
					sayac++;
				}
			}
		}
		return tekSayilar;
	}

	public static void arrayYazdir(int[] array) {
		for (int tekSayi : array) {
			if (tekSayi != 0) {

				System.out.println(tekSayi);
			}

		}
	}

}
