package factoryPattern;

public class FactoryPattern {

	public static void main(String[] args) {
		Vehicle vehicle1 = VehicleFactory.getInstance("Car");
		
		System.out.println("wheels of vehicle 1: "+vehicle1.getWheels());
		
		Vehicle vehicle2 = VehicleFactory.getInstance("Bike");
		
		System.out.println("wheels of vehicle 2: "+vehicle2.getWheels());

	}

}
