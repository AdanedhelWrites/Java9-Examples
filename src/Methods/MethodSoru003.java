package Methods;

import java.util.Scanner;

public class MethodSoru003 {

	public static void main(String[] args) {
		/*
		 * TÜRKÇE KARAKTERLERİ İNGİLİZCE YAPMAK BU KELİME İÇERİSİNDE GEÇEN TÜRKÇE
		 * KARAKTERLERİ İNG KARAKTERLERE DÖNÜŞTÜR
		 * 
		 **/
		char[] turkishWords = { 'İ', 'ı', 'ş', 'Ş', 'Ç', 'ç', 'Ğ', 'ğ', 'ü', 'Ü', 'ö', 'Ö' };
		char[] englishWords = { 'I', 'i', 's', 'S', 'C', 'c', 'G', 'g', 'u', 'U', 'o', 'O' };
		
		
		System.out.println(replaceWords(turkishWords,englishWords));
	}

	private static String replaceWords(char[] turkishWords, char[] englishWords) {
		Scanner input= new Scanner(System.in);
		System.out.println("Lütfen bir kime giriniz ");
		String value=input.nextLine();
		for (int i = 0; i < englishWords.length; i++) {
			value = value.replace(turkishWords[i], englishWords[i]);
		}
		input.close();
		return value;
		
	}

}
