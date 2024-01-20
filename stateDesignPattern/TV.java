package stateDesignPattern;

public class TV {
	private State state;
	private int channel;
	private int volume;
	public TV() {
		// TODO Auto-generated constructor stub
		this.state = new OffState();
	}
	State getState() {
		return this.state;
	}
	void setState(State state) {
		this.state = state;
	}
	int getChannel() {
		return this.channel;
	}
	void setChannel(int channel) {
		this.channel = channel;
	}
	int getVolume() {
		return this.volume;
	}
	void setVolume(int volume) {
		this.volume = volume;
	}
}
