package arrays;

public class ArrayQuestion8BenimCozum {

	public static void main(String[] args) {
		// TODO stringimiz bir array olucak
		//array elemanları 01-Adana; etc. etc.
		// ve arayimizi gezerken her şehir için çıktı alınacak DEVAM EDECEKTİR
		String sehirler = "01-Adana;02-Adıyaman;03-Afyonkarahisar;04-Ağrı;05-Amasya;06-Ankara;"
				+ "07-Antalya;08-Artvin;09-Aydın;10-Balıkesir;42-Konya";
			String [] dizi = sehirler.split(";"); // noktalı virgül görünce öncesini diziye atcak. 
			//DİZİYE BU ŞEKİLDE ATAMA YAPILDIGINI DÜŞÜNMÜYORDUM
			
			System.out.println("****************FOREACH SOLUTION****************");
			for (String eleman : dizi) {//FOREACH SOLUTION
				System.out.println(eleman);				
			}
			System.out.println("****************FOR SOLUTION*******************");
			for (int i = 0; i < dizi.length; i++) {//FOR SOLUTION
				System.out.println(dizi[i].substring(0, 2) + " plaka kodu " + dizi[i].substring(3) + " ilimize aittir.");
				
			}

			
			
				
				
			
			
	}

}
