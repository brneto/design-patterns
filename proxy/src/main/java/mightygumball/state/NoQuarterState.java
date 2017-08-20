package mightygumball.state;

import mightygumball.service.GumballMachine;

public class NoQuarterState implements State {
	private static final long serialVersionUID = -5372315877491892651L;
	
	transient GumballMachine gumballMachine;

	public NoQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You inserted a quarter");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		System.out.println("You haven’t inserted a quarter");
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned, but there’s no quarter");
	}

	@Override
	public void dispense() {
		System.out.println("You need to pay first");
	}
	
	@Override
	public void refill() {

	}
	
	@Override
	public String toString() {
		return "waiting for quarter";
	}

}