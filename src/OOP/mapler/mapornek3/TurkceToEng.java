package OOP.mapler.mapornek3;
/*
 * Bir iki array üzerinden bir map yapıp
 * bir metod yazalım
 * dışarıadn girilen kelimde türkçe karkater varsa inglizce karakter çevirsin
 */

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class TurkceToEng {
	char[] turkishWords = { 'İ', 'ı', 'ş', 'Ş', 'ç', 'Ç', 'ğ', 'Ğ', 'ü', 'Ü', 'ö', 'Ö' };
	char[] englishWords = { 'I', 'i', 's', 'S', 'c', 'C', 'g', 'G', 'u', 'U', 'o', 'O' };
	Map<Character,Character> map = new LinkedHashMap<>();
	
	
	public void mapOlustur() {
		for (int i = 0; i < turkishWords.length; i++) {
			map.put(turkishWords[i], englishWords[i]);			
		}
	}
	public void replace() {
		Scanner input = new Scanner(System.in);
		System.out.println("Bir kelime giriniz: ");
		String kelime = input.nextLine();
		
		for (char c : kelime.toCharArray()) {
			if (map.containsKey(c)) {
				kelime=kelime.replace(c, map.get(c));
			}
		}
		System.out.println(">>>" + kelime);
	}
	public static void main(String[] args) {
		TurkceToEng cevir = new TurkceToEng();
		cevir.mapOlustur();
		cevir.replace();
	}
	
}



