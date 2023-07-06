package proxyPattern;

public class DatabaseExecutorImpl implements DatabaseExecuter{

	@Override
	public void executeQuery(String query) throws Exception {
		System.out.println("Executing query: "+query);
	}

}
