package homeautomation.requester;

import homeautomation.command.Command;
import homeautomation.command.GarageDoorOpenCommand;
import homeautomation.command.LightOnCommand;
import homeautomation.invoker.RemoteControl;
import homeautomation.receiver.GarageDoor;
import homeautomation.receiver.Light;

public class RemoteControlTest {
	public static void main(String[] args) {
		RemoteControl remote = new RemoteControl();
		Command lightOn = new LightOnCommand(new Light());
		Command garageOpen = new GarageDoorOpenCommand(new GarageDoor());
		
		remote.setCommand(lightOn);
		remote.buttonWasPressed();
		
		remote.setCommand(garageOpen);
		remote.buttonWasPressed();
	}

}
