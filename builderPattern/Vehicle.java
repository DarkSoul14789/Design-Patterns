package builderPattern;

public class Vehicle {
//	required arguments
	private String engine;
	private int wheels;
	
	
//	optional argument
	private int airbags;


	public String getEngine() {
		return engine;
	}


	public int getWheels() {
		return wheels;
	}


	public int getAirbags() {
		return airbags;
	}
	
//	private constructor
	private Vehicle(VehicleBuilder vehicleBuilder){
		this.engine = vehicleBuilder.engine;
		this.wheels = vehicleBuilder.wheels;
		this.airbags = vehicleBuilder.airbags;
	}
	
	public static class VehicleBuilder {
		private String engine;
		private int wheels;
		
		private int airbags;
		
		public VehicleBuilder(String engine, int wheels) {
			this.engine = engine;
			this.wheels = wheels;
		}
		
		public VehicleBuilder setAirbags(int airbags) {
			this.airbags = airbags;
			return this;
		}
		
		public Vehicle build() {
			return new Vehicle(this);
		}
	}
}





