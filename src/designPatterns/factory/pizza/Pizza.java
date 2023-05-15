package designPatterns.factory.pizza;
/*
 * Boy, fiyat,hamurTipi,tur,
 * 
 * 2 tane alt sınıf oluştur veganpizza klasik pizza gibi daha sonra bir factory sinif gelcek
 * pizza seç metodu yaptıgımız seçimlere göre factroy sınıfı bize bir pizza oluşturcak
 * 
 * pizza siparis sınıfı luşturcaz burda kullanıcıdan pizzanin özellikerli seçtircez isticez
 * 
 * bu bilgilerle beraber bize bir pizza hazırlat
 */
public abstract class Pizza {
	private double fiyat;
	private EHamurTipi hamurTipi;
	private EPizzaBoyutu pizzaBoyutu;
	private EPizzaTur pizzaTuru;
	
	public Pizza(EHamurTipi hamurTipi, EPizzaBoyutu pizzaBoyutu, EPizzaTur pizzaTuru) {
		super();
		this.hamurTipi = hamurTipi;
		this.pizzaBoyutu = pizzaBoyutu;
		this.pizzaTuru = pizzaTuru;
	}
	public Pizza(double fiyat, EHamurTipi hamurTipi, EPizzaBoyutu pizzaBoyutu, EPizzaTur pizzaTuru) {
		super();
		this.fiyat = fiyat;
		this.hamurTipi = hamurTipi;
		this.pizzaBoyutu = pizzaBoyutu;
		this.pizzaTuru = pizzaTuru;
	}
	public double getFiyat() {
		return fiyat;
	}
	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}
	public EHamurTipi getHamurTipi() {
		return hamurTipi;
	}
	public void setHamurTipi(EHamurTipi hamurTipi) {
		this.hamurTipi = hamurTipi;
	}
	public EPizzaBoyutu getPizzaBoyutu() {
		return pizzaBoyutu;
	}
	public void setPizzaBoyutu(EPizzaBoyutu pizzaBoyutu) {
		this.pizzaBoyutu = pizzaBoyutu;
	}
	public EPizzaTur getPizzaTuru() {
		return pizzaTuru;
	}
	public void setPizzaTuru(EPizzaTur pizzaTuru) {
		this.pizzaTuru = pizzaTuru;
	}
	@Override
	public String toString() {
		return "Pizza [fiyat=" + fiyat + ", hamurTipi=" + hamurTipi + ", pizzaBoyutu=" + pizzaBoyutu + ", pizzaTuru="
				+ pizzaTuru + "]";
	}
	
}
