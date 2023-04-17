package OOP.stream;

import java.net.MulticastSocket;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamTest {

	public static void main(String[] args) {
		List<String> aylar = new ArrayList<>(List.of("Ocak","Subat","Mart","Nisan","Mayis","Haziran","Temmuz","Agustos","Eylul","Ekim","Kasim","Aralik"));
		//foreach
		aylar.stream().forEach(a-> System.out.println(a.toLowerCase()));
		
		aylar.stream().forEach(a -> {a=a.substring(0,3);
										a = "-" + a;
										System.out.println(a);
									});
		//map
		aylar.stream().map(a-> a.toLowerCase()).forEach(System.out::println);
		aylar.stream().map(x->{
			x = x.substring(0,3);
			x = "-" + x;			
			return x;
		}).forEach(System.out::println);;
		
		List<String> aylarList=aylar.stream().map(x->{
			x = x.substring(0,3);
			x = "-" + x;			
			return x;
		}).collect(Collectors.toList());
		
		aylarList.forEach(System.out::println);
		//filter
		
		aylar.stream().filter(a-> a.startsWith("A")).forEach(System.out::println);
		System.out.println("**************");
		List<String> liste2 = aylar.stream().filter(a-> a.startsWith("M")).collect(Collectors.toList());
		liste2.forEach(a -> System.out.println(a));
		List<String> liste3 = aylar.stream().filter(a-> {
					if (a.startsWith("M")) {
						return true;
					}else
						return false;
			
			
		}).collect(Collectors.toList());
		System.out.println(liste3);
		List<Integer> sayilar = new ArrayList<>(List.of(5,10,7,2,5,2,15));
		List<String> liste4 = sayilar.stream().filter(x -> x > 5).map(y -> "-" + y).collect(Collectors.toList());
		liste4.forEach(System.out::println);
		
		Map<String, Integer> maps = aylar.stream().collect(Collectors.toMap((k->k), v->v.length()));
		Map<Integer, List<String>> maps2 = aylar.stream().collect(Collectors.groupingBy((String::length)));
		maps.entrySet().stream().forEach(System.out::println);
		maps2.entrySet().stream().forEach(System.out::println);
		
	}

}
