package starbuzzcoffe.decorator;

import starbuzzcoffe.component.Beverage;

public class Milk extends Condiment {

  public Milk(Beverage beverage) {
    super(beverage);
  }

  @Override
  public String description() {
    return super.description() + ", Milk";
  }

  @Override
  public double cost() {
    return .10 + super.cost();
  }

}
