package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOrnek2 {
	public static void main(String[] args) {
		try(BufferedWriter writer2 = new BufferedWriter(new FileWriter("D:/denem.txt"))){
			writer2.write("Adanedhel\n");
			writer2.write("Elrond");
			writer2.newLine();
			writer2.write("Elven Lords");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try(BufferedReader reader = new BufferedReader(new FileReader("D:/denem.txt"))){
//			System.out.println(reader.readLine());
//			System.out.println(reader.readLine());
//			System.out.println(reader.readLine());
//			System.out.println(reader.readLine());
			String deger;
			while ((deger = reader.readLine()) != null) {
				System.out.println(deger);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
