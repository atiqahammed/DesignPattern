package privateClasses;

public class DatabaseInstance {

	private static DatabaseInstance databaseInstance = new DatabaseInstance();
	private DatabaseInstance(){};
	
	public static DatabaseInstance getDatabaseInstance() {
		return databaseInstance;
	}
	
	public void testDataBase(){
		System.out.println("got it");
	}	
}