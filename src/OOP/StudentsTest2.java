package OOP;

import java.util.Scanner;

public class StudentsTest2 {
	
	public static void main(String[] args) {
		Students[] ogrenciler= new Students[5];		
		
		for (int i = 0; i < ogrenciler.length; i++) {			 
			Students student = new Students();
			student.adi=ogrenciIsmi();
			student.kayit();
			ogrenciler[i] = student;
		}
		for (Students ogrenci : ogrenciler) {
			ogrenci.bilgileriGetir();
		}
		
		
	}
	
	public static String ogrenciIsmi() {
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen bir ögrenci ismi giriniz: ");
		String isim = input.nextLine();
		
		return isim;
	}

}
