package OOP.polimorfizm;

public class SuPokemonu extends Pokemon {
	int suBasinci;
	int yuzmeHizi;

	public SuPokemonu(long id, String ad, int seviye, int guc, int can, int suBasinci, int yuzmeHizi) {
		super(id, ad, seviye, guc, can);
		setTur("Su");
		this.suBasinci = suBasinci;
		this.yuzmeHizi = yuzmeHizi;
	}

	public SuPokemonu(long id, String ad, String tur, int seviye, int guc, int can, int suBasinci, int yuzmeHizi) {
		super(id, ad, tur, seviye, guc, can);

		this.suBasinci = suBasinci;
		this.yuzmeHizi = yuzmeHizi;
	}

	@Override
	public void pokedex() {
		// TODO Auto-generated method stub
		super.pokedex();
		System.out.println("Su basinci: " + suBasinci + "\nYuzme Hizi: " + yuzmeHizi);
	}

	@Override
	public void saldir() {
		System.out.println(getAd() + " adli pokemon su saldirisi yapiyor.. ");
	}
}
