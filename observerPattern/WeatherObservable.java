package observerPattern;

import java.util.LinkedList;
import java.util.List;

public class WeatherObservable implements IWeatherObservable{
	List<IDisplayObserver> displayList = new LinkedList<IDisplayObserver>();
	int weatherData;

	@Override
	public int getWeatherData() {
		// TODO Auto-generated method stub
		return this.weatherData;
	}

	@Override
	public void setWeatherData(int data) {
		// TODO Auto-generated method stub
		this.weatherData = data;
		this.notifyDisplays();
		
	}

	@Override
	public void notifyDisplays() {
		// TODO Auto-generated method stub
		for(IDisplayObserver display:this.displayList) {
			display.update();
		}
		
	}

	@Override
	public void add(IDisplayObserver obj) {
		// TODO Auto-generated method stub
		displayList.add(obj);
		
	}

	@Override
	public void remove(IDisplayObserver obj) {
		// TODO Auto-generated method stub
		displayList.remove(obj);
		
	}

}
