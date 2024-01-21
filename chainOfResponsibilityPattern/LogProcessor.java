package chainOfResponsibilityPattern;

public abstract class LogProcessor {
	public static int INFO = 1;
	public static int DEBUG = 2;
	public static int ERROR = 3;
	
	private LogProcessor nextLogProcessor;
	void setNext(LogProcessor nextLogProcessor) {
		this.nextLogProcessor = nextLogProcessor;
	}
	
	void log(int logLevel, String message) {
		if(nextLogProcessor != null) {
			nextLogProcessor.log(logLevel, message);			
		}else {
			System.out.println("Null handler");			
		}
	}
}
