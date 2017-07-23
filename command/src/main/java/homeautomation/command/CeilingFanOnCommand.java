package homeautomation.command;

import homeautomation.receiver.CeilingFan;

public class CeilingFanOnCommand implements Command {
	CeilingFan ceilingFan;

	public CeilingFanOnCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		ceilingFan.medium();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
