package simuduck.factory;

import simuduck.behavior.Quackable;
import simuduck.client.DuckCall;
import simuduck.client.MallardDuck;
import simuduck.client.RedheadDuck;
import simuduck.client.RubberDuck;
import simuduck.decorator.QuackCounter;

public class CountingDuckFactory extends AbstractDuckFactory {

	@Override
	public Quackable createMallardDuck() {
		return new QuackCounter(new MallardDuck());
	}

	@Override
	public Quackable createRedheadDuck() {
		return new QuackCounter(new RedheadDuck());
	}

	@Override
	public Quackable createDuckCall() {
		return new QuackCounter(new DuckCall());
	}

	@Override
	public Quackable createRubberDuck() {
		return new QuackCounter(new RubberDuck());
	}

}
