package OOP.uygulama3;

import java.util.Scanner;

public class Sinav {
	public String ders;
	public String konu;
	
	public String sinavAdi;	
	public int soruSayisi;
	public long suresi;
	public Soru[] sorular;
	public String[] cevaplar;
	public String[] cevapSecenekleri = { "A", "B", "C", "D" };// A,B,C,D	
	
	public void sinavOlustur() {
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen bir sistem konusu giriniz: ");
		this.sinavAdi=input.nextLine();
		System.out.println("Lütfen soru sayisini giriniz: ");
		this.soruSayisi=input.nextInt();input.nextLine();//enter hava kalmasın diye yapılan bir olay
		System.out.println("Lütfen sinav süresini giriniz: ");
		this.suresi=input.nextLong();input.nextLine();
		this.cevaplar = new String[sorular.length];
		sorular = new Soru[soruSayisi];
		for (int i = 0; i < soruSayisi; i++) {
			Soru soru=new Soru();
			soru.soruOlustur(cevapSecenekleri);
			soru.siraNo=i+1;
			sorular[i] = soru;
		}
		
		
		
	}
	public void cevaplariGir() {
		Scanner input = new Scanner(System.in);
		System.out.println("Ders: " + this.ders );
		System.out.println("Konu: " + this.konu );
		System.out.println("Sure: " + this.suresi );
		for (int i = 0; i < sorular.length; i++) {
			System.out.println(sorular[i].icerik);
			for (int j = 0; j < sorular[i].cevapIcerikleri.length; j++) {
				System.out.println(cevapSecenekleri[i] +"-)"+ sorular[i].cevapIcerikleri[j]);
			}
			System.out.println("Cevabinizi giriniz: A,B,C,D");
			cevaplar[i] = input.nextLine().toUpperCase();
		}
	}
	
	public void cevaplariKontrolEt() {
		int dogruSayisi=0;
		int puan=0;
		
		for (int i = 0; i < sorular.length; i++) {
			if (cevaplar[i].equals(sorular[i].dogruCevap)) {
				dogruSayisi++;
				puan +=sorular[i].puan;
			}
		}
		
		System.out.println("dogru cevap sayisi " + dogruSayisi);
		System.out.println("yanlış cevap sayisi " + (soruSayisi-dogruSayisi));
		System.out.println("puan " + puan);
	}
		
	

	

}