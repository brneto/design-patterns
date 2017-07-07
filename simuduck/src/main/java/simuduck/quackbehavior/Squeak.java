package simuduck.quackbehavior;

import simuduck.behavior.QuackBehavior;

public class Squeak implements QuackBehavior {

	@Override
	public void perform() {
		// Rubber duckie squeak
		System.out.println("Squeak");
	}

}
