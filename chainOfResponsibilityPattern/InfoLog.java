package chainOfResponsibilityPattern;

public class InfoLog extends LogProcessor{

	
	
	void log(int logLevel, String message) {
		if(logLevel == INFO) {
			System.out.println(message);
		}else {
			super.log(logLevel, message);
		}
	}
}
