package OOP.polimorfizm;

public class Pokemon {
	private long id;

	public boolean isSahibiVarmi() {
		return sahibiVarmi;
	}

	public void setSahibiVarmi(boolean sahibiVarmi) {
		this.sahibiVarmi = sahibiVarmi;
	}

	private String ad;
	private String tur;
	private int seviye;
	private int guc;
	private int can;
	private boolean sahibiVarmi;

	public Pokemon(long id, String ad, String tur, int seviye, int guc, int can) {
		this.id = id;
		this.ad = ad;
		this.tur = tur;
		this.seviye = seviye;
		this.guc = guc;
		this.can = can;
	}

	public Pokemon(long id, String ad) {
		this.id = id;
		this.ad = ad;
		this.can = 100;
	}

	public Pokemon(long id, String ad, int seviye, int guc, int can) {
		this.id = id;
		this.ad = ad;
		this.seviye = seviye;
		this.guc = guc;
		this.can = can;
		this.tur = "Standart";

	}

	public void saldir() {
		System.out.println(ad + " adli pokemon saldiriyor");
	}

	public void kacin() {
		System.out.println(ad + " adli pokemon saldiridan kacindi");
	}

	public void pokedex() {
		System.out.println("POKEDEX");
		System.out.println("================");
		System.out.println("id=" + id);
		System.out.println("ad=" + ad);
		System.out.println("tur=" + tur);
		System.out.println("can=" + can);
		System.out.println("guc=" + guc);
		System.out.println("seviye=" + seviye);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getTur() {
		return tur;
	}

	public void setTur(String tur) {
		this.tur = tur;
	}

	public int getSeviye() {
		return seviye;
	}

	public void setSeviye(int seviye) {
		this.seviye = seviye;
	}

	public int getGuc() {
		return guc;
	}

	public void setGuc(int guc) {
		this.guc = guc;
	}

	public int getCan() {
		return can;
	}

	public void setCan(int can) {
		this.can = can;
	}

}
