package OOP.uygulama5;

import java.util.Scanner;

/*
 * bir menumuz olcak
 * 1-veri ekle
 * 2-veri sil
 * 3-veri guncelle
 * 4-verileri getir
 * 
 * daha sonra bir calistir methodu olsun bu method menuden secim yapicaz bu secime gore databseden bir metod gelicek
 */
public class Manager implements IOptions{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		
		Database db = new Mongo();
		int secim;
		do {
			menu();
			System.out.println("Seciminizi Giriniz:");
			secim = input.nextInt();input.nextLine();
			switch (secim) {
			
			case 1:				
				db.ekle();		
				break;
			case 2:
				db.sil();
				break;
			case 3:
				db.guncelle();
				break;
			case 4:
				db.verileriGetir();
				break;
			case 0:
				System.out.println("Cikis yapiliyor");
				break;				
			default:
				System.out.println("Gecersiz bilgi istediniz");				
				System.out.println("Cikis yapiliyor");
				break;
			}
			
		} while (secim!= 0);
		
		
	}
	public static void menu() {
		System.out.println("**********************************************");
		System.out.println("**********************************************");
		System.out.println("**********************************************");
		System.out.println("*************MENÜYE HOŞGELDİNİZ***************");
		System.out.println("**********************************************");
		System.out.println("**********************************************");
		System.out.println("**********************************************");
		System.out.println("********VERİ EKLEMEK İÇİN ---> 1**************");
		System.out.println("********VERİ SİLMEK İÇİN ---> 2***************");
		System.out.println("******VERİ GÜNCELLEMEK İÇİN ---> 3************");
		System.out.println("*******VERİLERİ GETİRMEK İÇİN ---> 4**********");
		System.out.println("**********************************************");
		System.out.println("**********************************************");
		System.out.println("**********************************************");
		
	}
	@Override
	public void login() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void ekle() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void sil() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void guncelle() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void verileriGetir() {
		// TODO Auto-generated method stub
		
	}
	
}
