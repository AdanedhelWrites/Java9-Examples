package OOP.uygulama2;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {					
		//durak oluşturma işlemleri
		Durak durak = new Durak(1, "Pendik", "Istanbul");
		Durak durak1 = new Durak(2, "Kartal", "Istanbul");
		Durak durak2 = new Durak(3, "Kadikoy", "Istanbul");
		Durak durak3 = new Durak(4, "Bornova", "Izmir");
		Durak durak4 = new Durak(5, "Bozuyuk", "Bilecik");
		//güzergah olusturma işlemleri
		Guzergah guzergah = new Guzergah(480);		
		Guzergah guzergah1 = new Guzergah(230);
		//otobüs olusturma islemleri
		Otobus otobus = new Otobus("1", "06","Mahmut",guzergah, 40, "Mercedes");
		Otobus otobus1 = new Otobus("2", "34", "Mert", guzergah, 82, "Audi");
		Otobus otobus2 = new Otobus("3", "35", "Cemal", guzergah1, 56, "BMW");
		Otobus otobus3 = new Otobus("4", "07", "Kemal", guzergah1, 75, "Honda");
		Otobus otobus4 = new Otobus("5", "13", "Cansın", guzergah, 30, "Toyota");
		//Duraklara otobus atama islemleri
		//1.YÖNTEM
		Otobus otobusler[] = {otobus,otobus1,otobus2};		
		durak.setOtobusler(otobusler);
		durak4.setOtobusler(otobusler);
		
		Otobus otobusler2[] = {otobus3,otobus4};
		durak1.setOtobusler(otobusler2);
		durak3.setOtobusler(otobusler2);
		
		Otobus otobusler3[] = {otobus,otobus1,otobus2,otobus3,otobus4};		
		durak2.setOtobusler(otobusler3);
		//2. YÖNTEM
		//durak1.setOtobusler(new Otobus[3]);
		//durak1.getOtobusler()[0] = otobus1;
		//durak1.getOtobusler()[1] = otobus2;
		//durak1.getOtobusler()[2] = otobus3;
		
		//GÜZERGAHLARA DURAK ATAMA İŞLEMLERİ
		Durak[] duraklar1 = {durak1,durak2,durak3};
		Durak[] duraklar2 = {durak,durak4};
		guzergah.setDuraklar(duraklar1);
		guzergah1.setDuraklar(duraklar2);
		
		System.out.println(durak1);
		System.out.println(Arrays.toString(durak1.getOtobusler()));
		
	}

}
