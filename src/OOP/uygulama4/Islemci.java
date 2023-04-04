package OOP.uygulama4;

public class Islemci extends DahiliDonanim{
	private int cekirdekSayisi;
	private int hiz;
	private String nesil;
	public Islemci(int cekirdekSayisi, int hiz, String nesil) {
		super();
		this.cekirdekSayisi = cekirdekSayisi;
		this.hiz = hiz;
		this.nesil = nesil;
	}
	public int getCekirdekSayisi() {
		return cekirdekSayisi;
	}
	public void setCekirdekSayisi(int cekirdekSayisi) {
		this.cekirdekSayisi = cekirdekSayisi;
	}
	public int getHiz() {
		return hiz;
	}
	public void setHiz(int hiz) {
		this.hiz = hiz;
	}
	public String getNesil() {
		return nesil;
	}
	public void setNesil(String nesil) {
		this.nesil = nesil;
	}
	@Override
	public String toString() {
		return "Islemci [cekirdekSayisi=" + cekirdekSayisi + ", hiz=" + hiz + ", nesil=" + nesil + "]";
	}
	
	
}
