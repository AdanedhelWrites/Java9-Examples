package OOP.queue.onceliklikuyruk;

/*
 * Musteride bir bankanin musterisi olup olmadigini tutan bir ozellik olsun
 * bir de sira numarasi ozelligi olsun 
 * bir de musteri ismi olsun
 * 
 * Banka sınıfımızda birden cok müşteri oluşturarak banka müşterisi olanlara öncelik versin
 * banka müşterileri arasında sıra numaarasına göre sıralama yapsın
 */



public class Musteri implements Comparable<Musteri> {
	private boolean musteriMi;
	private String musteriAd;
	private int siraNo;
	
	
	
	public Musteri(boolean musteriMi, String musteriAd, int siraNo) {
		super();
		this.musteriMi = musteriMi;
		this.musteriAd = musteriAd;
	}
	public boolean isMusteriMi() {
		return musteriMi;
	}
	public void setMusteriMi(boolean musteriMi) {
		this.musteriMi = musteriMi;
	}
	public String getMusteriAd() {
		return musteriAd;
	}
	public void setMusteriAd(String musteriAd) {
		this.musteriAd = musteriAd;
	}
	@Override
	public String toString() {
		return "musteriMi=" + musteriMi + ", musteriAd=" + musteriAd;
	}
	public int getSiraNo() {
		return siraNo;
	}
	public void setSiraNo(int siraNo) {
		this.siraNo = siraNo;
	}
	@Override
	public int compareTo(Musteri o) {
		if (musteriMi) {
			return -1;
		}else if (!musteriMi) {
			return 1;
		}
		return 0;
	}	
	
		
}
