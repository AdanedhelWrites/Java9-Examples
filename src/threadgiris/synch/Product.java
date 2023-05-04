package threadgiris.synch;

import java.util.Queue;

/*
 * bir tane stock degeri tanımlıyacagız ve baslangıc degeri 1000 daha sonra ürün sat diye bir metot olsun
 * Bu metot calıstıgında benim stogumdan birer birer ürün azalsın
 * 
 * Test sınıfında da iki tane lambda thread tanımlayıp ürün sat metodu 500 defa gerçekleştirelim
 * 
 * Bu iki threadi çalıştıralım ve en sonunda da mainde count degerini yazdıralım
 */
public class Product implements Runnable{
	public static int stock = 1000;
	
	
	
	public synchronized static void urunSat() {
		stock -= 1;
	}	


	@Override
	public void run() {
		urunSat();
		
	}



	
	
	
}
