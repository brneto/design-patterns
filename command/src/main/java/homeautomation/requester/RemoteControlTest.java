package homeautomation.requester;

import homeautomation.command.Command;
import homeautomation.command.LightOnCommand;
import homeautomation.invoker.RemoteControl;
import homeautomation.receiver.Light;

public class RemoteControlTest {
	public static void main(String[] args) {
		RemoteControl remote = new RemoteControl();
		Command lightOn = new LightOnCommand(new Light());
		
		remote.setCommand(lightOn);
		remote.buttonWasPressed();
	}

}
