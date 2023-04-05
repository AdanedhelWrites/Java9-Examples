package OOP.interfaces.inter2;
/*
 * abstract siniflarda ne zaman abstract metot yazariz ?
 *	metot altsiniflarda değişime uğruyorsa abstract metot yazariz
 * uğramıyorsa gövdeli metot yazarız
 * 
 * ucaklarda 50 50
 * gemilerde 10 10
 * otomobiler 20 20
 * kamyon 5 5
 */

public abstract class Arac implements IHareket{
	int hiz;
		
	public abstract void hizlan();
			
	
	public abstract void yavasla();
		
	public void hizGoster() {
		System.out.println("Hiziniz ==> " + hiz);
	}
		
		
	}
	

