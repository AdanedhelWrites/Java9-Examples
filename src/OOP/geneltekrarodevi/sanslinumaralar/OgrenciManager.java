package OOP.geneltekrarodevi.sanslinumaralar;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class OgrenciManager {
	List<Ogrenci> ogrenciler;
	public static void main(String[] args) {
		OgrenciManager ogr = new OgrenciManager();
		ogr.baslangicVerisi();
		System.out.println("***********1.YÖNTEM***********");
		Map<String, List<Ogrenci>> bolumOgr = ogr.ogrenciler.stream().collect(Collectors.groupingBy(Ogrenci::getBolum));
		bolumOgr.entrySet().forEach(s -> System.out.println(s));
		System.out.println("***********2.YÖNTEM***********");
		Map<String, List<Ogrenci>> bolumOgr2 = ogr.ogrenciler.stream().collect(Collectors.groupingBy(o -> o.getBolum()));
		bolumOgr2.entrySet().forEach(s -> System.out.println(s));
		
		System.out.println("***********--TUM SINIF ORTALAMASI-- 1. YÖNTEM***********");
		Double ogrOrt =ogr.ogrenciler.stream()
				.collect(Collectors.averagingDouble(o -> o.getNotlar().stream().collect(Collectors.averagingDouble(x -> x))));
		System.out.println(ogrOrt);
		
		System.out.println("***********--TUM SINIF ORTALAMASI-- 2. YÖNTEM***********");
		Double ogrOrt2 = ogr.ogrenciler.stream().collect(Collectors.averagingDouble(o -> o.notOrtHesapla())); //collect BİR ÇATI ALTINDA TOPLAMAK YAN YANA GETİRMEK
		System.out.println(ogrOrt2);
		
		System.out.println("**********ISIMLERLE NOT ORTALAMALARINI YAN YANA GETİR***************");
		ogr.ogrenciler.stream().collect(Collectors.toMap(o->o.getIsim(), s->s.notOrtHesapla())).forEach((a,b) -> System.out.println(a+"="+b));
		
		System.out.println("Not ortalamasi 50den yuksek olanlar icin gecti dusuk olanlar icin kaldi olarak guncelle");
		 ogr.ogrenciler.stream().forEach(o -> {
			 if (o.notOrtHesapla()>50) {
				o.setDurum("Gecti");
			}else {
				o.setDurum("Kaldi");
				
			}
		 });
		 Map<String, String> durumlari = ogr.ogrenciler.stream().collect(Collectors.toMap(o->o.getIsim(), s->s.getDurum()));
		 durumlari.entrySet().forEach(c -> System.out.println(c));
		 //2.Çözüm
		 System.out.println("Not ortalamasi 50den yuksek olanlar icin gecti dusuk olanlar icin kaldi olarak guncelle 2. yol");
		 ogr.ogrenciler.stream().filter(x -> x.notOrtHesapla() > 50).forEach(y -> y.setDurum("Gecti"));
		 ogr.ogrenciler.stream().filter(x-> x.notOrtHesapla() <= 50).forEach(y -> y.setDurum("Kaldi"));
		 
		 //her bir ögrenciye bir tanede sozlu notu ekleyelim 4.not olarak
		 
		 //her bir ogrenin her notuna +5 puan ekleyelim
			
		
	}	
	
	public void baslangicVerisi() {
		ogrenciler = new ArrayList<>();
		Ogrenci Ogrenci1 = new Ogrenci(1, "Mustafa", "mat");
		Ogrenci1.getNotlar().add(50D);
		Ogrenci1.getNotlar().add(50.0);
		Ogrenci1.getNotlar().add(50D);
		Ogrenci Ogrenci2 = new Ogrenci(2, "Ayşe", "tm");
		Ogrenci2.getNotlar().add(80D);
		Ogrenci2.getNotlar().add(55D);
		Ogrenci2.getNotlar().add(79.5);
		Ogrenci Ogrenci3 = new Ogrenci(3, "Hakan", "tm");
		Ogrenci3.getNotlar().add(86D);
		Ogrenci3.getNotlar().add(97.5);
		Ogrenci3.getNotlar().add(50.5);
		Ogrenci Ogrenci4 = new Ogrenci(4, "Mert", "mat");
		Ogrenci4.getNotlar().add(80D);
		Ogrenci4.getNotlar().add(30D);
		Ogrenci4.getNotlar().add(82.5);
		Ogrenci Ogrenci5 = new Ogrenci(5, "Gamze", "mat");
		Ogrenci5.getNotlar().add(10D);
		Ogrenci5.getNotlar().add(35.7);
		Ogrenci5.getNotlar().add(58.3);
		Ogrenci Ogrenci6 = new Ogrenci(6, "Merve", "tm");
		Ogrenci6.getNotlar().add(36D);
		Ogrenci6.getNotlar().add(23.5D);
		Ogrenci6.getNotlar().add(57.5);
		ogrenciler = List.of(Ogrenci1, Ogrenci2, Ogrenci3, Ogrenci4, Ogrenci5, Ogrenci6);
	}
	

}
