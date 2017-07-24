package homeautomation.command;

import homeautomation.receiver.TV;

public class TVOnCommand implements Command {
	private TV tv;

	public TVOnCommand(TV tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.on();
		tv.setInputChannel("DVD");
	}

	@Override
	public void undo() {
		tv.off();
	}

}
