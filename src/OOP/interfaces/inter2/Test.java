package OOP.interfaces.inter2;

public class Test {
/*
 * bir yukverme metodu olsun disaridan algimiz nesne bu metot icinde yuk alsin
 */
	public static void main(String[] args) {		
		Arac arac1 = new Otomobil();
		Arac arac2 = new Kamyon();
		
		Arac arac3 = new YolcuGemisi();
		Arac arac4 = new YukGemisi();
		
		Arac arac5 = new KargoUcagi();
		Arac arac6= new Helikopter();
		arac1.hizlan();
		arac2.hizlan();
		arac3.hizlan();
		arac4.hizlan();
		arac5.hizlan();
		kalkisIzniVer((Ucak)arac5);
		kalkisIzniVer((Helikopter)arac6);
		
		IHavaTasiti arac7 = new KargoUcagi();
		IHavaTasiti arac8= new Helikopter();
		
		IYuk arac9 = new Kamyon();
		kalkisIzniVer(arac7);
		kalkisIzniVer(arac8);
		yukVer(arac9);
	}
	public static void kalkisIzniVer(IHavaTasiti havaTasiti) {
		System.out.println("Kalkis izni verildi");
		havaTasiti.kalkisYap();
		
	}
	public static void yukVer(IYuk yukuver) {
		System.out.println("\nTasita yuk yuklenmistir.");
		yukuver.yukAl();
	}
	

}
