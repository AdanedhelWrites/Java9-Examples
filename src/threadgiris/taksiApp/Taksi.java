package threadgiris.taksiApp;

import java.util.*;


/*
 * Taksilerimiz her biri bir thread olucak
 * 
 * taksilerde ---> id , aldigi musteri sayisi, aldigi musterilerin idleri tutan bir liste, bekleme suresi
 * 
 * bekleme süresini random bir long degeri olsun 1000 - 5000 arasinda
 * 
 * bir durak olsun olucak duragımızda taksilerimiz var 
 * birde musteri kuyrugu olsun = bu yapida musterilerimizin idsini tutucağız
 * yapımızda 100 tane müşteri olsun 
 * durakta ise 10 tane taksi olsun
 * 
 * kuyrugumuz boşalana kadar taksilerimiz sıra ile kuyrugumuzdan müşterileri sıra ile alsın
 * kuyruktan aldığı müşteri nosunu kendi içinde tuttuğu müşterinoları listesine eklesin
 * 1. nolu taksi --->5. müşterisini aldı --> musteriNolar'si 8; döngümüz sona erdiğinde
 * 
 * 1 nolu taksi toplamda 20 müşteri aldı ve mesaisi bitti
 * 2 nolu taksi toplamda 20 müşteri aldı ve mesaisi bitti
 * 
 * 
 */
public class Taksi implements Runnable{
	int id;
	int musteriSayisi;
	List<Integer> musteriNolar;
	long beklemeSuresi;
	
	public Taksi(int id) {
		this.id = id;		
		this.beklemeSuresi = beklemeSureAta();
		this.musteriNolar = new ArrayList<>();
	}
	private long beklemeSureAta() {
		Random rand = new Random();
		return rand.nextLong(1000,5000);
	}
	@Override
	public void run() {
		
		while (!Durak.getMusteriKuyrugu().isEmpty()) {
			int musteriNolars = Durak.getMusteriKuyrugu().poll();
			musteriNolar.add(musteriNolars);
			System.out.println(id + " nolu taksi " + (musteriNolar.indexOf(musteriNolars)+1)+". musterisini aldi ---> musteri idsi--> " + musteriNolars);
			try {
				Thread.sleep(beklemeSuresi);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(id + " id'li taksi toplamda " + musteriNolar.size() + " musteri aldi ve mesaisi sona erdi");
		
		
	}
	@Override
	public String toString() {
		return "Taksi [id=" + id + ", musteriSayisi=" + musteriSayisi + ", musteriNolar=" + musteriNolar + ", beklemeSuresi="
				+ beklemeSuresi + "]";
	}	
	
}


