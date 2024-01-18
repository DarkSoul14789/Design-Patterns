package observerPattern;

public interface IWeatherObservable {
	int getWeatherData();
	void setWeatherData(int data);
	void notifyDisplays();
	void add(IDisplayObserver obj);
	void remove(IDisplayObserver obj);
}
