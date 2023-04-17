package OOP.geneltekrarodevi.sanslinumaralar;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SansliNumaralar sanslilar = new SansliNumaralar();
		sanslilar.mapOlustur();
		sanslilar.map.entrySet().forEach(System.out::println);
		sanslilar.listeOlustur();
		System.out.println(sanslilar.list.size());
		sanslilar.list.forEach(System.out::println);
		sanslilar.setOlustur();
		System.out.println("Sansli Numaralarim");
		sanslilar.set.forEach(System.out::println);
		System.out.println("******************");
		sanslilar.set.stream().filter(s -> s > 42).forEach(s -> System.out.println(s));
		
		System.out.println("******************");
		int sum = sanslilar.set.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		int sum2 = sanslilar.set.stream().reduce(0, (a,b)-> a + b);
		System.out.println(sum2);
		
		System.out.println("******************");
		OptionalDouble average = sanslilar.set.stream().mapToInt(Integer::intValue).average();
		System.out.println(average.getAsDouble());
		Integer average2 = sanslilar.set.stream().reduce(0,(a,b) -> a + b);//BAK BAK
		System.out.println(average2);
		
		System.out.println("******************");
		int sum3kirkIkiTop = sanslilar.set.stream().filter(s -> s > 42).reduce(0, (a,b)-> a+b);	
		long sum3kirkIkiC =  sanslilar.set.stream().filter(s-> s> 42).count();
		double sonuc = sum3kirkIkiTop / sum3kirkIkiC;
		System.out.println(sonuc);		
		
		System.out.println("******************");
		OptionalDouble sum3kirkIkiOrt = sanslilar.set.stream().filter(s -> s > 42).mapToDouble(Integer::intValue).average();
		System.out.println(sum3kirkIkiOrt.getAsDouble());
		Double sum3kirkIkiOrt2 = sanslilar.set.stream().filter(s -> s > 42).collect(Collectors.averagingDouble(Integer::intValue));
		System.out.println(sum3kirkIkiOrt2);
		Double sum3kirkIkiOrt3 = sanslilar.set.stream().filter(s -> s > 42).collect(Collectors.averagingDouble(y -> y));
		System.out.println(sum3kirkIkiOrt3);
		
		System.out.println("*********************");
		OptionalInt enBuyukSayi = sanslilar.set.stream().mapToInt(Integer::intValue).max();
		System.out.println(enBuyukSayi.getAsInt());
		Optional<Integer> enBuyukSayi2 = sanslilar.set.stream().reduce(Integer::max);
		System.out.println(enBuyukSayi2);
		Optional<Integer> enBuyukSayi3 = sanslilar.set.stream().max(Comparator.naturalOrder());
		System.out.println(enBuyukSayi3);
		
		System.out.println("*********************");
		Optional<Integer> min = sanslilar.set.stream().min(Comparator.naturalOrder());
		System.out.println(min);		
		OptionalInt enKucukSayi = sanslilar.set.stream().mapToInt(Integer::intValue).min();
		System.out.println(enKucukSayi.getAsInt());
		
		System.out.println("*********************");
		long size = sanslilar.set.stream().filter(s -> s > 50).count();
		System.out.println(size);
		
		System.out.println("*********************");
		List<String> liste = sanslilar.set.stream().map(String::valueOf).collect(Collectors.toList());
		System.out.println(liste);
		
		System.out.println("*********************");
		String topla = liste.stream().collect(Collectors.joining(",")); 
		System.out.println(topla);
		
		Collections.shuffle(sanslilar.list);
		
		System.out.println("*********************");
		List<Integer> yirmi = sanslilar.list.stream().skip(250).limit(20).collect(Collectors.toList());
		System.out.println(yirmi);
		Boolean kontrol = yirmi.stream().anyMatch(s -> s == 50);
		System.out.println(kontrol);
		
	}
}
