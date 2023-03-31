package OOP.uygulama1;

import java.util.Scanner;

public class Uygulama {
	static Scanner input = new Scanner(System.in);

	public static void menu() {
		System.out.println("----Ana Menuye Hosgeldiniz---");
		System.out.println("---Lutfen bir secim yapiniz----");
		System.out.println("1-Kayıt Ol");
		System.out.println("2-Giriş Yap");
		System.out.println("3-Kullanıcıları göster");
		System.out.println("4-Çıkış");
	}

	public static int sec() {
		System.out.println("Lutfen bir islem seciniz: ");
		String secim = input.nextLine();
		return Integer.parseInt(secim);
	}

	public void uygulamaBaslat() {
		int kontrol = 4;
		do {
			menu();
			kontrol = sec();
			switch (kontrol) {
			case 1:
				kayitOl();
				break;
			case 2:
				girisYap();
				break;
			case 3:
				kullanicilariGoster();
				break;
			case 4:

				System.out.println("HOSCAKAL");
				break;
			default:
				break;
			}

		} while (kontrol != 4);
	}

	public void girisYap() {
		System.out.println("Kullanici adi giriniz: ");
		String username = input.nextLine();
		System.out.println("Sifrenizi giriniz: ");
		String sifre = input.nextLine();
		boolean kontrol = Database.kullaniciMevcutMu(username, sifre);
		if (kontrol) {
			System.out.println("Giris Basarili");

		} else {
			System.out.println("Giris Basarisiz");
		}

	}

	public void kullanicilariGoster() {
		System.out.println("Kullanici Listesi");
		for (Kullanici kullanici : Database.kullaniciListesi) {
			if (kullanici != null) {
				System.out.println(kullanici.getUsername() + " " + kullanici.getIsim());
			}
		}

	}

	public static void kayitOl() {
		System.out.println("Lutfen username giriniz: ");
		String username = input.nextLine();
		System.out.println("Lutfen email giriniz: ");
		String email = input.nextLine();
		System.out.println("Lutfen sifre giriniz: ");
		String sifre = input.nextLine();
		System.out.println("Lutfen isim giriniz: ");
		String isim = input.nextLine();
		Kullanici kullanici = new Kullanici(Database.index + 1, isim, username, email, sifre);
		Database.KullaniciEkle(kullanici);
	}

}
