package simuduck;

import simuduck.behavior.FlyBehavior;
import simuduck.behavior.QuackBehavior;

public abstract class Duck {
	private FlyBehavior flyBehavior;
	private QuackBehavior quackBehavior;

	public abstract void display();
	
	public void swim() {
		// All subclass duck swim the same way
		System.out.println("I'm swimming!!");
	}
	
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	
	public void performFly() {
		flyBehavior.perform();
	}
	
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	public void performQuack() {
		quackBehavior.perform();	
	}

}
