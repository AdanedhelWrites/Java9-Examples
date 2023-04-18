package OOP.exceptions;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// TODO Auto-generated method stub
		for (int i = 0; i < 4; i++) {
			try {
				degerYazdir(input.nextInt());
			} catch (EksiDegerException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}
	}
	public static void degerYazdir(int deger) throws EksiDegerException {	
		if (deger < 0) {
			throw new EksiDegerException("Eksi deger girilemez!!");
		}
		System.out.println(deger);
	}

}
