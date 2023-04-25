package OOP.maraton2bakicaz.soru1;

import java.util.ArrayList;
import java.util.List;

public class Musteri extends Kisi{

	private List<Kitap> kiralananKitaplar;
	public Musteri(int id, String ad) {
		super(id, ad);
		this.kiralananKitaplar= new ArrayList<>();
	}
	public List<Kitap> getKiralananKitaplar() {
		return kiralananKitaplar;
	}
	public void setKiralananKitaplar(List<Kitap> kiralananKitaplar) {
		this.kiralananKitaplar = kiralananKitaplar;
	}
	@Override
	public String toString() {
		return "Musteri [getId()=" + getId() + ", getAd()=" + getAd() + "]";
	}
	
	
}
