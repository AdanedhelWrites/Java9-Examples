package OOP.Setler.setOrnek2.setOrnek2MSTF;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class KullaniciTest {
	Set<Kullanici> kullanicilar;
	Set<String> kullaniciIsimler;

	public KullaniciTest() {
		super();
		this.kullanicilar = new HashSet<>();
		this.kullaniciIsimler = new TreeSet<>();
		kullanicilar.add(new Kullanici("yk1", "yk1@gmail.com", "123"));
		kullanicilar.add(new Kullanici("yk2", "yk3@gmail.com", "1234"));
		kullanicilar.add(new Kullanici("yk3", "yk2@gmail.com", "1235"));
		kullanicilar.add(new Kullanici("yk4", "yk5@gmail.com", "1237"));
		kullanicilar.add(new Kullanici("yk5", "yk7@gmail.com", "1236"));
		kullaniciIsimler.add("yk1");
		kullaniciIsimler.add("yk2");
		kullaniciIsimler.add("yk3");
		kullaniciIsimler.add("yk4");
		kullaniciIsimler.add("yk5");
	}

	public void kullaniciEkle() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen bir kullanici ismi giriniz: ");
		String kullaniciAdi = input.nextLine();
		
		while (!kullaniciIsimler.add(kullaniciAdi)) {
			System.err.println("Kullanici adi daha once eklenmistir!!!!!!");
			kullaniciAdi= input.nextLine();
		}
		System.out.println("Lütfen bir email giriniz: ");
		String email = input.nextLine();
		System.out.println("Lütfen bir sifre giriniz: ");
		String sifre = input.nextLine();
		kullanicilar.add(new Kullanici(kullaniciAdi, email, sifre));			
		
	}
	public static void main(String[] args) {
		KullaniciTest test = new KullaniciTest();
		test.kullaniciEkle();
		test.kullanicilar.forEach(System.out::println);
	}

}
