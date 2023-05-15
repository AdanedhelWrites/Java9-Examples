package solid.instagram.eDependencyInversion;

import solid.instagram.eDependencyInversion.databaselogger.IDatabase;

public class MySql implements IDatabase{

	@Override
	public void log(String ex) {
		// TODO Auto-generated method stub
		System.out.println(ex + "-----> mysql'e loglandi");
	}

}
