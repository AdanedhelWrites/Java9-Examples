package OOP.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class RamazanPidesi {

	public static void main(String[] args) throws InterruptedException {
		Queue<String> pideKuyruk = new LinkedList<>();
		pideKuyruk.offer("Cem");
		pideKuyruk.offer("Kemal");
		pideKuyruk.offer("Ali");
		pideKuyruk.offer("Mert");
		pideKuyruk.offer("Doruk");
		pideKuyruk.offer("Berk");
		pideKuyruk.offer("Selma");
		pideKuyruk.offer("Cemre");
		pideKuyruk.offer("Eren");
		pideKuyruk.offer("Osman");
		Random rand = new Random();
		int pideSayisi = rand.nextInt(1,11);
		System.out.println(pideSayisi + " tane pide cikti..");
		Thread.sleep(1000);
		
		for (int i = pideSayisi-1; i >= 0 ; i--) {
				Thread.sleep(500);
				System.out.println(pideKuyruk.poll() + " kisisi pidesini aldi!!"); 
		}
		System.out.println("----------------------------------------");
		System.out.println("Pide bitti!! " + pideKuyruk.toString() +" pideyi alamadi..");
			
			
		
	}

}
