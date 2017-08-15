package mightygumball.state.concrete;

import mightygumball.context.GumballMachine;
import mightygumball.state.State;

public class HasQuarterState implements State {
	GumballMachine gumballMachine;

	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You can’t insert another quarter");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Quarter returned");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned...");
		gumballMachine.setState(gumballMachine.getSoldState());
		dispense();
	}

	private void dispense() {
		System.out.println("No gumball dispensed");
	}
	
	@Override
	public String toString() {
		return "waiting for turn of crank";
	}

}
