package commandPattern.command;

import commandPattern.receiver.AC;

public class SetTemperatureCommand implements ICommand{
	AC ac;
	int temperature;
	public SetTemperatureCommand(AC ac, int temperature) {
		// TODO Auto-generated constructor stub
		this.ac=ac;
		this.temperature=temperature;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.ac.setTemperature(temperature);
		
	}
	@Override
	public void undo() {
		// TODO Auto-generated method stub
	}
	
}
