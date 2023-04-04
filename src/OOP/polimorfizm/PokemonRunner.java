package OOP.polimorfizm;

import java.util.ArrayList;
import java.util.Random;

public class PokemonRunner {
	public static void main(String[] args) {
		Pokemon pokemon1 = new ElektrikPokemonu(1, "Pikachu", 6, 15, 50, 250);
		Pokemon pokemon2 = new AtesPokemonu(2, "Charizard", 3, 5000, 50, 500);
		Pokemon pokemon3 = new SuPokemonu(3, "Staryu", 1, 45, 200, 50, 23);
		Kullanici kullanici = new Kullanici("Selim");
		System.out.println(kullanici.getPokemonlar());
		ArrayList<Pokemon> bosPokemonlar = new ArrayList<>();
		bosPokemonlar.add(pokemon1);
		bosPokemonlar.add(pokemon2);
		bosPokemonlar.add(pokemon3);
		//arraylist for ile gösterme
		for (int i = 0; i < bosPokemonlar.size(); i++) {
			System.out.println(bosPokemonlar.get(i).getAd());			
		}
		
		Pokemon secilmisPokemon = pokemonYakala(bosPokemonlar, kullanici);
		saldir(secilmisPokemon);
	}

	public static void saldir(Pokemon pokemon) {
		pokemon.saldir();
	}

	public static void saldir2(Pokemon pokemon) {
		if (pokemon instanceof ElektrikPokemonu) {
			System.out.println(pokemon.getAd() + " adli pokemon elektrik saldirisi yapiyor");
		} else if (pokemon instanceof AtesPokemonu) {
			System.out.println(pokemon.getAd() + " adli pokemon ates saldirisi yapiyor");
		} else {
			System.out.println(pokemon.getAd() + " adli pokemon su saldirisi yapiyor");
		}
	}

	public static Pokemon pokemonYakala(ArrayList<Pokemon> pokemons, Kullanici kullanici) {
		Random rand = new Random();
		int index = rand.nextInt(pokemons.size()); // arraylistin boyutu dısında bir sayi üretmez
		Pokemon pokemon = pokemons.get(index);
		kullanici.getPokemonlar().add(pokemon);
		pokemon.setSahibiVarmi(true);
		return pokemon;
	}

}
