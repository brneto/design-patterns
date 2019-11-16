package simuduck.client;

import simuduck.behavior.FlyBehavior;
import simuduck.behavior.QuackBehavior;

public abstract class Duck {
  private FlyBehavior flyBehavior;
  private QuackBehavior quackBehavior;

  public abstract void display();

  public final void swim() {
    // All subclass duck swim the same way
    System.out.println("I'm swimming!!");
  }

  public final void setQuackBehavior(QuackBehavior quackBehavior) {
    this.quackBehavior = quackBehavior;
  }

  public final void setFlyBehavior(FlyBehavior flyBehavior) {
    this.flyBehavior = flyBehavior;
  }

  public final void quack() {
    quackBehavior.perform();
  }

  public final void fly() {
    flyBehavior.perform();
  }
}
