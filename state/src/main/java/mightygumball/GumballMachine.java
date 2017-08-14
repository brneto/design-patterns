package mightygumball;

import mightygumball.state.HasQuarterState;
import mightygumball.state.NoQuarterState;
import mightygumball.state.SoldOutState;
import mightygumball.state.SoldState;
import mightygumball.state.State;

public class GumballMachine {
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;

	State state = soldOutState;
	int count = 0;
	
	public GumballMachine(int numberGumballs) {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
	
		this.count = numberGumballs;
		if (numberGumballs > 0) {
			state = noQuarterState;
		}
	}

	public void insertQuarter() {
		state.insertQuarter();
	}
	
	public void ejectQuarter() {
		state.ejectQuarter();
	}
	
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count = count - 1;
		}
	}
	
	public State getHasQuarterState() {
		return hasQuarterState;
	}
	
	public State getNoQuarterState() {
		return noQuarterState;
	}
	
	public State getSoldState() {
		return soldState;
	}
	
	public State getSoldOutState() {
		return soldOutState;
	}
	
	public int getCount() {
		return count;
	}
	
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004\n");
		result.append("Inventory: " + count + " gumball");
		
		if (count != 1) {
			result.append("s");
		}
		
		result.append("\nMachine is " + state + "\n");
		
		return result.toString();
	}

}
