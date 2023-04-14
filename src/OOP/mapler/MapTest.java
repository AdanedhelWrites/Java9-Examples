package OOP.mapler;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Collection;
import java.util.HashMap;

public class MapTest {
	/*
	 * 
	 */
	public static void main(String[] args) {
		Map<String, String> map1 = new HashMap<>();
		map1.put("06", "Ankara");
		map1.put("34", "Istanbul");
		map1.put("35", "Izmir");
		map1.put("05", "Amasya");

		System.out.println(map1.get("06"));
		map1.keySet().forEach(System.out::println);
		map1.replace("05", "AMASYA");
		System.out.println("**************");
		System.out.println(map1.get("05"));
		map1.remove("05");
		System.out.println("**************");
		System.out.println("**************");
		System.out.println(map1.containsKey("06"));
		System.out.println(map1);
		System.out.println("**************");
		map1.values().forEach(System.out::println);
		System.out.println("**************");
		Collection<String> iller = map1.values();
		System.out.println(iller);

		System.out.println("**************");
		map1.forEach((k, v) -> System.out.println(k + "=======>" + v)); // BURASI FENALIK BURASI AKLINDA KALSIN
		System.out.println("**************");

		for (Entry<String, String> il : map1.entrySet()) {
			if (il.getKey().equals("06")) {
				il.setValue("ANKARA");
			}
			System.out.println(il);
		}

	}

}
