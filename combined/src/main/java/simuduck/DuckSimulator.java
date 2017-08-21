package simuduck;

import simuduck.behavior.Quackable;
import simuduck.decorator.QuackCounter;
import simuduck.decorator.factory.AbstractGooseDuckFactory;
import simuduck.decorator.factory.GooseDuckFactory;
import simuduck.factory.CountingDuckFactory;

public class DuckSimulator {

	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		AbstractGooseDuckFactory gooseDuckFactory = new GooseDuckFactory(new CountingDuckFactory());
		
		simulator.simulate(gooseDuckFactory);
	}

	void simulate(AbstractGooseDuckFactory gooseDuckFactory) {
		Quackable mallardDuck = gooseDuckFactory.createMallardDuck();
		Quackable redheadDuck = gooseDuckFactory.createRedheadDuck();
		Quackable duckCall = gooseDuckFactory.createDuckCall();
		Quackable rubberDuck = gooseDuckFactory.createRubberDuck();
		Quackable gooseDuck = gooseDuckFactory.createGooseDuck();

		System.out.println("\nDuck Simulator: With Adapter, Decorator and Abstract Factory");

		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(gooseDuck);
		
		System.out.println(QuackCounter.getQuacks() + " quacks were counted");
	}

	void simulate(Quackable duck) {
		duck.quack();
	}

}
