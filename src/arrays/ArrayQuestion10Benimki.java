package arrays;

public class ArrayQuestion10Benimki {

	public static void main(String[] args) {
		// Çarpım tablosu ama coklu diziyle
		System.out.println("//////////////////////////////////////");
		System.out.println("//////////////////////////////////////");
		System.out.println("/////////////INTEGER//////////////////");
		System.out.println("/////////////YAPILIŞI/////////////////");
		System.out.println("//////////////////////////////////////");
		System.out.println("//////////////////////////////////////");
		
		int[] tablo[] = new int[10][10];
		for (int i = 0; i < tablo.length; i++) {

			for (int j = 0; j < tablo[i].length; j++) {

				System.out.println((i + 1) + "x" + (j + 1) + "=" + ((i + 1) * (j + 1)));

			}
			System.out.println("*****************");
		}
		System.out.println("//////////////////////////////////////");
		System.out.println("//////////////////////////////////////");
		System.out.println("//////////////STRING//////////////////");
		System.out.println("/////////////YAPILIŞI/////////////////");
		System.out.println("//////////////////////////////////////");
		System.out.println("//////////////////////////////////////");

		String[] tablo2[] = new String[10][10];
		for (int i = 0; i < tablo2.length; i++) {
			for (int j = 0; j < tablo2[i].length; j++) {
				tablo2[i][j] = (i + 1) + "x" + (j + 1) + "=" + ((i + 1) * (j + 1));
			}

		}
		for (int i = 0; i < tablo2.length; i++) {
			for (int j = 0; j < tablo2[i].length; j++) {
				System.out.println(tablo2[i][j]);
			}
			System.out.println("******************************");

		}
		System.out.println("//////////////////////////////////////");
		System.out.println("//////////////////////////////////////");
		System.out.println("//////////////FOREACH/////////////////");
		System.out.println("/////////////YAZDIRIMI////////////////");
		System.out.println("//////////////////////////////////////");
		System.out.println("//////////////////////////////////////");
		for (String[] dizi : tablo2) {
			for (String eleman : dizi) {
				System.out.println(eleman);
				
			}			
			System.out.println("******************************");
		}
	}

}
