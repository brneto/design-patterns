package homeautomation.command;

import homeautomation.receiver.GarageDoor;

public class GarageDoorDownCommand implements Command {
	GarageDoor garageDoor;

	public GarageDoorDownCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		garageDoor.down();
		garageDoor.lightOff();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub

	}

}
