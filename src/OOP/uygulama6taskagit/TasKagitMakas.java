package OOP.uygulama6taskagit;

import java.util.*;

public class TasKagitMakas {
	
	ESecenek [] secenekler = ESecenek.values();
		
		
	public void oyun() {
		ESecenek benimSecimim = secimim();
		ESecenek pcSecimi = pcSecim();
		if (pcSecimi == benimSecimim) {
			System.out.println("Berabere");
		}else {
			switch (benimSecimim) {
			case TAS:	
				if (pcSecimi == ESecenek.KAGIT) {
					System.out.println("Kaybettiniz..");					
				}else {
					System.out.println("Kazandiniz!!!");
				}
				
				break;
			case KAGIT:
				if (pcSecimi == ESecenek.MAKAS) {
					System.out.println("Kaybettiniz..");
				}else {
					System.out.println("Kazandiniz!!!!");
				}
				
				break;
			case MAKAS:
				if (pcSecimi == ESecenek.TAS) {
					System.out.println("Kaybettiniz..");					
				}else {
					System.out.println("Kazandiniz!!!!!");
				}
				
				break;
			default:
				break;
			}
		}
		System.out.println("PC Secimi >>>>>>>> "+ pcSecimi);
	}
	
					
		
	public ESecenek secimim() {
		Scanner input = new Scanner(System.in);
		for (ESecenek eSecenek : secenekler) {
			System.out.println((eSecenek.ordinal()+1)+ "-"+ eSecenek);
		}
		System.out.println("Lutfen TAS/KAGIT/MAKAS verilerindne birini giriniz");
		int secim = Integer.parseInt(input.nextLine());
		return secenekler[secim-1];
	}

	
	public ESecenek pcSecim() {
		Random rand = new Random();
		int index = rand.nextInt(secenekler.length);
		return secenekler[index];
	}
}
