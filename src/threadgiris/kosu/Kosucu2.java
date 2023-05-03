package threadgiris.kosu;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Kosucu2 implements Runnable , Comparator<Kosucu2>{
	private String isim;
	private int mesafe;
	private long sure;
	private long baslangicZaman;
	public Kosucu2(String isim) {
		super();
		this.isim = isim;
		this.mesafe = 0;		
		this.baslangicZaman = System.currentTimeMillis();
	}
	
	
	public Kosucu2(String isim, long baslangicZaman) {
		super();
		this.isim = isim;
		this.mesafe = 0;
		this.baslangicZaman = baslangicZaman;
	}
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (mesafe < 100) {
			mesafe++;
			sure += 0.2;
			if (mesafe % 10 == 0) {
				System.out.println(isim + "---> " + mesafe+ ". metrede");
			}
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		long bitisZaman = System.currentTimeMillis();
		this.sure = bitisZaman - baslangicZaman;
		System.out.println(isim +" adli kosucu 100 metreyi " + (sure) + " ms'de kosmustur.");
	}
	@Override
	public String toString() {
		return "Kosucu2 [isim=" + isim + ", mesafe=" + mesafe + ", sure=" + sure + ", baslangicZaman=" + baslangicZaman
				+ "]";
	}
	
	public static void main(String[] args) throws InterruptedException {
		Kosucu2 kosucu1 = new Kosucu2("Mustafa");
		Kosucu2 kosucu2 = new Kosucu2("Ali");
		Kosucu2 kosucu3 = new Kosucu2("Veli");
		Kosucu2 kosucu4 = new Kosucu2("Orhan");
		Kosucu2 kosucu5 = new Kosucu2("Mert");
		
		
		Thread th1 = new Thread(kosucu1);
		Thread th2 = new Thread(kosucu2);
		Thread th3 = new Thread(kosucu3);
		Thread th4 = new Thread(kosucu4);
		Thread th5 = new Thread(kosucu5);
		
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
		
		List<Kosucu2> kosucular = new ArrayList<>(List.of(kosucu1,kosucu2,kosucu3,kosucu4,kosucu5));
		
		kosucular.stream().sorted(Comparator.comparing(x -> x.getSure())).forEach(System.out::println);
			
		
	}
	

	@Override
	public int compare(Kosucu2 o1, Kosucu2 o2) {
		
		return 0;
	}


	public String getIsim() {
		return isim;
	}


	public int getMesafe() {
		return mesafe;
	}


	public long getSure() {
		return sure;
	}


	public long getBaslangicZaman() {
		return baslangicZaman;
	}	
}
