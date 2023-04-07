package OOP.uygulama5.uygulama5duzeltme;

import java.util.Scanner;

/*
 * bir menumuz olacak 
 * 1-Veri ekle
 * 2-Veri sil
 * 3-Veri Guncelle
 * 4-Verileri getir
 * 
 * daha sonra bir çalıstır metodumuz olacak olacak 
 * bu metotta menuden secim yapıcagız bu secime gore 
 * database den bir metot calısacak 
 * 
 * 
 * 
 */
public class Manager {
	
	
	
	
	Database database;
	
	public Manager(Database database) {		
		this.database = database;
	}

	
	public void calistir() {
		int secim;
		Scanner input = new Scanner(System.in);	
		do {
			menu();
			System.out.println("Lutfen bir secim yapiniz");
			secim=Integer.parseInt(input.nextLine());
			switch (secim) {
			case 1:
				database.ekle();
				break;
			case 2:
				database.sil();
				break;
			case 3:
				database.guncelle();
				break;
			case 4:
				database.verileriGetir();
				break;
			default:
				break;
			}
			
		} while (secim != 0);
	}
	
	public void menu() {
		System.out.println("**********************************************");
		System.out.println("**********************************************");
		System.out.println("**********************************************");
		System.out.println("**********MENÜYE HOŞGELDİNİZ******************");
		System.out.println("**********************************************");
		System.out.println("**********************************************");
		System.out.println("**********************************************");
		System.out.println("********VERİ EKLEMEK İÇİN ---> 1**************");
		System.out.println("********VERİ SİLMEK İÇİN ---> 2***************");
		System.out.println("******VERİ GÜNCELLEMEK İÇİN ---> 3************");
		System.out.println("*******VERİLERİ GETİRMEK İÇİN ---> 4**********");
		System.out.println("************ÇIKIŞ İÇİN ---> 5*****************");
		System.out.println("**********************************************");
		System.out.println("**********************************************");
		
	}
}
