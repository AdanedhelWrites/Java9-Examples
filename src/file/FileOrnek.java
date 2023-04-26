package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOrnek {

	public static void main(String[] args) {
		//output --> yazma
		//input --> okuma
		File file = new File("D:/deneme2.txt");
		File file2 = new File("D:/deneme3.txt");
		try {
			FileOutputStream fos = new FileOutputStream("D:/deneme.txt");
			FileOutputStream fos2 = new FileOutputStream(file);
			file2.createNewFile();
			fos.write(65);
			fos.write(80);
			byte[] array = {101,80,88};
			fos.write(array);
			
			String kelime = "\nHello Middle-Earth";
			fos.write(kelime.getBytes());
			
			FileInputStream fis = new FileInputStream("D:/deneme.txt");
			int deger1 = fis.read();
			//System.out.println((char)deger1); kaç değer oldugunu bilemiyebiliriz
			int deger;
			while ((deger = fis.read()) != -1) {
				System.out.print((char)deger);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			// TODO: handle exception
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
