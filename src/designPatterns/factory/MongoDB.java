package designPatterns.factory;

public class MongoDB implements ILogger{

	@Override
	public void logToDatabase(String message) {
		// TODO Auto-generated method stub
		System.out.println(message + "--> MongoDB loglandi");
	}

}
