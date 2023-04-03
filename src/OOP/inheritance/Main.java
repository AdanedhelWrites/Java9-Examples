package OOP.inheritance;

public class Main {
	public static void main(String[] args) {
		Pokemon pokemon1 = new Pokemon(1, "Pikachu", "Elektrik", 1, 300, 100);
		pokemon1.saldir();
		pokemon1.kacin();
		pokemon1.pokedex();
		Pokemon pokemon2 = new Pokemon(2, "Charizard", "Ates", 36, 500, 350);
		pokemon2.saldir();
		pokemon2.kacin();
		pokemon2.pokedex();
		Pokemon pokemon3 = new Pokemon(1, "Zapdos", "Elektrik", 1, 6000, 500);
		pokemon3.saldir();
		pokemon3.kacin();
		pokemon3.pokedex();
		
		ElektrikPokemonu elektrikPokemonu = new ElektrikPokemonu(4, "Raicu", 5, 650, 75, 10000);
		
		elektrikPokemonu.pokedex();
		elektrikPokemonu.saldir();
		elektrikPokemonu.kacin();
	}
	

}
