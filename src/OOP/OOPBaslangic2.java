package OOP;

public class OOPBaslangic2 {

	int number1;// bu bir nesne'nin değişkenidir --nesne özelliği--

	static int number2 = 10;// bu bir sınıf değişkenidir. --sınıf özelliği--

	public static void main(String[] args) {
		OOPBaslangic2 myStaticExample = new OOPBaslangic2(); // nesne üretilen kod
		System.out.println(myStaticExample.number1);
		myStaticExample.number1 = 12;
		System.out.println(myStaticExample.number1);

		System.out.println(number2);

	}

	public void noBer() {
		System.out.println(number1);
		System.out.println(number2);
	}

	public static void noVer2() {// static metod içinde static olmayan bir özellik direkt kullanılamaz nesne
									// üretilmek zorunlulugu var
		// System.out.println(number1);
		System.out.println(number2);
	}

}
