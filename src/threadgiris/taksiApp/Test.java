package threadgiris.taksiApp;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Durak durak = new Durak();
		for (int i = 0; i < 50; i++) {
			Thread th1 = new Thread(durak.getTaksiler().get(i));
			th1.start();			
		}
		System.out.println("*************");
	}
}
