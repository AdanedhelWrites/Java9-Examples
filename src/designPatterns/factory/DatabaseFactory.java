package designPatterns.factory;

public class DatabaseFactory {
	public static ILogger createDatabase(String dbName) {
		
		switch (dbName) {
		case "postgre":
			return new PostgreSql();
			
		case "mongo":
			return new MongoDB();
			
		default:			
			throw new RuntimeException("Girdiginiz database desteklenmiyor");
		}
		
	}
}
