package OOP;

public class StudentsTest {

	public static void main(String[] args) {		
		
		Students ogrenci1 = new Students();
		ogrenci1.adi = "Turin Turambar";
		//ogrenci1.no = 2023756493;
		
		ogrenci1.kayit();
		
		Students ogrenci2 = new Students();
		ogrenci2.adi ="Kamil";
		ogrenci2.kayit();
		
		System.out.println("\n" +ogrenci1.no);
	
		

	}

}
