package threadgiris.okulapp;

import java.time.LocalDate;

public class Ogrenci {
	
	private String isim;
	
	private double ortalama;
	
	private EDurum durum;
	
	private LocalDate dogumTarihi;
	
	public Ogrenci(String isim, double ortalama, EDurum durum, LocalDate dogumTarihi) {		
		this.isim = isim;
		this.ortalama = ortalama;
		this.durum = durum;
		this.dogumTarihi = dogumTarihi;
	}
	
	public Ogrenci(String isim, double ortalama, LocalDate dogumTarihi) {
		super();
		this.isim = isim;
		this.ortalama = ortalama;
		this.dogumTarihi = dogumTarihi;
	}
	
	public Ogrenci(String isim, LocalDate dogumTarihi) {
		super();
		this.isim = isim;
		this.dogumTarihi = dogumTarihi;
	}
	
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public double getOrtalama() {
		return ortalama;
	}
	public void setOrtalama(double ortalama) {
		this.ortalama = ortalama;
	}
	public EDurum getDurum() {
		return durum;
	}
	public void setDurum(EDurum durum) {
		this.durum = durum;
	}
	public LocalDate getDogumTarihi() {
		return dogumTarihi;
	}
	public void setDogumTarihi(LocalDate dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}
	@Override
	public String toString() {
		return "Ogrenci [isim=" + isim + ", ortalama=" + ortalama + ", durum=" + durum + ", dogumTarihi=" + dogumTarihi
				+ "]";
	}
	
	
}
