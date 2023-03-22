package arrays;

public class ArrayQuestion4Together {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sayilar = { 2, -256, 2, 129, 2, 2 };
		boolean kontrol = false;

		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i] == 2 && sayilar[i + 1] == 2) {
				kontrol = true;
				break;
			}

		}
		System.out.println(kontrol);
	}
}
