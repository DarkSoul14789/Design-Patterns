package commandPattern;

import commandPattern.command.SetTemperatureCommand;
import commandPattern.command.TurnOffCommand;
import commandPattern.command.TurnOnCommand;
import commandPattern.invoker.RemoteControl;
import commandPattern.receiver.AC;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AC ac = new AC();
		RemoteControl remoteControl = new RemoteControl();
		
		remoteControl.setCommand(new TurnOnCommand(ac));
		remoteControl.pressButton();
		
		remoteControl.setCommand(new SetTemperatureCommand(ac, 24));
		remoteControl.pressButton();
		
		remoteControl.setCommand(new SetTemperatureCommand(ac, 21));
		remoteControl.pressButton();
		
		remoteControl.setCommand(new TurnOffCommand(ac));
		remoteControl.pressButton();
		
		remoteControl.undo();
	}

}
