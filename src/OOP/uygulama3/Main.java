package OOP.uygulama3;

public class Main {
	public static void main(String[] args) {
		Sinav sinav = new Sinav();
		sinav.sinavOlustur();
		
		for (Soru soru : sinav.sorular) {
			System.out.println(soru);			
		}
	}
	
}
