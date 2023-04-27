package threadgiris.okulapp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FileManager {
	
	static File file = new File("C:\\Users\\Adanedhel\\Documents\\BilgeAdam\\eclipse-workspace\\Java9-Examples\\src\\threadgiris\\okulapp\\ogrenci.txt");
	
	public static void dosyadanVeriOku() {
		List<Ogrenci> ogrenciler = new ArrayList<>();
		String o1 = "";
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			while ((o1=reader.readLine()) != null) {
				System.out.println(o1);
				String [] array = o1.split(",");
				String isim = array[0];
				Double ort = ortHesapla(Arrays.asList(array).subList(1, 4));
				LocalDate tarih = Utility.stringToLocalDateDayMonthYear(array[4]);
				
				Ogrenci ogrenci = new Ogrenci(isim, ort, tarih);
				ogrenciler.add(ogrenci);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		ogrenciler.forEach(x -> System.out.println(x));
		
	}
	private static Double ortHesapla(List<String> list) {
		
		return list.stream().collect(Collectors.averagingDouble(x -> Double.parseDouble(x)));
	}
	
	public static void main(String[] args) {
		dosyadanVeriOku();
		
	}
}

