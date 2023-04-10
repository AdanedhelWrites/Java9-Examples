package OOP.uygulama7sepet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

enum Urun {
	Cips, Kola, Seker, Yag, Un, Ekmek, Cay, Yumurta, Yogurt, Sut
}

public class Sepet {
	private String sekil;
	private String boyut;

	List<String> urunler;
	List<String> sepet;
	static Scanner input = new Scanner(System.in);

	public Sepet() {
		this.urunler = new ArrayList<>();
		this.sepet = new ArrayList<>();
		urunleriOlustur();
	}

	public void urunleriOlustur() {
		for (Urun urun : Urun.values()) {
			urunler.add(urun.name());
		}
	}

	public void menu() {
		boolean devam = true;
		while(devam) {
			Scanner input = new Scanner(System.in);
			secenek();
			int secim = input.nextInt();
			switch (secim) {
			case 1:
				urunListele();
				break;
				
			case 2:
				urunEkle();
				break;
				
			case 3:
				sepetiGoster();
				break;
			case 0:
				System.out.println("Kapatiliyor..");
				devam = false;
			default:
				break;
			}
			
				
			}
		}

	

	private void sepetiGoster() {
		if (sepet.isEmpty()) {
			System.out.println("Sepetiniz bos");
		} else {
			int sayac = 1;
			for (String urun : sepet) {
				System.out.println(sayac + "-" + urun);
				sayac++;
			}
		}

	}

	private void urunEkle() {
		urunListele();
		System.out.println("Lutfen bir urun seciniz: ");
		int secim = Integer.parseInt(input.nextLine());
		if (!secimKontrol(secim)) {
			System.out.println("Yanlis bir deger girdiniz..");
		} else
			this.sepet.add(urunler.get(secim - 1));
	}

	public boolean secimKontrol(int secim) {
		boolean kontrol = false;
		if (secim > 0 && secim <= urunler.size()) {
			kontrol = true;
		} else
			kontrol = false;
		return kontrol;
	}

	private void urunListele() {
		int sayac = 1;
		for (String urun : this.urunler) {
			System.out.println(sayac + "-" + urun);
			sayac++;
		}

	}

	public void secenek() {
		System.out.println("1==> Urunleri Listele");
		System.out.println("2==> Urunleri Sepete Ekle");
		System.out.println("3==> Sepeti Göster");
	}

}
