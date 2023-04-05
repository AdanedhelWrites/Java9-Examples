package OOP.interfaces.inter2;

public class Kamyon extends Arac implements IKaraTasiti, IYuk{
	String dorseTipi;
	int kasaUzunlugu;
	@Override
	public void sur() {
		// TODO Auto-generated method stub
		System.out.println("Suruluyor");
	}
	@Override
	public void yukAl() {
		// TODO Auto-generated method stub
		System.out.println(getClass().getSimpleName() +" Yuku aldi");
	}
	@Override
	public void yukBosalt() {
		// TODO Auto-generated method stub
		System.out.println("Yuk bosaltildi");
		
	}
	@Override
	public void hizlan() {
		// TODO Auto-generated method stub
		System.out.println(getClass().getSimpleName());
		System.out.println("Hizlaniyor..");
		hiz+=5;
		
		hizGoster();
	}
	@Override
	public void yavasla() {
		// TODO Auto-generated method stub
		System.out.println(getClass().getSimpleName());
		System.out.println("Hizlaniyor..");
		hiz-=5;
		
		hizGoster();
	}
}
