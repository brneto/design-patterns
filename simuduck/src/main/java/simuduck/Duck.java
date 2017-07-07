package simuduck;

import simuduck.behavior.FlyBehavior;
import simuduck.behavior.QuackBehavior;

public abstract class Duck {
	private FlyBehavior fly;
	private QuackBehavior quack;

	public Duck() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	public void quack() {
		
	}
	
	public void swim() {
		
	}
	
	public abstract void display();
	
	public void setFlyBehavior(FlyBehavior fly) {
		this.fly = fly;
	}
	
	public void performFly() {
		fly.perform();
	}
	
	public void setQuackBehavior(QuackBehavior quack) {
		this.quack = quack;
	}
	
	public void performQuack() {
		quack.perform();	
	}

}
