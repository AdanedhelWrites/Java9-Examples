package OOP.herguneMenu;

public class Menu {
	private ECorba corba;
	private EYemek yemek;
	private ETatli tatli;
	private EIcecek icecek;
	public Menu(ECorba corba, EYemek yemek, ETatli tatli, EIcecek icecek) {
		super();
		this.corba = corba;
		this.yemek = yemek;
		this.tatli = tatli;
		this.icecek = icecek;
	}
	public ECorba getCorba() {
		return corba;
	}
	public void setCorba(ECorba corba) {
		this.corba = corba;
	}
	public EYemek getYemek() {
		return yemek;
	}
	public void setYemek(EYemek yemek) {
		this.yemek = yemek;
	}
	public ETatli getTatli() {
		return tatli;
	}
	public void setTatli(ETatli tatli) {
		this.tatli = tatli;
	}
	public EIcecek getIcecek() {
		return icecek;
	}
	public void setIcecek(EIcecek icecek) {
		this.icecek = icecek;
	}
	@Override
	public String toString() {
		return "Menu [corba=" + corba + ", yemek=" + yemek + ", tatli=" + tatli + ", icecek=" + icecek + "]";
	}
	
	
}
