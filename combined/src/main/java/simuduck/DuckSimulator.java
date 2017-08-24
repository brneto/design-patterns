package simuduck;

import simuduck.behavior.Quackable;
import simuduck.composite.Flock;
import simuduck.decorator.QuackCounter;
import simuduck.decorator.factory.AbstractGooseDuckFactory;
import simuduck.decorator.factory.GooseDuckFactory;
import simuduck.factory.CountingDuckFactory;
import simuduck.observer.Quackologist;

public class DuckSimulator {

	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		AbstractGooseDuckFactory gooseDuckFactory = new GooseDuckFactory(new CountingDuckFactory());
		
		simulator.simulate(gooseDuckFactory);
	}

	void simulate(AbstractGooseDuckFactory gooseDuckFactory) {
		Quackable redheadDuck = gooseDuckFactory.createRedheadDuck();
		Quackable duckCall = gooseDuckFactory.createDuckCall();
		Quackable rubberDuck = gooseDuckFactory.createRubberDuck();
		Quackable gooseDuck = gooseDuckFactory.createGooseDuck();
		System.out.println("\nDuck Simulator: With Adapter, Decorator, "
				+ "Abstract Factory, Composite and Observer");

		Flock flockOfDucks = new Flock();
		flockOfDucks.add(redheadDuck);
		flockOfDucks.add(duckCall);
		flockOfDucks.add(rubberDuck);
		flockOfDucks.add(gooseDuck);
		
		Flock flockOfMallards = new Flock();
		Quackable mallardOne = gooseDuckFactory.createMallardDuck();
		Quackable mallardTwo = gooseDuckFactory.createMallardDuck();
		Quackable mallardThree = gooseDuckFactory.createMallardDuck();
		Quackable mallardFour = gooseDuckFactory.createMallardDuck();
		
		flockOfMallards.add(mallardOne);
		flockOfMallards.add(mallardTwo);
		flockOfMallards.add(mallardThree);
		flockOfMallards.add(mallardFour);
		
		flockOfDucks.add(flockOfMallards);
		
		Quackologist quackologist = new Quackologist();
		flockOfDucks.registerObserver(quackologist);
		
		System.out.println("\nDuck Simulator: Whole Flock Simulation with Observer");
		simulate(flockOfDucks);
		
		System.out.println("\nThe ducks quacked " +
							QuackCounter.getQuacks() +
							" times");
	}

	void simulate(Quackable duck) {
		duck.quack();
	}

}
