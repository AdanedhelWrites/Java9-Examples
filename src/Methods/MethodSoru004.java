package Methods;

import java.util.Scanner;

public class MethodSoru004 {
	/*
	* 
	* System.out.println("==Hesap makinesi===\n"); System.out.println("1- Topla");
	* System.out.println("2- Çıkar"); System.out.println("3- Çarp");
	* System.out.println("4- Böl"); System.out.println("0- Çıkış");
	* System.out.println("Bir işlem Seçiniz");
	* 
	* bir döngümüz olucak bu döngüde işlem seçeceğiz 1- toplama kullanıcan = alana
	* kadar girilen sayıları toplasın ve ekrana yazdırsın; *
	* 
	* 5- iki asyı gireceğiz bu sayıların ebob ve ekokunu hesaplayıp bize yazdırsın
	* 
	* ekok=sayi*sayi2/ebob
	* 
	*/
	
	public static void menu() {		
		System.out.println("==Hesap makinesi===\n");
		System.out.println("1- Topla");
		System.out.println("2- Çıkar");
		System.out.println("3- Çarp");
		System.out.println("4- Böl"); 
		System.out.println("5- EBOB-EKOK"); 
		System.out.println("0- Çıkış");
		
	}
	public static int islemSec() {
		Scanner input = new Scanner(System.in);
		System.out.println("Bir işlem Seçiniz");
		int islem = input.nextInt();		
		return islem;
	}
	public static void uygulama() {
		/*
		 * 1- menumüz gelsin
		 * 1 işlem seçelim bu işleme göre metodlar yazalım
		 */
		int islem =0;
		do {
			menu();
			islem = islemSec();
			switch (islem) {
			case 1:
				System.out.println("Toplamları: "+ topla());
				break;
			case 2:
				System.out.println("Çıkarmaları: "+ cikarma());
				break;
			default:
				break;
			}	
						
		} while (islem != 0);
		
	}
	public static int topla() {
		int top = 0;
		System.out.println("Sayiları giriniz. Sonuç içi '=' yazınız. ");
		Scanner sc = new Scanner(System.in);
		String sayi="";
		while (!(sayi=sc.nextLine()).equals("=")) {
			top += Integer.parseInt(sayi);
		}
		
		return top;
	}
	public static int cikarma() {			
		int cikarma = 0;
		int sayac = 0;
		System.out.println("Sayiları giriniz. Sonuç içi '=' yazınız. ");
		Scanner sc = new Scanner(System.in);
		String sayi="";
		while (!(sayi=sc.nextLine()).equals("=")) {
			sayac++;
			if (sayac == 1) {
				cikarma = Integer.parseInt(sayi);
			}else {
				cikarma -= Integer.parseInt(sayi);
			}
		}
		
		return cikarma;
	}
		public static void main(String[] args) {
			uygulama();
		}
		

}

