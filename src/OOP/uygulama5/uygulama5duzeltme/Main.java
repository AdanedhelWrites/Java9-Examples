package OOP.uygulama5.uygulama5duzeltme;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		databaseSec(); // sorumuz loginsizdi çözümü bu
		databaseSec2(); // bunda login gerektigi icin database ve manager veriyoruz içine

	}

	public static void databaseSec() {
		Scanner input = new Scanner(System.in);
		int sec;
		Manager manager;
		do {
			secimMenu();
			sec = input.nextInt();
			input.nextLine();
			switch (sec) {
			case 1:
				manager = new Manager(new Mysql());
				manager.calistir();
				break;
			case 2:
				manager = new Manager(new Oracle());
				manager.calistir();
				break;
			case 3:
				manager = new Manager(new Mongo());
				manager.calistir();
				break;
			case 0:
				System.out.println("Secim yapmadan cikisiniz gerceklestirildi.");
				break;
			default:
				System.out.println("Gecerli Bir database giriniz: ");
				break;
			}

		} while (sec != 0);
	}

	public static void secimMenu() {
		System.out.println("Hangi database'e erismek istiyorsun: ");
		System.out.println("1-MySQL");
		System.out.println("2-Oracle ");
		System.out.println("3-Mongo:");
	}

	public static void databaseSec2() {
		Manager manager;
		Database database = null;

		Scanner input = new Scanner(System.in);
		int sec;

		do {
			secimMenu();
			sec = input.nextInt();
			input.nextLine();
			switch (sec) {
			case 1:
				database = new Mysql();
				break;
			case 2:
				database = new Oracle();
				break;
			case 3:
				database = new Mongo();
				break;
			case 0:
				System.out.println("Secim yapmadan cikisiniz gerceklestirildi.");
				break;
			default:
				System.out.println("Gecerli Bir database giriniz: ");
				break;
			}
			database.login();

			manager = new Manager(database);
			manager.calistir();

		} while (sec != 0);
	}
}
