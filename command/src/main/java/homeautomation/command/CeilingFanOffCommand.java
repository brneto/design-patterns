package homeautomation.command;

import homeautomation.receiver.CeilingFan;

public class CeilingFanOffCommand implements Command {
	CeilingFan ceilingFan;
	int prevSpeed;

	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.off();
	}

	@Override
	public void undo() {
		switch (prevSpeed) {
		case CeilingFan.HIGH:
			ceilingFan.high();
			return;
		case CeilingFan.MEDIUM:
			ceilingFan.medium();
			return;
		case CeilingFan.LOW:
			ceilingFan.low();
			return;
		case CeilingFan.OFF:
			ceilingFan.off();
			return;
		}
	}

}
