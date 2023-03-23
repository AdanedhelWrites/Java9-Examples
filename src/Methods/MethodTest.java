package Methods;

public class MethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		metot1();
		metot2("Adanedhel",5,10);
	}
	//VOID : dönüşü olmayan parametresiz metot tipi -- bize bir değer döndürmüyor
	//VOID : SADECE İÇERİDEKİLERİ YAPAR
	public static void metot1() {
		System.out.println("Hail! Lord Elrond!");
	}
	//VOID : dönüşü olmayan parametreli metot tipi -- bize bir değer döndürmüyor
	//VOID : SADECE İÇERİDEKİLERİ YAPAR FAKAT DIŞARIDAN DEĞERLERİ ALIR
	public static void metot2(String value,int i,int j) {
		System.out.println(value);
		int toplam = i + j;
		System.out.println(toplam);
		
	}

}
