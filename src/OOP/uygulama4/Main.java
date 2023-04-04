package OOP.uygulama4;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		Ram ram = new Ram(16, 3200);
		HardDisk hardDisk = new HardDisk(512,2500,5000);
		Islemci islemci = new Islemci(8, 32, "9.Nesil");
		ArrayList<DahiliDonanim> dahiliDonanimlar = new ArrayList<>();
		dahiliDonanimlar.add(islemci);
		dahiliDonanimlar.add(hardDisk);
		dahiliDonanimlar.add(ram);
		ArrayList<HariciDonanim> hariciDonanimlar = new ArrayList<>();
		Mouse mouse = new Mouse(1);
		Klavye klavye= new Klavye("Mekanik", "Q");
		hariciDonanimlar.add(klavye);
		hariciDonanimlar.add(mouse);
		
		Anakart anakart = new Anakart(75, dahiliDonanimlar);
		Laptop laptop= new Laptop("1", "Monster",anakart, hariciDonanimlar, "Samsung", "MonsterI65", 65);
		System.out.println(laptop.toString());

	}

}
