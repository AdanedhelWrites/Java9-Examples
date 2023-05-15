package designPatterns.factory;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lutfen loglama yapacaginiz database ismini giriniz: ");
		String databaseName = scanner.nextLine();
		ILogger logger = DatabaseFactory.createDatabase(databaseName);
//		switch (databaseName) {
//		case "postgre":
//			logger = new PostgreSql();
//			break;
//		case "mongo":
//			logger = new MongoDB();
//			break;
//		default:
//			break;
//		}			
		logger.logToDatabase(databaseName);
	}
	
	
}
