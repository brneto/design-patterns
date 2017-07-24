package homeautomation.command;

import homeautomation.receiver.Hottub;

public class HottubOffCommand implements Command {
	private Hottub hottub;

	public HottubOffCommand(Hottub hottub) {
		this.hottub = hottub;
	}

	@Override
	public void execute() {
		hottub.jetsOff();
	}

	@Override
	public void undo() {
		hottub.jetsOn();
	}

}
