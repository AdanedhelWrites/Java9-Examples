package Methods;
import java.util.Scanner;
public class MethodSoru001 {
/*Method yazılacak
 * Dışarıdan 2 tane sayı alıcak ve bunları bir arraye atıcak
 *  Arrayin 1. ve 2. elemanı çarpıp dönsün
 * 
 * Main methodda sayi değerimiz olucak ve baslangıc değeri olsun
 * birde sonuc değeri tanımlansın baslangıc degeri = 0;
 * 
 * sonuca methodtan gelen değer ile tanımladıgımız değerin bölümünü sonuca eşitlicez ve yazdırcaz
 * 
 * 
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sayi = 3;
		double sonuc = Carp(5,10);//benim ki
		double bitis = sonuc / sayi;
		System.out.println(bitis);//benim ki		
		
		
		double sonuc2 = Carp2() / sayi;//sınıfta çözüm
		System.out.println(sonuc2);//sınıfta çözüm
	}
	//benimki
	private static int Carp(int i,int j) {
		int[] a= {i,j};
		
		return a[0]*a[1];
	}
	//sınıfta çözüm
	private static int Carp2() {
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen birinci sayıyı girin: ");
		int i = input.nextInt();
		System.out.println("Lütfen ikinci sayıyı girin: ");
		int j = input.nextInt();
		int[] a= new int[2];
		a[0] = i;
		a[1] = j;		
		input.close();
	
		return a[0]*a[1];
	}

}
