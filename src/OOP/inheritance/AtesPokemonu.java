package OOP.inheritance;

public class AtesPokemonu extends Pokemon {
	int yakicilikGucu;
	public AtesPokemonu(long id, String ad, int seviye, int guc, int can,int yakicilikGucu) {
		super(id, ad,seviye, guc, can);
		setTur("Ates");
		this.yakicilikGucu=yakicilikGucu;
	}
	public AtesPokemonu(long id, String ad, String tur, int seviye, int guc, int can,int yakicilikGucu) {
		super(id, ad, tur, seviye, guc, can);
		this.yakicilikGucu=yakicilikGucu;
		
	}
	@Override
	public void pokedex() {		
		super.pokedex();
		System.out.println("Yakicilik Gucu: "+ yakicilikGucu);
	}

	
}
