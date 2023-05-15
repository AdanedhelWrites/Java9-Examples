package designPatterns.factory;

public class PostgreSql implements ILogger{

	@Override
	public void logToDatabase(String message) {
		// TODO Auto-generated method stub
		System.out.println(message + "--> postgre loglandi");
	}

}
