package OOP.queue.onceliklikuyruk;


import java.util.Queue;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Banka {
	Queue<Musteri> musteriSira = new PriorityQueue<>();
	
	
//	Queue<Musteri> musteriSira2 = new PriorityQueue<>(new Comparator<Musteri>() {
//
//		@Override
//		public int compare(Musteri o1, Musteri o2) {
//			if (o1.isMusteriMi() && o2.isMusteriMi()) {
//				return o1.getSiraNo()-o2.getSiraNo();
//			}
//			else if (o1.isMusteriMi()) {		COMPARATORLE ÇÖZÜM ŞEKLİ BU ŞEKİLDE OLUYOR
//				return -1;
//			}else if (!o1.isMusteriMi() && o2.isMusteriMi()) {
//				return o1.getSiraNo()-o2.getSiraNo();
//			}
//			
//			return 1;
//			
//		}
//		
//	});
	
	public void kuyrugaMusteriEkle() {
		musteriSira.offer(new Musteri(true, "Osman",1));
		musteriSira.offer(new Musteri(false, "Ali",2));
		musteriSira.offer(new Musteri(false, "Omer",3));
		musteriSira.offer(new Musteri(true, "Hayri",4));
		musteriSira.offer(new Musteri(true, "Kazım",5));
		musteriSira.offer(new Musteri(false, "Kaan",6));
		
	}
	public void kuyruguYazdir() {
		while (!musteriSira.isEmpty()) {
			System.out.println(musteriSira.poll());
		}
	}
	public static void main(String[] args) {
		Banka bank = new Banka();
		bank.kuyrugaMusteriEkle();
		bank.kuyruguYazdir();
	}
}
