package homeautomation.command;

import homeautomation.receiver.GarageDoor;

public class GarageDoorUpCommand implements Command {
	GarageDoor garageDoor;

	public GarageDoorUpCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		garageDoor.lightOn();
		garageDoor.up();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
