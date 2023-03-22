package arrays;

public class ArrayQuestion3Together {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] dizi = { 0, 120, 5, 85, -256, 16, 1258, 81, 148 };
		int max = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		for (int i = 0; i < dizi.length; i++) {
			if(dizi[i]>max) {
				max=dizi[i];
			}
		}
		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i]>max2 && dizi[i] < max) {
				max2=dizi[i];
			}
		}
		System.out.println("İkinci En Büyük Sayı: "+max2);
	}

}
