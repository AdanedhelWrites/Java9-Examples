package OOP.mapler.mapornek1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/*
 * Nu iki arrayi kullanarak bir map olusturalim
 * id degerlerine karsilik isimler gelsin
 * 
 * harcamalar mapi olusturalim isme karsi bu kisinin harcamalari gelsin
 */
public class MapOrnek {
	static String[] calisanlar = { "Mustafa", "Oznur", "Elif" };
	static int[] ids = { 1, 2, 3 };
	static Integer[][] harcamalar = { { 500, 400, 120 }, { 100, 200, 800 }, { 500, 750, 1200 } };

	public static void main(String[] args) {
		Map<Integer, String> isimler = new HashMap<>();
		Map<Integer, String> isimler2 = new HashMap<>();
		isimler.put(ids[0], calisanlar[0]);
		isimler.put(ids[1], calisanlar[1]);
		isimler.put(ids[2], calisanlar[2]);
		for (int i = 0; i < calisanlar.length; i++) {
			isimler2.put(ids[i], calisanlar[i]);
		}
		isimler.forEach((k, v) -> System.out.println(k + "-" + v));
		System.out.println(isimler2);

		Map<String, Integer[]> isimHarcama = new HashMap<>();
		for (int i = 0; i < ids.length; i++) {
			isimHarcama.put(calisanlar[i], harcamalar[i]);

		}
		for (Entry<String, Integer[]> deger : isimHarcama.entrySet()) {
			System.out.println(deger.getKey());
			for (Integer harcama : deger.getValue()) {
				System.out.println(harcama);				
			}
			System.out.println();
			
		}
		//forEach yapisiyla yazdırma
		isimHarcama.forEach((k,v) -> System.out.println(k + "-" + Arrays.toString(v)));
	}
}
