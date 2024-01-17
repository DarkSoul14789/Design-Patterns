package strategyPattern;

import strategyPattern.strategy.DriveStrategy;

public class Vehicle {
	DriveStrategy obj;
	public Vehicle(DriveStrategy obj) {
		this.obj = obj;
	}
	void drive() {
		obj.drive();
	}
}
