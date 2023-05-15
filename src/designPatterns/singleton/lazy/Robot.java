package designPatterns.singleton.lazy;
/*
 * 1 tane robotumuz var bu robotumuzun çalış metodu olucak
 * calis metodunda hashcode --> numaralı robot calisiyor bu bir singleton olcak
 * 2- evhalki sinifimiz olcak bu sinifta robot cagir metodu olucak 
 * bu metod calisinca bize robottaki calis metodu cagirilcak 
 * 3--> 3 tane ev halki yaratip ayni anda robotu cagirmaya calissinlar ev halki bir thread olucak
 */
public class Robot {
	
	private static Robot instance;
	private Robot() {
		
	}
	public synchronized static Robot getInstance() {
		if (instance == null) {
			instance = new Robot();
		}
		return instance;
	}
		
	public void calis() {
		System.out.println(hashCode() + "--> robotu calisiyor");
	}
	@Override
	public String toString() {
		return "Robot [getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
}
