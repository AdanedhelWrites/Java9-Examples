package threadgiris;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calisan calisan1 = new Calisan("Adanedhel");
		Calisan calisan2 = new Calisan("Elrond");
		
//		calisan1.calis();
//		calisan2.calis();
		calisan1.start();
		calisan2.start();
	}

}
