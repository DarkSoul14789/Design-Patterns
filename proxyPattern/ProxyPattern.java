package proxyPattern;

public class ProxyPattern {

	public static void main(String[] args) {
		
		DatabaseExecuter adminExecutor = new DatabaseExecutorProxy("admin", "admin@123");
		try {
			adminExecutor.executeQuery("delete");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		DatabaseExecuter nonAdminExecutor = new DatabaseExecutorProxy("non-admin", "admin@123");
		try {
			nonAdminExecutor.executeQuery("delete");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
