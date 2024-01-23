package commandPattern.command;

import commandPattern.receiver.AC;

public class TurnOnCommand implements ICommand{
	AC ac;
	public TurnOnCommand(AC ac) {
		// TODO Auto-generated constructor stub
		this.ac=ac;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.ac.turnOn();
		
	}
	@Override
	public void undo() {
		// TODO Auto-generated method stub
		this.ac.turnOff();
	}

}
