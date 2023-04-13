package OOP.herguneMenu;

public enum EIcecek {
	AYRAN(false),KOLA(false),ICETEA(false),LIMONATA(false),FANTA(false),GAZOZ(false),SALGAM(false);

	boolean atadiMi;

	private EIcecek(boolean atadiMi) {
		this.atadiMi = atadiMi;
	}

	public boolean isAtadiMi() {
		return atadiMi;
	}

	public void setAtadiMi(boolean atadiMi) {
		this.atadiMi = atadiMi;
	}
	
	
}
