package chainOfResponsibilityPattern;

public class ErrorLog extends LogProcessor{

	

	void log(int logLevel, String message) {
		if(logLevel == ERROR) {
			System.out.println(message);
		}else {
			super.log(logLevel, message);
		}
	}
}
