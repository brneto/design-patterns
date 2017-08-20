package simuduck.client;

import simuduck.behavior.Quackable;

public class MallardDuck implements Quackable {

	@Override
	public void quack() {
		System.out.println("Quack");
	}

}
