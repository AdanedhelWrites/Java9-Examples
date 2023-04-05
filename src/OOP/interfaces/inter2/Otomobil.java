package OOP.interfaces.inter2;

public class Otomobil extends Arac implements IKaraTasiti{

	@Override
	public void sur() {
		// TODO Auto-generated method stub
		System.out.println("Suruluyor..");
	}

	@Override
	public void hizlan() {
		// TODO Auto-generated method stub
		System.out.println(getClass().getSimpleName());
		System.out.println("Hizlaniyor..");
		hiz+=20;		
		hizGoster();
	}

	@Override
	public void yavasla() {
		// TODO Auto-generated method stub
		System.out.println(getClass().getSimpleName());
		System.out.println("Yavasliyor..");
		hiz-=20;		
		hizGoster();
	}
	
}
