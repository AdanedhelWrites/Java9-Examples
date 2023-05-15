package designPatterns.singleton.lazy;

public class EvHalki extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		robotCagir();
	}
	
	
	public void robotCagir() {
		Robot.getInstance().calis();;
	}
}
