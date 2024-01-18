package observerPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IWeatherObservable weatherObservable = new WeatherObservable();
		weatherObservable.setWeatherData(30);
		
		IDisplayObserver mobileDisplay = new MobileDisplay(weatherObservable);
		IDisplayObserver TVDisplay = new TVDisplay(weatherObservable);
		
		weatherObservable.add(mobileDisplay);
		weatherObservable.add(TVDisplay);
		
		weatherObservable.setWeatherData(32);
		weatherObservable.setWeatherData(34);
		
		weatherObservable.remove(mobileDisplay);
		
		weatherObservable.setWeatherData(29);
	}

}
