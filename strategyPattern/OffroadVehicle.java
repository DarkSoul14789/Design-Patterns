package strategyPattern;

import strategyPattern.strategy.SpecialDrive;

public class OffroadVehicle extends Vehicle{

	OffroadVehicle() {
		super(new SpecialDrive());
	}

}
