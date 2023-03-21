package stringler;

public class VirguldenSonraKelimeleriAyirma {

	public static void main(String[] args) {
		// Herşeyin sonuna virgül koyan uygulamayı yazın
		// Bu string değerini virgüllerden sonra ayırıp alt alta yazalım
		String kelime = "Hayat kısa kuşlar uçuyor";

		kelime = kelime.replace(" ", ",");
		int index = 0;
		for (int i = 0; i < kelime.length(); i++) {
			if (kelime.charAt(i) == ',') {
				System.out.println(kelime.substring(index, i));// indexi al bunu i'ye yani virgüle kadar oku.
				index = i + 1;// indexi 1 arttır demek virgülden sonraki harften devam ederek bakar.
			}
		}
		System.out.println(kelime.substring(index));
		System.out.println("************");
		
		for (int i = 0; i < kelime.length(); i++) {
			if(kelime.charAt(i) == ',') {
				System.out.println();
			}else {
				System.out.print(kelime.charAt(i));
			}
			
		}
		System.out.println();
		System.out.println("**********************");
		
		System.out.println(kelime.replace(",", "\n"));//tek satırda finish bu
	}

}
