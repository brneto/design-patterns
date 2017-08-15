package mightygumball.state.concrete;

import mightygumball.context.GumballMachine;
import mightygumball.state.State;

public class WinnerState implements State {
	GumballMachine gumballMachine;

	public WinnerState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub

	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub

	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		dispense();
	}

	private void dispense() {
		// TODO Auto-generated method stub

	}

}
