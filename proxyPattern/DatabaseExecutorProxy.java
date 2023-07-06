package proxyPattern;

public class DatabaseExecutorProxy implements DatabaseExecuter{

	boolean isAdmin;
	DatabaseExecuter dbExecutor;
	
	public DatabaseExecutorProxy(String name, String password) {
		if(name.equals("admin") && password.equals("admin@123"))
			isAdmin = true;
		
		dbExecutor = new DatabaseExecutorImpl();
	}
	
	@Override
	public void executeQuery(String query) throws Exception {
		
		if(isAdmin)
			dbExecutor.executeQuery(query);
		else {
			if(query.equals("delete")) {
				throw new Exception("Non-admin users cannot delete");
			}
			else
				dbExecutor.executeQuery(query);
		}
		
	}

}
