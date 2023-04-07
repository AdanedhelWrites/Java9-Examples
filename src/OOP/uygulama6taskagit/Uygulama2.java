package OOP.uygulama6taskagit;

import java.util.Random;
import java.util.Scanner;

public class Uygulama2 {
	
	public void oyun2() {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		ESecenek2 [] secenekler = ESecenek2.values();
		System.out.println("TAS KAGIT MAKAS OYUNUNA HOSGELDIN");
		for (ESecenek2 eSecenek : secenekler) {
			System.out.println((eSecenek.ordinal()+1)+ "-"+ eSecenek);
		}
		ESecenek2 secim = secenekler[input.nextInt()-1];
		ESecenek2 pcSecim = secenekler[rand.nextInt(secenekler.length)];
		
		if (pcSecim == secim) {
			System.out.println("Berabere");
		}else if (pcSecim.kaybeder.equalsIgnoreCase(secim.name())) {
			System.out.println("Kazandiniz!!");
		}else
			System.out.println("Kaybettiniz...");
	}
}
