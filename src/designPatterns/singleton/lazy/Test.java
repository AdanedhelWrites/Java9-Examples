package designPatterns.singleton.lazy;

public class Test {
	public static void main(String[] args) {
		//Robot robot = Robot.getInstance();
		EvHalki baba = new EvHalki();
		EvHalki anne = new EvHalki();
		EvHalki cocuk = new EvHalki();
						
		anne.start();
		baba.start();
		cocuk.start();
		
		try {
			anne.join();
			baba.join();
			cocuk.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
