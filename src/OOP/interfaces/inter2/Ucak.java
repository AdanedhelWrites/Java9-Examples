package OOP.interfaces.inter2;

public abstract class Ucak extends Arac implements IHavaTasiti{
	int kanatUzunlugu;

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
		hiz+=50;
		
		hizGoster();
	}

	@Override
	public void yavasla() {
		System.out.println(getClass().getSimpleName());
		System.out.println("Yavasliyor..");
		hiz-=50;
		
		hizGoster();
		// TODO Auto-generated method stub
		
	}
}
