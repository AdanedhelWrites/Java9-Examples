package OOP.Setler.setOrnek1;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;
import java.util.TreeSet;
/*
 * Film kategorisi ekle diye bir method olsun
 * String olarak aldıgı kategoriyi bir sete eklesin
 * eger daha önce eklenmissi bu kategori daha önce eklenmistir
 */
public class SetOrnek {
	Set<String> kategoriler = new TreeSet<>();
	Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		SetOrnek ornek = new SetOrnek();
		ornek.filmKategorisiEkle2();
		ornek.filmKategorisiEkle2();
		ornek.filmKategorisiEkle2();
		ornek.filmKategorisiEkle2();
		ornek.kategoriler.forEach(System.out::println);
	}
	public void filmKategorisiEkle() {
		System.out.println("Lutfen bir kategori giriniz: ");
		String kategori = input.nextLine();
		if (kategoriler.contains(kategori)) {
			System.err.println("Bu kategori daha once eklenmis!!");
		}else
			kategoriler.add(kategori);
			System.out.println("Basariyle eklenmistir");
	}
	public void filmKategorisiEkle2() {
		System.out.println("Lutfen bir kategori giriniz: ");
		String kategori = input.nextLine();
		if (kategoriler.add(kategori)) { // BİRŞEY EKLEYEBİLİYORSAK TRUE DÖNER EKLEYEMEZSEK FALSE DÖNER !!! ADD'IN BÖYLE BİR YAPISI VARDIR !!!
			System.out.println("Basariyle eklenmistir");
		}else			
			System.err.println("Bu kategori daha once eklenmis!!");
	}
}
