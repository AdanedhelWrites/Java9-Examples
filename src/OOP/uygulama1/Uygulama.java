package OOP.uygulama1;

public class Uygulama {
	public static void main(String[] args) {
		
		Kullanici[] dizi = Database.kullaniciListesi;
		Database.veriTabaniBaslangicDegerleri();
		for (Kullanici kullanici : dizi) {
			if (kullanici != null) {
				System.out.println(kullanici.username);
			}
		}
		
	}
}
