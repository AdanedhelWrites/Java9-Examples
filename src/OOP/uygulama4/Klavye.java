package OOP.uygulama4;

public class Klavye extends HariciDonanim{
	private String tur;
	private String stil;
	public Klavye(String tur, String stil) {
		super();
		this.tur = tur;
		this.stil = stil;
	}
	public String getTur() {
		return tur;
	}
	public void setTur(String tur) {
		this.tur = tur;
	}
	public String getStil() {
		return stil;
	}
	public void setStil(String stil) {
		this.stil = stil;
	}
	@Override
	public String toString() {
		return "Klavye [tur=" + tur + ", stil=" + stil + "]";
	}
	
	
}
