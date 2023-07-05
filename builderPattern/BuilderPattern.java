package builderPattern;

public class BuilderPattern {

	public static void main(String[] args) {
		
		Vehicle car = new Vehicle.VehicleBuilder("1200cc", 4).setAirbags(2).build();
		Vehicle bike = new Vehicle.VehicleBuilder("350cc", 2).build();
		
		System.out.println(car.getEngine());
		System.out.println(car.getWheels());
		System.out.println(car.getAirbags());
		
		System.out.println(bike.getEngine());
		System.out.println(bike.getWheels());
		System.out.println(bike.getAirbags());

	}

}
