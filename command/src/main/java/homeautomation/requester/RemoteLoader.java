package homeautomation.requester;

import homeautomation.command.CeilingFanHighCommand;
import homeautomation.command.CeilingFanMediumCommand;
import homeautomation.command.CeilingFanOffCommand;
import homeautomation.command.Command;
import homeautomation.command.GarageDoorDownCommand;
import homeautomation.command.GarageDoorUpCommand;
import homeautomation.command.HottubOffCommand;
import homeautomation.command.HottubOnCommand;
import homeautomation.command.LightOffCommand;
import homeautomation.command.LightOnCommand;
import homeautomation.command.StereoOffCommand;
import homeautomation.command.StereoOnWithCDCommand;
import homeautomation.command.TVOffCommand;
import homeautomation.command.TVOnCommand;
import homeautomation.command.macro.MacroCommand;
import homeautomation.invoker.RemoteControl;
import homeautomation.receiver.CeilingFan;
import homeautomation.receiver.GarageDoor;
import homeautomation.receiver.Hottub;
import homeautomation.receiver.Light;
import homeautomation.receiver.Stereo;
import homeautomation.receiver.TV;

public class RemoteLoader {
	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();

		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		GarageDoor garageDoor = new GarageDoor();
		Stereo stereo = new Stereo("Living Room");
		TV tv = new TV("Living Room");
		Hottub hottub = new Hottub();

		Command livingRoomLightOn = new LightOnCommand(livingRoomLight);
		Command livingRoomLightOff = new LightOffCommand(livingRoomLight);
		Command kitchenLightOn = new LightOnCommand(kitchenLight);
		Command kitchenLightOff = new LightOffCommand(kitchenLight);

		Command ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
		Command ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
		Command ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

		Command garageDoorUp = new GarageDoorUpCommand(garageDoor);
		Command garageDoorDown = new GarageDoorDownCommand(garageDoor);

		Command stereoOnWithCD = new StereoOnWithCDCommand(stereo);
		Command stereoOff = new StereoOffCommand(stereo);
		
		Command tvOn = new TVOnCommand(tv);
		Command tvOff = new TVOffCommand(tv);
		
		Command hottubOn = new HottubOnCommand(hottub);
		Command hottubOff = new HottubOffCommand(hottub);
		
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommand(2, ceilingFanMedium, ceilingFanOff);
		remoteControl.setCommand(3, ceilingFanHigh, ceilingFanOff);
		remoteControl.setCommand(4, garageDoorUp, garageDoorDown);
		remoteControl.setCommand(5, stereoOnWithCD, stereoOff);

		System.out.println(remoteControl);

		remoteControl.onButtonWasPressed(0);
		remoteControl.offButtonWasPressed(0);
		System.out.println(remoteControl);
		remoteControl.onButtonWasPressed(1);
		remoteControl.offButtonWasPressed(1);
		remoteControl.onButtonWasPressed(2);
		remoteControl.offButtonWasPressed(2);
		remoteControl.onButtonWasPressed(3);
		remoteControl.offButtonWasPressed(3);
		remoteControl.onButtonWasPressed(4);
		remoteControl.offButtonWasPressed(4);
		
		Command[] partyOn = { livingRoomLightOn, stereoOnWithCD, tvOn, hottubOn};
		Command[] partyOff = { livingRoomLightOff, stereoOff, tvOff, hottubOff};
		
		MacroCommand partyOnMacro = new MacroCommand(partyOn);
		MacroCommand partyOffMacro = new MacroCommand(partyOff);
		
		remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
		
		System.out.println(remoteControl);
		System.out.println("--- Pushing Macro On---");
		remoteControl.onButtonWasPressed(0);
		System.out.println("--- Pushing Macro Off---");
		remoteControl.offButtonWasPressed(0);
		
	}

}
