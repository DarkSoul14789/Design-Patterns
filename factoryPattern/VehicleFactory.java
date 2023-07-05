package factoryPattern;

public class VehicleFactory {

	public static Vehicle getInstance(String type) {
		if(type.equals("Car")) {
			return new Car();			
		}
		else if(type.equals("Bike")) {
			return new Bike();
		}
		return null;
		
	}
	
}
