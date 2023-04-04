package OOP.uygulama4;
import java.util.ArrayList;
public class Bilgisayar {
	
	private String id;
	private String ad;	
	private Anakart anakart;
	private ArrayList<HariciDonanim> hariciDonanimlar;
	private boolean tasinabilirMi;
	
	public Bilgisayar(String id, String ad, Anakart anakart,
			ArrayList<HariciDonanim> hariciDonanimlar) {
		super();
		this.id = id;
		this.ad = ad;
		
		this.anakart = anakart;
		this.hariciDonanimlar = hariciDonanimlar;
	}
	public Bilgisayar(String id, String ad, Anakart anakart) {
		super();
		this.id = id;
		this.ad = ad;
		this.anakart = anakart;
	}
	public boolean isTasinabilirMi() {
		return tasinabilirMi;
	}
	public void setTasinabilirMi(boolean tasinabilirMi) {
		this.tasinabilirMi = tasinabilirMi;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public Anakart getAnakart() {
		return anakart;
	}
	public void setAnakart(Anakart anakart) {
		this.anakart = anakart;
	}
	public ArrayList<HariciDonanim> getHariciDonanimlar() {
		return hariciDonanimlar;
	}
	public void setHariciDonanimlar(ArrayList<HariciDonanim> hariciDonanimlar) {
		this.hariciDonanimlar = hariciDonanimlar;
	}
	@Override
	public String toString() {
		return "Bilgisayar [id=" + id + ", ad=" + ad + ", anakart=" + anakart + ", hariciDonanimlar=" + hariciDonanimlar
				+ ", tasinabilirMi=" + tasinabilirMi + "]";
	}
	
	
	
	
}
