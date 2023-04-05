package OOP.interfaces.inter2;

public abstract class Gemi extends Arac implements IDenizTasiti{
	int odaSayisi;
	
	
	@Override
	public void yelkenAc() {
		// TODO Auto-generated method stub
		System.out.println("Yelken acıildi");
	}

	@Override
	public void limanaYanas() {
		// TODO Auto-generated method stub
		System.out.println("Limana yanasildi");
		
	}

	@Override
	public void hizlan() {
		// TODO Auto-generated method stub
		System.out.println(getClass().getSimpleName());
		System.out.println("Hizlaniyor..");
		hiz+=10;
		
		hizGoster();
	}

	@Override
	public void yavasla() {
		// TODO Auto-generated method stub
		System.out.println(getClass().getSimpleName());
		System.out.println("Yavasliyor..");
		hiz-=10;
		
		hizGoster();
	}
}
