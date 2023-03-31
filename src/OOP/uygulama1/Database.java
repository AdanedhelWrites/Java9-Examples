package OOP.uygulama1;

import java.util.Arrays;

public class Database {
	public static  Kullanici[] kullaniciListesi = new Kullanici[6];

	public static int index;

	public static void veriTabaniBaslangicDegerleri() {

		Kullanici kullanici1 = new Kullanici(index + 1, "Adanedhel", "adanedhel@hotmail.com", "123",
				"Selamlar,Ben Adanedhel");
		kullaniciListesi[index] = kullanici1;
		
		index++;
		Kullanici kullanici2 = new Kullanici(index + 1, "Turin", "turin@hotmail.com", "123", "Selamlar,Ben Turin");
		kullaniciListesi[index] = kullanici2;
		index++;
		Kullanici kullanici3 = new Kullanici(index + 1, "Turambar", "turambar@hotmail.com", "123","Selamlar,Ben Turambar");
		kullaniciListesi[index] = kullanici3;
		index++;
		
		
	}

	public static boolean kullaniciMevcutMu(String username, String sifre) {
		for (int i = 0; i < kullaniciListesi.length; i++) {
			if (kullaniciListesi[i] != null) {
				if (username.equals(kullaniciListesi[i].getUsername())
						&& sifre.equals(kullaniciListesi[i].getSifre())) {
					return true;
				}
			}
		}
		return false;

	}
	public static void KullaniciEkle(Kullanici kullanici) {		
		if (index >= kullaniciListesi.length-2) {
			arrayBoyutuArttir();
		}
		kullaniciListesi[index] = kullanici;
		index++;		
		
	}
	public static void arrayBoyutuArttir() {
		Kullanici [] temp = new Kullanici[kullaniciListesi.length+5];
		for (int i = 0; i < kullaniciListesi.length; i++) {		
			temp[i]=kullaniciListesi[i];
		}
		kullaniciListesi = temp;
	}
	public static void arrayBoyutuArttirma2() {
		Kullanici [] temp = Arrays.copyOf(kullaniciListesi, kullaniciListesi.length+5);
		kullaniciListesi = temp;
	}
		
	}
	

