package simuduck.factory;

import simuduck.behavior.Quackable;

public interface DuckFactory {
	public Quackable createMallardDuck();
	public Quackable createRedheadDuck();
	public Quackable createDuckCall();
	public Quackable createRubberDuck();
}
