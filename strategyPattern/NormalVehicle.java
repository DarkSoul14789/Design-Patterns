package strategyPattern;

import strategyPattern.strategy.NormalDrive;

public class NormalVehicle extends Vehicle{
	NormalVehicle() {
		super(new NormalDrive());
	}
}
