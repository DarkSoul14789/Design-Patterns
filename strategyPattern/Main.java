package strategyPattern;

public class Main {

	public static void main(String[] args) {
		
		Vehicle vehicleSports = new SportsVehicle();
		vehicleSports.drive(); //Special drive
		
		Vehicle vehicleOffroad = new OffroadVehicle();
		vehicleOffroad.drive(); //Special drive
		
		Vehicle vehicleNormal = new NormalVehicle();
		vehicleNormal.drive(); //Normal drive
	}

}
