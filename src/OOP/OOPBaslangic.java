package OOP;

public class OOPBaslangic {
	// primitive veri türü değişkenlerinin verileri: stack bellekte tutulur
	// referans veri türü değişkenlerinin verileri: heap'te tutulur

	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		System.out.println(a + "\n" + b);

		a = b;
		b = 8;
		System.out.println(a);
		System.out.println(b);

		String[] sehirler = { "Ankara", "Istanbul", "Bursa", "Izmır" };
		String[] sehirler2 = { "Sivas", "Adiyaman", "Antalya", "Yalova" };

		System.out.println(sehirler[0]);
		System.out.println(sehirler2[1]);

		sehirler2 = sehirler; // referans türler oldugu için atama değil gösterme olur
		System.out.println(sehirler2[0]);
		sehirler[0] = "Bolu";
		System.out.println(sehirler2[0]);
		sehirler2[1] = "Canakkale";
		System.out.println(sehirler[1]);
	}
}
