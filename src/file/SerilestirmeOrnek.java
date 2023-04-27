package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class SerilestirmeOrnek {

	public static void main(String[] args) {
		Movie film1 = new Movie("Yolcu", "Korku", LocalDate.of(2023, 4, 21));
		Movie film2 = new Movie("Kacak", "Aksiyon", LocalDate.of(2022, 7, 29));
		
		serilestir(film1);
		deserilestir();
		serilestir(film2);
		deserilestir();
	}

	public static void deserilestir() {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		Movie film1;
		try {
			fis = new FileInputStream("D:/seriles.txt");
			ois = new ObjectInputStream(fis);
			film1 =(Movie) ois.readObject();
			System.out.println(film1 + ": deserilize oldu");
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				fis.close();
				ois.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public static void deserilestir2() {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		Movie film1;
		try {
			fis = new FileInputStream("D:/seriles.txt");
			ois = new ObjectInputStream(fis);
			try {
				while ((film1=(Movie) ois.readObject()) != null) {
					System.out.println(film1);
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			film1 =(Movie) ois.readObject();
			System.out.println(film1 + ": deserilize oldu");
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				fis.close();
				ois.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	public static void serilestir(Movie film1) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("D:/seriles.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(film1);
			System.out.println(film1 + ": serilesti");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
