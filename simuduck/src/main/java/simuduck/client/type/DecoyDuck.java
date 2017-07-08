package simuduck.client.type;

import simuduck.client.Duck;

public class DecoyDuck extends Duck {

	@Override
	public void display() {
		// Looks like a decoy duck
		System.out.println("I'm a decoy duck");
	}

}
