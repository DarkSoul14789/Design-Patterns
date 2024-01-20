package stateDesignPattern;

public class OffState implements State{

	@Override
	public void turnOn(TV tv) {
		// TODO Auto-generated method stub
		tv.setState(new OnState());
		System.out.println("TV is turned on");
		tv.setChannel(1);
	}

	@Override
	public void turnOff(TV tv) throws Exception{
		// TODO Auto-generated method stub
		throw new Exception("TV is already off");
	}

	@Override
	public void changeChannel(TV tv,int channel) throws Exception{
		// TODO Auto-generated method stub
		throw new Exception("Channel cannot be changed while TV is off");
	}

	@Override
	public void increaseVolume(TV tv) throws Exception{
		// TODO Auto-generated method stub
		throw new Exception("Volume cannot be chnaged while TV is off");
		
	}

	@Override
	public void decreaseVolume(TV tv) throws Exception{
		// TODO Auto-generated method stub
		throw new Exception("Volumne cannot be changed while TV is off");
	}

}
