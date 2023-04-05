package OOP.interfaces.inter2;

public class KargoUcagi extends Ucak implements IYuk{

	
	
	@Override
	public void yukAl() {
		System.out.println(getClass().getSimpleName()+" Yuku Aldi");
	}

	@Override
	public void yukBosalt() {
		// TODO Auto-generated method stub
		System.out.println("Yuk Bosaltildi");
		
	}

}
