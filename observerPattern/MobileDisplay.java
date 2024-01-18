package observerPattern;

public class MobileDisplay implements IDisplayObserver{
	IWeatherObservable obj;
	public MobileDisplay(IWeatherObservable obj) {
		this.obj = obj;
	}
	@Override
	public void update() {
		int data = obj.getWeatherData();
		System.out.println("Mobile display data: "+data);
	}

}
