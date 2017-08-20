package simuduck.client;

import simuduck.behavior.Quackable;

public class RubberDuck implements Quackable {

	@Override
	public void quack() {
		System.out.println("Squeak");
	}

}
