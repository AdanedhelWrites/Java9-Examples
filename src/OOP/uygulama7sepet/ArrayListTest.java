package OOP.uygulama7sepet;

import java.util.List;
import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		List<String> urunler = new ArrayList<>(List.of("Cips", "Kola", "Cay","Yumurta","Seker", "Un", "Elma", "Karpuz","Yogurt","Yag", "Cekirdek", "Su"));
		List<String> urunler2 = new ArrayList<>(List.of("Cips", "Kola", "Cay","Yumurta","Seker", "Un", "Elma", "Karpuz","YOGURT","Yag", "Cekirdek", "Su"));
		for (String urun : urunler) {
			System.out.println(urun);
		}		
		System.out.println("******'Y' ile baslayanlar silindiginde***********");
		sil(urunler);
		for (String urun : urunler) {
			System.out.println(urun);
		}
		System.out.println("******'Y' ile baslayanlar silindiginde Terste***********");
		sil2(urunler);
		for (String urun : urunler) {
			System.out.println(urun);
		}
		System.out.println("******'YOGURT'u duzeltme Yogurt haline getirme***********");
		degistir(urunler2);
		for (String urun : urunler2) {
			System.out.println(urun);
		}
	}
	public static void degistir(List<String> urunler2) {
		for (int i = 0; i < urunler2.size(); i++) {
			if (urunler2.get(i).equalsIgnoreCase("YOGURT")) {
				urunler2.set(i, "Yogurt");
			}
		}
	}
	
	public static void sil(List<String> urunler) {
		for (int i = 0; i < urunler.size(); i++) {
			if (urunler.get(i).startsWith("Y")) {
				urunler.remove(i);
				i--;
			}
		}		
		
	}
	public static void sil2(List<String> urunler) {
		for (int i = urunler.size()-1; i >= 0; i--) {
			if (urunler.get(i).startsWith("Y")) {
				urunler.remove(i);				
			}
		}		
		
	}
		
}
