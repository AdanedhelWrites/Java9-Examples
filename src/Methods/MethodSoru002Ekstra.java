package Methods;

public class MethodSoru002Ekstra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *           * Bir metot yazalım bu metot dizi içindeki tek sayıları alıp başka
		 * bir tek boyutlu diziye atasın      * daha sonra başka bir metot üzerinden bu
		 * tek sayılar dizisini yazdıralım.
		 */
		int[][] matris = { { 56, 23, 678, 231, 5 }, { 234, 21, 78, 26, 6 }, { 654, 33, 32, 67, 2 },
				{ 189, 35, 56, 89, 8 } };

		int boyut = tekSayiAdeti(matris);
		int[] tekSayilar2 = tekSayilariAta(matris, boyut);
		for (int i : tekSayilar2) {
			if (i != 0) {
				System.out.println(i);
			}
		}
	}

	public static int tekSayiAdeti(int[][] matris) {
		int sayac = 0;
		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris[i].length; j++) {
				if (matris[i][j] % 2 == 0) {
					sayac++;
				}
			}
		}
		return sayac;
	}

	public static int[] tekSayilariAta(int[][] matris, int boyut) {
		int[] tekSayilar = new int[boyut]; // 4x5 = 20
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

}
