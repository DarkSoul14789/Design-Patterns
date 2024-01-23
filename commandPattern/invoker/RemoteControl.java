package commandPattern.invoker;

import java.util.Stack;

import commandPattern.command.ICommand;

public class RemoteControl {
	ICommand command;
	Stack<ICommand> acCommandHistory = new Stack<>();
	Stack<Integer> tempHistory = new Stack<>();
	
	public void setCommand(ICommand command) {
		this.command = command;
	}
	
	public void pressButton() {
		this.command.execute();
		acCommandHistory.add(command);
	}
	
	public void undo() {
		if(!acCommandHistory.empty()) {
			acCommandHistory.pop().undo();
		}
	}
	
	
}
