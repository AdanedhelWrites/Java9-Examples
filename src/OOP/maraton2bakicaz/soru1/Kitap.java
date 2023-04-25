package OOP.maraton2bakicaz.soru1;

import java.util.Scanner;

public class Kitap{
	private int id;
	private String ad;
	private EDurum durum;
	public Kitap(int id, String ad, boolean kiradaMi) {
		super();
		this.id = id;
		this.ad = ad;
		this.durum = EDurum.KUTUPHANEDE;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public EDurum getDurum() {
		return durum;
	}
	public void setDurum(EDurum durum) {
		this.durum = durum;
	}
	@Override
	public String toString() {
		return "Kitap [id=" + id + ", ad=" + ad + ", durum=" + durum + "]";
	}
	
	
	
	
}
