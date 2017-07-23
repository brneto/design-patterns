package homeautomation.invoker;

import homeautomation.command.Command;
import homeautomation.command.NoCommand;

public class RemoteControl {
	Command[] onCommands, offCommands;

	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];

		Command noCommand = new NoCommand();
		for (int i = 0; i < 7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}

	public void setCommand(int slot, Command onCommand, Command offCommand) {
		this.onCommands[slot] = onCommand;
		this.offCommands[slot] = offCommand;
	}

	public void onButtonWasPressed(int slot) {
		onCommands[slot].execute();
	}

	public void offButtonWasPressed(int slot) {
		offCommands[slot].execute();
	}

	public String toString() {
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n------ Remote Control -------\n");
		for (int i = 0; i < onCommands.length; i++) {
			stringBuff.append("[slot " + i + "] "
					+ onCommands[i].getClass().getName() + " "
					+ offCommands[i].getClass().getName() + "\n");
		}
		return stringBuff.toString();
	}

}
