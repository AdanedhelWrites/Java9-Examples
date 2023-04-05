package OOP.interfaces.inter2;

public class Helikopter extends Arac implements IHavaTasiti{

	@Override
	public void kalkisYap() {
		// TODO Auto-generated method stub
		System.out.println(getClass().getSimpleName());
		System.out.println("Kalkis yapiyor kemerleri baglayin");
	}

	@Override
	public void inisYap() {
		// TODO Auto-generated method stub
		System.out.println(getClass().getSimpleName());
		System.out.println("Inis yapiyor kemerleri baglayin");
	}

	@Override
	public void hizlan() {
		// TODO Auto-generated method stub
		System.out.println(getClass().getSimpleName());
		System.out.println("Hizlaniyor..");
		hiz+=40;
		
		hizGoster();
	}

	@Override
	public void yavasla() {
		// TODO Auto-generated method stub
		System.out.println(getClass().getSimpleName());
		System.out.println("Hizlaniyor..");
		hiz-=40;
		
		hizGoster();
	}
	
}
