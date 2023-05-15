package designPatterns.factory.pizza;

import java.awt.Menu;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PizzaSiparis {
//	List<Pizza> pizzaSiparisleri = new ArrayList<>();
//	public void pizzaSiparisOlustur() {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Vegan Pizza --> 1\nKlasik Pizza --> 2");
//		int pizzaSecim = scanner.nextInt();scanner.nextLine();
//		switch (pizzaSecim) {
//		case 1:
//			VeganPizza veganPizza = new VeganPizza(15, EHamurTipi.KALIN, EPizzaBoyutu.BUYUK, EPizzaTur.PIZZA_SOSLU);
//			pizzaSiparisleri.add(veganPizza);			
//			break;
//		case 2:
//			KlasikPizza klasikPizza = new KlasikPizza(12, EHamurTipi.KALIN, EPizzaBoyutu.KUCUK, EPizzaTur.PIZZA_SOSLU);
//			pizzaSiparisleri.add(klasikPizza);
//			break;
//		default:
//			System.out.println("Gecersiz Pizza Turu");
//			break;
//		}
//	}
	Scanner scanner = new Scanner(System.in);

	public void menu() {
		System.out.println("Pizza Siperis Menusu");
		Pizza pizza = pizzaSec();
		siparisHazirla(pizza);
	}

	public void siparisHazirla(Pizza pizza) {
		// TODO Auto-generated method stub
		System.out.println("Siparisiniz -->" + pizza);
		System.out.println("Hazirlaniyor..");
	}

	public Pizza pizzaSec() {
		EPizzaTur tur = turSec();
		EHamurTipi hamurTipi= hamurTipiSec();
		EPizzaBoyutu pizzaBoyutu = pizzaBoyutuSec();
		Pizza pizza = PizzaFactory.pizzaOlustur(tur, hamurTipi, pizzaBoyutu);
		
		return pizza;
	}	

	public EPizzaBoyutu pizzaBoyutuSec() {
		for (EPizzaBoyutu tur : EPizzaBoyutu.values()) {
			System.out.println((tur.ordinal() + 1) + "-" + tur.name());
		}
		System.out.println("Lutfen bir pizza turu seciniz !!");
		int secim = scanner.nextInt();
		scanner.nextLine();

		return EPizzaBoyutu.values()[secim - 1];
	}

	public EHamurTipi hamurTipiSec() {
		for (EHamurTipi tur : EHamurTipi.values()) {
			System.out.println((tur.ordinal() + 1) + "-" + tur.name());
		}
		System.out.println("Lutfen bir pizza turu seciniz !!");
		int secim = scanner.nextInt();
		scanner.nextLine();

		return EHamurTipi.values()[secim - 1];
		
	}

	public EPizzaTur turSec() {
		for (EPizzaTur tur : EPizzaTur.values()) {
			System.out.println((tur.ordinal() + 1) + "-" + tur.name());
		}
		System.out.println("Lutfen bir pizza turu seciniz !!");
		int secim = scanner.nextInt();
		scanner.nextLine();

		return EPizzaTur.values()[secim - 1];
	}
	public static void main(String[] args) {
		PizzaSiparis pizzaSiprais = new PizzaSiparis();
		pizzaSiprais.menu();
	}
}
