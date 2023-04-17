package OOP.geneltekrarodevi.sanslinumaralar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SansliNumaralar {
	Map<Integer, Integer> map;
	List<Integer> list;
	Set<Integer> set;

	public SansliNumaralar() {
		super();
		this.map = new HashMap<>();
		this.list = new ArrayList<>();
		this.set = new TreeSet<>();
	}

	public void mapOlustur() {
		Random rand = new Random();
		for (int i = 0; i < 10000; i++) {
			int sayi = rand.nextInt(1, 101);
			if (map.containsKey(sayi)) {
				map.put(sayi, map.get(sayi) + 1);
			} else
				map.put(sayi, 1);
		}
	}

	public void listeOlustur() {
		for (Entry<Integer, Integer> sayi : map.entrySet()) {
			int sayac = sayi.getValue();
			for (int i = 0; i < sayac; i++) {
				list.add(sayi.getKey()); // Key == > Value degeri kadar döner ve listeye ekler
			}
		}
	}

	public void setOlustur() {
		Random rand = new Random();
		Collections.shuffle(list);
		while (set.size() < 10) {
			int index = rand.nextInt(list.size());
			set.add(list.get(index));
			
		}

	}

}
