package homeautomation.command;

import homeautomation.receiver.CeilingFan;

public class CeilingFanHighCommand implements Command {
	private CeilingFan ceilingFan;
	private int prevSpeed;
	
	public CeilingFanHighCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.high();
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
