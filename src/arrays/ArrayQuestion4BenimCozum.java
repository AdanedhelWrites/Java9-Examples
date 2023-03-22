package arrays;

public class ArrayQuestion4BenimCozum {
	
	public static void main(String[] args) {
		//  bir dizide ard arda gelen 2 indexdeki sayı değeri 2 ise true yazdırıp döngü
		//sonlansın yoksa false yazdıralım 
		int[] sayilar = { 2, -256, 2, 1258, 2, 2 };
		for (int i = 0; i < sayilar.length; i++) {
			
			if (sayilar[i] == sayilar[i+1]) {//BU NASIL BİR BUG
				System.out.println(true);
				break;
			}
				
				System.out.println(false);
			}
			
		}

	}


