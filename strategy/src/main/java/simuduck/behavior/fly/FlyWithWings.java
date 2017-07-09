package simuduck.behavior.fly;

import simuduck.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

	@Override
	public void perform() {
		// Implements duck flying
		System.out.println("I'm flying");
	}

}
