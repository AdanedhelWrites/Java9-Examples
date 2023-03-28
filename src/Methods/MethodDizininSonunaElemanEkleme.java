package Methods;

import java.util.Arrays;

public class MethodDizininSonunaElemanEkleme {

	public static void main(String[] args) {
		
		int dizi [] = {1,5,7};
		
		
		dizi = diziyeElemanEkle(dizi,65);
		
		System.out.println(Arrays.toString(dizi));
	}

	private static int[] diziyeElemanEkle(int[]dizi,int i) {
		int[] yeniDizi = null;
		yeniDizi = new int[dizi.length+1];
		for (int j = 0; j < dizi.length; j++) {
			yeniDizi[j] = dizi[j];
			
		}
		yeniDizi[yeniDizi.length-1] = i;		
		
		return yeniDizi;
	}

}
