package simuduck.client;

import simuduck.behavior.Quackable;

public class DuckCall implements Quackable {

	@Override
	public void quack() {
		System.out.println("Kwak");
	}

}
