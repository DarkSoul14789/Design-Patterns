package stateDesignPattern;

public class OnState implements State{

	@Override
	public void turnOn(TV tv) throws Exception{
		// TODO Auto-generated method stub
		throw new Exception("TV is already turned on");
	}

	@Override
	public void turnOff(TV tv) {
		// TODO Auto-generated method stub
		tv.setState(new OffState());
		System.out.println("TV is turned off");
	}

	@Override
	public void changeChannel(TV tv, int channel) {
		// TODO Auto-generated method stub
		tv.setChannel(channel);
		System.out.println("TV channel is changed to "+channel);
	}

	@Override
	public void increaseVolume(TV tv) {
		// TODO Auto-generated method stub
		tv.setVolume(tv.getVolume()+1);;
	}

	@Override
	public void decreaseVolume(TV tv) {
		// TODO Auto-generated method stub
		tv.setVolume(tv.getVolume()-1);
	}

}
