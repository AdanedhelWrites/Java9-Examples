package OOP.enums;

public class EnumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(EAylar.MAYIS.ordinal() + 1);
		EAylar ay = EAylar.valueOf("MAYIS");
		System.out.println(ay.ordinal());

		EAylar[] aylar = EAylar.values();
		for (EAylar ayciklar : aylar) {
			System.out.println((ayciklar.ordinal() + 1) +".ay " +ayciklar);
		}
		System.out.println(EAylar.MART.i);
	}

}
