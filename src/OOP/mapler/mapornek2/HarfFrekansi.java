package OOP.mapler.mapornek2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.Scanner;

/*
 * Dışarıdan bir string değer alıcaz daha sonra bunu bir mapte saklayacagız
 * hangi harf kaç kere geçmiş
 */
public class HarfFrekansi {
	
	public static void main(String[] args) {
		HarfFrekansi harfFreBul = new HarfFrekansi();
		Map<Character,Integer> map = new TreeMap<>();
		harfFreBul.mapeAktar(map);
		
		for (Entry<Character,Integer> string : map.entrySet()) {
			System.out.println(string);
		}
	}
	
	public void mapeAktar(Map<Character,Integer> map) {
		Scanner input = new Scanner(System.in);
		System.out.println("Kelime veriniz: ");
		String kelime = input.nextLine();
		
		
		for (int i = 0; i < kelime.length(); i++) {
			if (!map.containsKey(kelime.charAt(i))) {
				map.put(kelime.charAt(i), 1);
			}else
				map.put(kelime.charAt(i), map.get(kelime.charAt(i))+1);
		}
	}
	public void mapeAktar2(Map<Character,Integer> map) {
		Scanner input = new Scanner(System.in);
		System.out.println("Kelime veriniz: ");
		String kelime = input.nextLine();
		
		for (char c : kelime.toCharArray()) {
			if (!map.containsKey(kelime.charAt(c))) {
				map.put(kelime.charAt(c), 1);
			}else
				map.put(kelime.charAt(c), map.get(kelime.charAt(c))+1);
		}		
	}
	
	
		
	}
	

