package simuduck.factory;

import simuduck.behavior.Quackable;

public interface DuckFactory {
	Quackable createMallardDuck();
	Quackable createRedheadDuck();
	Quackable createDuckCall();
	Quackable createRubberDuck();
}
