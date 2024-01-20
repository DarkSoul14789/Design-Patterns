package stateDesignPattern;

public interface State {
	void turnOn(TV tv) throws Exception;
	void turnOff(TV tv) throws Exception;
	void changeChannel(TV tv, int channel) throws Exception;
	void increaseVolume(TV tv) throws Exception;
	void decreaseVolume(TV tv) throws Exception;
}
