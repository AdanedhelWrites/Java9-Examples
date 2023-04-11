package OOP.collections;

import java.text.Collator;
import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;


import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/*
 * 1-Sehir sinifimiz olucak ==> isim,plakaKodu, nufüs
 * 2- Uygulama sinifinda sehirleri olustur diye bir metod olsun, bu metod iller arrayindeki sehirleri alarak herberinden birer sehir nesnesi yaratalim
 * ve bunlari listeye ekliyelim.
 * Sehir sinifinda bir metot olsun plaka kodlarini bizim icin olustursun
 * 
 * 3- Disaridan girilen ve harfle baslayan illeri donduren metod yazalim
 * 
 * 4- nufusa gore sıralama
 * 
 * 5- isme gore sirala
 * 
 * 6- Listemin son 10 degeri
 * 
 * 7- Comparable kullanarak plakaya gore sirala
 */
public class Uygulama{
	ArrayList<Sehir> sehirler = new ArrayList<>();
	public static void main(String[] args) {
		Uygulama uyg = new Uygulama();
		uyg.sehirleriOlustur();		
		List<Sehir> yeniSehirListe = uyg.sehirler.subList(uyg.sehirler.size()-10,uyg.sehirler.size());
		System.out.println("************");
		for (Sehir seh5 : yeniSehirListe) {
			System.out.println(seh5);
		}
		System.out.println("************");
		uyg.ismeGore(uyg.sehirler);
		Collections.shuffle(uyg.sehirler);
		
		System.out.println("************");
		Collections.sort(uyg.sehirler);
		
		
		
		System.out.println("************");
		for (Sehir sehir : uyg.sehirler) {
			System.out.println(sehir);
		}	
		System.out.println("************");
		for (Sehir seh : uyg.harfleBaslayan()) {
			System.out.println(seh);
		}
		System.out.println("************");
		for (Sehir seh : uyg.nufusaGore(uyg.sehirler)) {
			System.out.println(seh);
		}
		System.out.println("************");
		for (Sehir seh4 : uyg.ismeGore(uyg.sehirler)) {
			System.out.println(seh4);
		}
				
	}
	public ArrayList<Sehir> harfleBaslayan() {
		ArrayList<Sehir> sehirListesi = new ArrayList<>();
		System.out.println("Bulmak istediginiz sehirlerin bas harfi");
		Scanner input = new Scanner(System.in);
		String harf = input.nextLine().toUpperCase();
		for (int i = 0; i < sehirler.size(); i++) {
			if (sehirler.get(i).getIsim().startsWith((harf.charAt(0) + ""))) {
				sehirListesi.add(sehirler.get(i));
			}
		}
		return sehirListesi;
				
	}
	
	public void  sehirleriOlustur() {
		for (int i = 0; i < SehirDatabase.iller.length; i++) {
			String sehirIsim = (SehirDatabase.iller[i]);
			Sehir sehir = new Sehir(sehirIsim);
			sehir.setPlakaKodu(sehir.plakaKoduUret(i));
			
			sehirler.add(sehir);
		}
		System.out.println(sehirler);

	}
	public ArrayList<Sehir> nufusaGore(ArrayList<Sehir> liste) {
		Comparator<Sehir> comparator = new Comparator<Sehir>() {
			
			@Override
			public int compare(Sehir o1, Sehir o2) {
				
				return o1.getNufus() - o2.getNufus();
			}
		};
		Collections.sort(liste,comparator);
		return liste;
	}
	public List<Sehir> ismeGore(List<Sehir> liste){
		Collator collator = Collator.getInstance(Locale.getDefault());
		Comparator<Sehir> comparator = new Comparator<Sehir>() {

			@Override
			public int compare(Sehir o1, Sehir o2) {
				
				return collator.compare(o1.getIsim(), o2.getIsim());
			}
		};
		Collections.sort(liste,comparator);
		return liste;
	}
	
		
		
	
	
}
