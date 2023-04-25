package OOP.maraton2bakicaz.soru1;

public abstract class Kisi {
	
	private int id;
	private String ad;
	public Kisi(int id, String ad) {
		super();
		this.id = id;
		this.ad = ad;
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
	@Override
	public String toString() {
		return "Kisi [id=" + id + ", ad=" + ad + "]";
	}
	
	
	
}
