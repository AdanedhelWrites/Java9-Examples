package OOP.uygulama3;

import java.util.Scanner;

public class Sinav {
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
		sorular = new Soru[soruSayisi];
		for (int i = 0; i < soruSayisi; i++) {
			Soru soru=new Soru();
			soru.soruOlustur(cevapSecenekleri);
			soru.siraNo=i+1;
			sorular[i] = soru;
		}
		
		
	}
		
	

	

}