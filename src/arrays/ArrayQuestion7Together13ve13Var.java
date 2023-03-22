package arrays;

public class ArrayQuestion7Together13ve13Var {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sayi = { 1, 13,13,13, 5, 1, 13, 1 };//13ten sonra 13 olursa
		int toplam=0;
		int toplam13=0;
		int sayac=0;
		//Öğrenci çözümü..
		//Bu bana yakın ama sonda 13 olursa patlıyor.
		for (int i = 0; i < sayi.length; i++) {
			toplam += sayi[i];
			if (sayi[i]==13) {
				toplam13 += sayi[i] + sayi[i+1];
				if (sayi[i] == 13 && sayi[i+1] == 13) {
					sayac++;
				}
			}			
		}
		System.out.println("********1.ÇÖZÜM BENİMKİNE BENZİYOR*****");
		System.out.println(toplam-toplam13+(sayac*13));
		System.out.println("************2.ÇÖZÜM*****************");
		int[] sayi2 = { 1, 13,13,13, 5, 1, 13, 1,13,13,13,13,5};//13ten sonra 13 olursa
		int sum=0;
		for (int i = 0; i < sayi2.length; i++) {
			if (sayi2[i] ==13) {
				if (sayi2.length>i+1 && sayi2[i+1]!=13) {
					i++;
				}
			}				
			else {
				sum+=sayi2[i];
			}			
		}
		System.out.println(sum);			
	}

}

