package OOP.uygulama1;

public class Database {
	public static Kullanici[] kullaniciListesi = new Kullanici[6];
	public static int index;
	
	
	public static void veriTabaniBaslangicDegerleri() {		
		Kullanici kullanici1=new Kullanici(index+1, "Adanedhel", "adanedhel@hotmail.com", "123", "Selamlar,Ben Adanedhel");
		kullaniciListesi[index] = kullanici1;
		index++;
		Kullanici kullanici2=new Kullanici(index+1, "Turin", "turin@hotmail.com", "123", "Selamlar,Ben Turin");
		kullaniciListesi[index] = kullanici2;
		index++;
		Kullanici kullanici3=new Kullanici(index+1, "Turambar", "turambar@hotmail.com", "123", "Selamlar,Ben Turambar");
		kullaniciListesi[index] = kullanici3;		
		index++;
		
		
	}
}
