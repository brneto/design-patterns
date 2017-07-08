package simuduck.behavior.quack;

import simuduck.behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {

	@Override
	public void perform() {
		// Do nothing - can't quack!
		System.out.println("<< Silence >>");
	}

}
