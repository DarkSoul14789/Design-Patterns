package observerPattern.observer;

import observerPattern.observable.IWeatherObservable;

public class TVDisplay implements IDisplayObserver{
	IWeatherObservable obj;
	public TVDisplay(IWeatherObservable obj) {
		this.obj = obj;
	}
	@Override
	public void update() {
		int data = obj.getWeatherData();
		System.out.println("TV display data: "+data);
	}

}
