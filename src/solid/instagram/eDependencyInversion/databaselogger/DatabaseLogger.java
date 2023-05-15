package solid.instagram.eDependencyInversion.databaselogger;

public class DatabaseLogger implements IDatabase{
//	static Mongo mongoDb = new Mongo();
//	static Postgre postgreSql = new Postgre();
	IDatabase database;
	
	public DatabaseLogger(IDatabase database) {
		super();
		this.database = database;
	}

	@Override
	public void log(String ex) {
		// TODO Auto-generated method stub
		database.log(ex);
	}

	

	
	
	
	
}
