package solid.instagram.eDependencyInversion.databaselogger;

public class Mongo implements IDatabase{
	public void log(String ex) {
		System.out.println(ex + "----> mongoya loglandi");
	}
}
