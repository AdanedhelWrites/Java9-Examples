package OOP.polimorfizm;

public class ElektrikPokemonu extends Pokemon {
	int voltajSeviye;

	public ElektrikPokemonu(long id, String ad, String tur, int seviye, int guc, int can, int voltajSeviye) {
		super(id, ad, tur, seviye, guc, can);
		// TODO Auto-generated constructor stub
		this.voltajSeviye = voltajSeviye;
	}

	public ElektrikPokemonu(long id, String ad, int seviye, int guc, int can, int voltajSeviye) {
		super(id, ad, seviye, guc, can);
		setTur("Elektrik");
		this.voltajSeviye = voltajSeviye;
	}

	@Override
	public void pokedex() {
		super.pokedex();
		System.out.println("Voltaj seviyesi: " + voltajSeviye);
	}

	@Override
	public void saldir() {
		System.out.println(getAd() + " adli pokemon elektrik saldirisi yapiyor.. ");
	}

}
