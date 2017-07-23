package homeautomation.requester;

import homeautomation.command.CeilingFanOffCommand;
import homeautomation.command.CeilingFanOnCommand;
import homeautomation.command.Command;
import homeautomation.command.GarageDoorDownCommand;
import homeautomation.command.GarageDoorUpCommand;
import homeautomation.command.LightOffCommand;
import homeautomation.command.LightOnCommand;
import homeautomation.command.StereoOffCommand;
import homeautomation.command.StereoOnWithCDCommand;
import homeautomation.invoker.RemoteControl;
import homeautomation.receiver.CeilingFan;
import homeautomation.receiver.GarageDoor;
import homeautomation.receiver.Light;
import homeautomation.receiver.Stereo;

public class RemoteLoader {
	public RemoteControl getRemote() {
		RemoteControl remote = new RemoteControl();
		
		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		GarageDoor garageDoor = new GarageDoor();
		Stereo stereo = new Stereo("Living Room");
		
		Command livingRoomLightOn = new LightOnCommand(livingRoomLight);
		Command livingRoomLightOff = new LightOffCommand(livingRoomLight);
		Command kitchenLightOn = new LightOnCommand(kitchenLight);
		Command kitchenLightOff = new LightOffCommand(kitchenLight);
		
		Command ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
		Command ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
		
		Command garageDoorUp = new GarageDoorUpCommand(garageDoor);
		Command garageDoorDown = new GarageDoorDownCommand(garageDoor);
		
		Command stereoOnWithCD = new StereoOnWithCDCommand(stereo);
		Command stereoOff = new StereoOffCommand(stereo);
		
		remote.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remote.setCommand(1, kitchenLightOn, kitchenLightOff);
		remote.setCommand(2, ceilingFanOn, ceilingFanOff);
		remote.setCommand(3, garageDoorUp, garageDoorDown);
		remote.setCommand(4, stereoOnWithCD, stereoOff);
		
		return remote;
	}
}
