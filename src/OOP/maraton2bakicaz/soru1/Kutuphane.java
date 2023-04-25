package OOP.maraton2bakicaz.soru1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Kutuphane implements IKutuphane{
	private static final List<Kitap> kitaplar = new ArrayList<>();
	private static final List<Musteri> musteriler = new ArrayList<>();
	private static final List<Kasiyer> kasiyerler = new ArrayList<>();
	private static final List<Kiralama> kiralamalar = new ArrayList<>();
	
	
	public static <T> void listeyeEkle(List<T> list,Object object) {
		list.add((T) object);
	}
	public void musteriVeKasiyerOlustur() {
		Musteri musteri1 = new Musteri(1, "Ahmet Akcay");
		Musteri musteri2 = new Musteri(2, "Emel Akcay");
		Musteri musteri3 = new Musteri(3, "Ayse Alcay");
		Musteri musteri4 = new Musteri(4, "Mehmet Sonbahar");
		Kasiyer kasiyer1 = new Kasiyer(1, "Kemalettin Adihos", 12000);
		Kasiyer kasiyer2 = new Kasiyer(2, "Mira Yildiz", 12000);
		listeyeEkle(musteriler, musteri1);
		listeyeEkle(musteriler, musteri2);
		listeyeEkle(musteriler, musteri3);
		listeyeEkle(musteriler, musteri4);
		listeyeEkle(kasiyerler, kasiyer1);
		listeyeEkle(kasiyerler, kasiyer2);
	}
	public static void kitapOlustur() {
		listeyeEkle(kitaplar, new Kitap(1, "Hobbit", false));
		listeyeEkle(kitaplar, new Kitap(2, "Buyuk Saat", false));
		listeyeEkle(kitaplar, new Kitap(3, "Children of Hurin", false));
		listeyeEkle(kitaplar, new Kitap(4, "Dance of Fire and Ice", false));
	}
	
	public void kiralamOlustur() {
		Kiralama kiralama1 = new Kiralama(1, kasiyerler.get(0), musteriler.get(0), kitaplar.get(0));
		kitaplar.get(0).setDurum(EDurum.KIRADA);
		Kiralama kiralama2 = new Kiralama(2, kasiyerler.get(0), musteriler.get(1), kitaplar.get(0));
		kitaplar.get(0).setDurum(EDurum.KIRADA);
		Kiralama kiralama3 = new Kiralama(3, kasiyerler.get(1), musteriler.get(1), kitaplar.get(1));
		kitaplar.get(1).setDurum(EDurum.KIRADA);
		kitaplar.get(1).setDurum(EDurum.KUTUPHANEDE);
		Kiralama kiralama4 = new Kiralama(4, kasiyerler.get(1), musteriler.get(2), kitaplar.get(2));
		kitaplar.get(2).setDurum(EDurum.KIRADA);
		
		listeyeEkle(kiralamalar, kiralama1);
		listeyeEkle(kiralamalar, kiralama2);
		listeyeEkle(kiralamalar, kiralama3);
		listeyeEkle(kiralamalar, kiralama4);
	}
	@Override
	public boolean kiralamaYap() throws KutuphaneException {
		Scanner input = new Scanner(System.in);
		System.out.println("Lutfen musteri id'nizi giriniz:");
		int musteriId= Integer.parseInt(input.nextLine());
		Musteri musteri = musteriler.get(musteriId - 1);
		System.out.println("Lutfen kasiyer id'nizi giriniz:");
		int kasiyherId= Integer.parseInt(input.nextLine());
		Kasiyer kasiyer = kasiyerler.get(kasiyherId-1);
		System.out.println("Kirada olmayan kitaplar");
		kitaplar.stream().filter(k -> k.getDurum().equals(EDurum.KUTUPHANEDE)).forEach( x -> {
			System.out.println(x.getId()+""+x.getAd());
			
		});
		System.out.println("Lutfen bir secim yapiniz:");
		int kitapId = Integer.parseInt(input.nextLine());
		Kitap kitap = kitaplar.get(kitapId-1);
		if (kitap.getDurum().equals(EDurum.KIRADA)) {
			throw new KutuphaneException("Bu kitap zaten kirada");
		}else {
			Kiralama kiralama = new Kiralama(kiralamalar.size()+1, kasiyer, musteri, kitap);
			kiralamalar.add(kiralama);
			return true;
			
		}
	}
	@Override
	public Kitap kitapAra() throws KutuphaneException {
		Scanner input = new Scanner(System.in);
		System.out.println("Musteri kitap ismi giriniz: ");
		String isim = input.nextLine();
		Optional<Kitap> kitap= kitaplar.stream().filter(k -> k.getAd().equalsIgnoreCase(isim)).findFirst();
		if (kitap.isEmpty()) {
			throw new KutuphaneException("Kitap Bulunamadi");
		}
		return kitap.get();
	}
	@Override
	public Musteri musteriAra() throws KutuphaneException {
		Scanner input = new Scanner(System.in);
		System.out.println("Lutfen musteri ismi giriniz: ");
		String isim = input.nextLine();
		Optional<Musteri> musteri= musteriler.stream().filter(k -> k.getAd().equalsIgnoreCase(isim)).findFirst();
		if (musteri.isEmpty()) {
			throw new KutuphaneException("Musteri Bulunamadi");
		}
		return musteri.get();
		
	}
	@Override
	public List<Kitap> kiralananKitaplar() throws KutuphaneException {
		List<Kitap> kiralananKitaplar = kitaplar.stream().filter(k -> k.getDurum().equals(EDurum.KIRADA)).collect(Collectors.toList());
		if (kiralananKitaplar.isEmpty()) {
			throw new KutuphaneException("Kirada kitap bulunmuyor");
		}
		
			
		return kiralananKitaplar;		
	}
	
	public Musteri idyeGoreSonKiralayanKisi(int kitapId) {
		List<Kiralama> kiralama = kiralamalar.stream().filter(k -> k.getKitap().getId() == kitapId).collect(Collectors.toList());
		Musteri musteri = null;
		try {			
			musteri = kiralama.get(kiralama.size()-1).getMusteri();
		} catch (Exception e) {
			System.out.println("Bu kitaba ait herhangi bir kiralama yoktur");
		}
		return musteri;
	}
	public List<Musteri> kitapAdinaGoreKiralayanMusteriler(String kitapAdi) {
		List<Musteri> musteriList =  kiralamalar.stream().filter(k -> k.getKitap().getAd().equalsIgnoreCase(kitapAdi))
		.map(x -> x.getMusteri()).collect(Collectors.toList());
		return musteriList;
	}
	public List<Musteri> ahmIleBasla(){
		List<Musteri> ahmBaslayan = musteriler.stream().filter(x -> x.getAd().startsWith("Ahm")).collect(Collectors.toList());
		return ahmBaslayan;
	}
	public List<Kitap> musteriyeIdGoreKitap(int musteriId){
		List<Kitap> idyeGoreKitap = kiralamalar.stream().filter(k -> k.getMusteri().getId()==musteriId).map(x -> x.getKitap()).collect(Collectors.toList());
		return idyeGoreKitap;
	}
	
}
