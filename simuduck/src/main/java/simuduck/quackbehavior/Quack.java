package simuduck.quackbehavior;

import simuduck.behavior.QuackBehavior;

public class Quack implements QuackBehavior {

	@Override
	public void perform() {
		// Implements duck quacking
		System.out.println("Quack");
	}

}
