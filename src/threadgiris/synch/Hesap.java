package threadgiris.synch;

/*
 * para cek
 * para yatir
 * 
 * para cek metodunda kontrol yapacagız bakiyemiz cekilecek tutardan kucuk ise işlem yapamasın ve bize bakiye yetersiz uyarısı versin
 * Eğer değilse dışardan girilen değeri bakiyeden dussun
 * 
 * bakiye yatır dışardan girilen değeri bakiyeye eklicez
 * 
 * yine test sınıfında 2 thread tanımla
 */
public class Hesap {
	static int bakiye = 1000;
	static Object lock1 = new Object();
	static Object lock2 = new Object();

	public  static boolean paraCek(int cekilecekTutar) {
		synchronized (lock1) {
			if (bakiye >= cekilecekTutar) {
				bakiye -= cekilecekTutar;
				System.out.println("Yeni bakiye: " + bakiye);
				System.out.println(Thread.currentThread().getName() + " para cekti");
				return true;
				
			} else {
				System.out.println(Thread.currentThread().getName() + " Yetersiz bakiye");
				return false;
			}
			
		}

	}

	public static void paraYatir(int yatirilacakTutar) {
		synchronized (lock2) {
			bakiye += yatirilacakTutar;
			System.out.println(Thread.currentThread().getName() + " para yatirdi");
			
		}
	}
}
