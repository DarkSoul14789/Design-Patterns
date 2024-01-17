package strategyPattern;

import strategyPattern.strategy.SpecialDrive;

public class SportsVehicle extends Vehicle{
	SportsVehicle() {
	super(new SpecialDrive());
}
}
