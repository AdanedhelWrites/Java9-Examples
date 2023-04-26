package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

/*
 * File sabitler sınıfı olusturalım. Bu sınıfta filemızın degerlerini tutalım
 * 
 * Menumuzde ki işlemlerin her biri için metot yazıp bunları uytgulama esnasında kullanalım
 * 
 * 1- dosyaYarat() ==> Eğer dosya daha önce yaratılmamışşa dosyaismi basaru ile oluştu. Eğer daha önce oluşturulduysa dosyaimi daha önce oluşturuldu
 * 
 * 5- --> bir harf belirliyecegiz eger bu harf dosyada var ise bunu ikinci belirledigimiz harf ile degistircez
 */
public class FileIslemler {
		

	
	public void uygulama() {
		int secim = 0;
		do {
			menu();
			System.out.println("Lutfen bir secim yapiniz: ");
			secim = secimYap();
			switch (secim) {
			case 1:
				dosyaYarat();
				break;
			case 2:
				dosyaSil();
				break;
			case 3:
				dosyaVeriEkle();
				break;
			case 4:
				dosyaVeriOku();
				break;
			case 5:
				dosyadaHarfDegis();
				break;
			case 0:
				System.out.println("Bye Bye !!!");
				break;
			default:
				break;
			}
		} while (secim != 0);
	}
	public void dosyaVeriEkle() {
	try {
		if (FileSabitler.file.exists()) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Ne giricen");
			String gir = sc.nextLine();	
			boolean kontrol = false;
			System.out.println("Veri dosyanin devamina mi yazilsin (E/H)");
			String deger = sc.nextLine();
			if (deger.equalsIgnoreCase("E")) {
				kontrol=true;
			}
			try(BufferedWriter writer =new BufferedWriter(new FileWriter(FileSabitler.path))){
				writer.write(gir+"\n");
				System.out.println("Veri girisi basarili");
			}
		}else
			System.err.println("Bu once dosyayi olustur. Dosya olusmadan bir sey ekleyemezsin !!");
		
	} catch (Exception e) {
		// TODO: handle exception
	}
		
	}
	public void dosyadaHarfDegis() {
		try(BufferedReader reader = new BufferedReader(new FileReader(FileSabitler.file))){
			String yazi;
			while ((yazi = reader.readLine()) !=null) {
				if (yazi.contains("z")) {					
					try(BufferedWriter yazi1 = new BufferedWriter(new FileWriter(FileSabitler.file))) {
						yazi1.write(yazi.replace('z', 'a'));						
					}					
				}
				System.out.println("Harf degistirildi");
				
								
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void dosyaVeriOku() {
		try {			
			if (FileSabitler.file.exists()) {
				try(BufferedReader reader = new BufferedReader(new FileReader(FileSabitler.file))){
					String yazi;
					while ((yazi = reader.readLine()) != null) {
						System.out.println("Dosya icerigi: " + yazi);
					}
				}
			}else
				System.err.println("Dosya olustur once");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	public void dosyaSil() {
		try {
			if (FileSabitler.file.exists()) {
				FileSabitler.file.delete();
			}
			else
				System.err.println("Boyle bir dosya bulunamadi!!");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	public void menu() {
		System.out.println("1- Dosya Yarat");
		System.out.println("2- Dosya Sil");
		System.out.println("3- Dosya Veri Ekle");
		System.out.println("4- Dosya Veri Oku");
		System.out.println("5- Dosya Harf Degistir");
		System.out.println("0- Cikis Yap");
	}
	
	public int secimYap() {
		Scanner sc = new Scanner(System.in);
		return Integer.parseInt(sc.nextLine());
	}

	public void dosyaYarat() {
		try {
			if (!FileSabitler.file.exists()) {
				FileSabitler.file.createNewFile();
				System.out.println(FileSabitler.file.getName()+ " basarili bir sekilde olusturuldu !!");
			}else
				System.err.println(FileSabitler.file.getAbsolutePath() + " bu dosya zaten var");
		} catch (IOException e) {
				// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
