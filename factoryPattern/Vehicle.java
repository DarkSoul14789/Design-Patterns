package factoryPattern;

public abstract class Vehicle {

	public abstract int getWheels();

	@Override
	public String toString() {
		return "Vehicle []";
	}
}

class Car extends Vehicle{

	@Override
	public int getWheels() {
		return 4;
	}
	
}


class Bike extends Vehicle{

	@Override
	public int getWheels() {
		return 2;
	}
	
}