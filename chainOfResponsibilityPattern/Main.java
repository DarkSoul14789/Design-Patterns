package chainOfResponsibilityPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		LogProcessor logger = new InfoLog(new DebugLog(new ErrorLog(null)));
		LogProcessor logger = new InfoLog();
		LogProcessor l2 = new DebugLog();
		LogProcessor l3 = new ErrorLog();
		
		logger.setNext(l2);
		l2.setNext(l3);
		l3.setNext(null);
		
		logger.log(LogProcessor.DEBUG, "Need to debug");
		logger.log(LogProcessor.INFO, "Only for info");
		logger.log(LogProcessor.ERROR, "Error alert");
		logger.log(4, "level 4");
	}

}
