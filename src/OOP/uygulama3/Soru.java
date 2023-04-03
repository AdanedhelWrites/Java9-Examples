package OOP.uygulama3;

import java.util.Scanner;

public class Soru {
	public int puan;
	public int siraNo;
	public String icerik;
	public String dogruCevap;// A,B,C,D
	public String[] cevapIcerikleri; // ===> a)Türkiyenin başkenti ankaradır

	public void soruOlustur(String[] cevapSecenekleri) {
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen soru içeriği giriniz: ");
		this.icerik = input.nextLine();
		cevapIcerikleri = new String[cevapSecenekleri.length];// 4

		for (int i = 0; i < cevapSecenekleri.length; i++) {
			System.out.println("Lütfen" + cevapIcerikleri[i] + "seceginin icerigini giriniz: ");
			cevapIcerikleri[i]=input.nextLine();
		}
		System.out.println("Sorunun dogru cevabini belirleyiniz: ");
		this.dogruCevap=input.nextLine();
		System.out.println("Sorunun puanini giriniz: ");
		this.puan=input.nextInt();input.nextLine();
	}

	@Override
	public String toString() {
		return "Soru [puan=" + puan + ", siraNo=" + siraNo + ", icerik=" + icerik + "]";
	}
	
}
