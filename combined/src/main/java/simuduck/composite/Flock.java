package simuduck.composite;

import java.util.ArrayList;

import simuduck.behavior.Quackable;

public class Flock implements Quackable {
	ArrayList<Quackable> quarckers = new ArrayList<Quackable>();
	
	public void add(Quackable quarcker) {
		quarckers.add(quarcker);
	}

	@Override
	public void quack() {
		quarckers.forEach(Quackable::quack);
	}

}
