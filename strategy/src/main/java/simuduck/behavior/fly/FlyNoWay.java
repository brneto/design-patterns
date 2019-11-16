package simuduck.behavior.fly;

import simuduck.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

  @Override
  public void perform() {
    // Do nothing - can't fly!
    System.out.println("I can't fly");
  }

}
