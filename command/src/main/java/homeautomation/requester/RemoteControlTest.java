package homeautomation.requester;

import homeautomation.invoker.RemoteControl;

public class RemoteControlTest {
	public static void main(String[] args) {
		RemoteLoader remoteLoader = new RemoteLoader();
		RemoteControl remote = remoteLoader.getRemote();
		
		System.out.println(remote);
		
		remote.onButtonWasPressed(0);
		remote.offButtonWasPressed(0);
		remote.onButtonWasPressed(1);
		remote.offButtonWasPressed(1);
		remote.onButtonWasPressed(2);
		remote.offButtonWasPressed(2);
		remote.onButtonWasPressed(3);
		remote.offButtonWasPressed(3);
		remote.onButtonWasPressed(4);
		remote.offButtonWasPressed(4);
	}

}
