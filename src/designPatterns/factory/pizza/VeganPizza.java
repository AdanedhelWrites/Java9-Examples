package designPatterns.factory.pizza;

public class VeganPizza extends Pizza{
	private EHayvansalUrun hayvansalUrun;
	

	public VeganPizza(EHamurTipi hamurTipi, EPizzaBoyutu pizzaBoyutu, EPizzaTur pizzaTuru
			) {
		super(hamurTipi, pizzaBoyutu, pizzaTuru);
		this.hayvansalUrun = EHayvansalUrun.ICERMEZ;
	}

	public VeganPizza(double fiyat, EHamurTipi hamurTipi, EPizzaBoyutu pizzaBoyutu, EPizzaTur pizzaTuru) {
		super(fiyat, hamurTipi, pizzaBoyutu, pizzaTuru);
		this.hayvansalUrun = EHayvansalUrun.ICERMEZ;
	}

	public EHayvansalUrun getHayvansalUrun() {
		return hayvansalUrun;
	}

	public void setHayvansalUrun(EHayvansalUrun hayvansalUrun) {
		this.hayvansalUrun = hayvansalUrun;
	}
	

}
