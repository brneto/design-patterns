package simuduck.composite;

import java.util.ArrayList;

import simuduck.behavior.Quackable;
import simuduck.observer.Observer;

public class Flock implements Quackable {
	ArrayList<Quackable> quarckers = new ArrayList<Quackable>();
	
	public void add(Quackable quarcker) {
		quarckers.add(quarcker);
	}

	@Override
	public void quack() {
		quarckers.forEach(Quackable::quack);
	}

	@Override
	public void registerObserver(Observer observer) {
		quarckers.forEach(e -> e.registerObserver(observer));
	}

	@Override
	public void notifyObservers() { }

}
