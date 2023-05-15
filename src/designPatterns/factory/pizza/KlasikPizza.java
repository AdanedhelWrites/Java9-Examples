package designPatterns.factory.pizza;

public class KlasikPizza extends Pizza{
	private EHayvansalUrun hayvansalUrun;
	
	
	
	public KlasikPizza(EHamurTipi hamurTipi, EPizzaBoyutu pizzaBoyutu, EPizzaTur pizzaTuru) {
		super(hamurTipi, pizzaBoyutu, pizzaTuru);
		this.hayvansalUrun = EHayvansalUrun.ICERIR;
	}

	public KlasikPizza(double fiyat, EHamurTipi hamurTipi, EPizzaBoyutu pizzaBoyutu, EPizzaTur pizzaTuru) {
		super(fiyat, hamurTipi, pizzaBoyutu, pizzaTuru);
		this.hayvansalUrun = EHayvansalUrun.ICERIR;
	}

	public EHayvansalUrun getHayvansalUrun() {
		return hayvansalUrun;
	}

	public void setHayvansalUrun(EHayvansalUrun hayvansalUrun) {
		this.hayvansalUrun = hayvansalUrun;
	}
	
	
}
