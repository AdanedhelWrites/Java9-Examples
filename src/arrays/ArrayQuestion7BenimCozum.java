package arrays;

public class ArrayQuestion7BenimCozum {

	public static void main(String[] args) {
		// TODO bir dizide 13 var ise 13 ve bir sonraki eleman toplama eklenmeden
		// toplam sonucunu bulun.
		int[] sayi = { 1, 13,1,13, 5, 1, 13, 1 };//13ten sonra 13 gelirse algoritma patlar. 13den sonra 13 gelince nolduguna dair sonraki soruya bak.
		int top = 0;
		int top2 = 0;
		for (int i = 0; i < sayi.length; i++) {
			top += sayi[i];
		}
		for (int i = 0; i < sayi.length; i++) {
			if (sayi[i] == 13) {
				top2 += sayi[i] + sayi[i + 1];
			}
		}
		System.out.println(top - top2);
	}

}
