package chainOfResponsibilityPattern;

public class DebugLog extends LogProcessor{

	
	
	void log(int logLevel, String message) {
		if(logLevel == DEBUG) {
			System.out.println(message);
		}else {
			super.log(logLevel, message);
		}
	}

}
