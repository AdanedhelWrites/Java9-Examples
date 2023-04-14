package OOP.Setler.setOrnek2;

import java.util.Scanner;

/*
 * bir kullanici ismi , emaili ve sifresi olsun
 * 
 * daha sonra test sınıfında kullanıcıları tutalım
 * ve bu kullanıcılara yeni kullanıcı ekleyen method yazıcaz
 * ve aynı kullanıcı isimli biri daha önce eklenmisse bizden dogru veri gelene kadar veri almaya devam etsin
 * 
 */
public class Kullanici {
	String kullaniciAd;
	String email;
	String sifre;
	public Kullanici(String kullaniciAd, String email, String sifre) {
		super();
		this.kullaniciAd = kullaniciAd;
		this.email = email;
		this.sifre = sifre;
	}
	
	Scanner input = new Scanner(System.in);
	public String kullaniciEkle(String kullaniciAd) {	
		String kullaniciAdi;
		do {
			System.out.println("Kullanici adi giriniz: ");
			kullaniciAdi = input.nextLine();
			
		} while (kullaniciAdi == kullaniciAd);
		return this.kullaniciAd=kullaniciAdi;
			
		//DENEDİK EN AZINDAN UNLUCKY 
		
	}
	
	
	
}
