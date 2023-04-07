package OOP.uygulama5;

public abstract class Database implements IOptions {
	private String uuid;	
	private String tabloAd;
	private String kullaniciAdi;
	private String sifre;
			
	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}	

	public String getTabloAd() {
		return tabloAd;
	}

	public void setTabloAd(String tabloAd) {
		this.tabloAd = tabloAd;
	}

	public String getSifre() {
		return sifre;
	}

	public void setSifre(String sifre) {
		this.sifre = sifre;
	}

	public String getKullaniciAdi() {
		return kullaniciAdi;
	}

	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}

	

}
