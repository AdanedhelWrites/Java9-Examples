package threadgiris.kosu;

import java.time.LocalDateTime;
import java.util.Locale;

/*
 * Kosucu bir thread olucak kosucunun ismi, mesafe , sure , baslangic zamani
 * 
 * thread icin bir metod yazacagiz ==>
 * kosucu 100 metre koşacak
 * 1 er 1 er mesafe alacak
 * her 1 mesafe aldığında 200 milisaniye program beklesin
 * ve her 10 metrede 1 program cıktı verecek ==>
 * selman --> 10. metrede
 * selman --> 20. metrede gibi
 * ...
 * metodun sonunda da mustafa adlı kosucu 100 metreyi 20000 milisaniyede koştu
 * 
 * yüz metre yarışı sınıfı olusturup 5 tane kosucu oluşturalım ve yarışımız başlasın!
 * 
 */

//BU BENIM ESERIM
public class Kosucu extends Thread{
	
	
	String kIsmi;
	long mesafe;
	long sure;
	int bZaman;
	public Kosucu(String kIsmi, LocalDateTime bZaman,int mesafe) {
		super();
		this.kIsmi = kIsmi;
		this.bZaman = (int) System.currentTimeMillis();
		this.mesafe = 0;
	}
	@Override
	public void run() {
		boolean kontrol = true;
		while (kontrol) {
			if (mesafe != 100) {
				mesafe += 1;
				if (mesafe % 10 == 0) {					
					System.out.println(kIsmi + "--> " + mesafe + " metrede");					
				}				
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else
				kontrol = false;		
		}
		int bitisZaman = (int) System.currentTimeMillis(); 
		System.out.println(kIsmi + " bu yarisi " + (bitisZaman - bZaman) + " milisaniyede kostu");
		
	}
	public static void main(String[] args) throws InterruptedException {
		Thread th1 = new Thread(new Kosucu("Mustafa", LocalDateTime.now(), MAX_PRIORITY));
		Thread th2 = new Thread(new Kosucu("Ali", LocalDateTime.now(), MAX_PRIORITY));
		Thread th3 = new Thread(new Kosucu("Veli", LocalDateTime.now(), MAX_PRIORITY));
		Thread th4 = new Thread(new Kosucu("Orhan", LocalDateTime.now(), MAX_PRIORITY));
		Thread th5 = new Thread(new Kosucu("Mert", LocalDateTime.now(), MAX_PRIORITY));
		
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		th5.start();
		
		th1.join();
		th2.join();
		th3.join();
		th4.join();
		th5.join();
	}
	
	
	
	

	
	
	
}
