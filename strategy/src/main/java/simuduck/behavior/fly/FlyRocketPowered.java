package simuduck.behavior.fly;

import simuduck.behavior.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {

  @Override
  public void perform() {
    System.out.println("I'm flying with a rocket!");
  }

}
