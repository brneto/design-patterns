package starbuzzcoffe.decorator;

import starbuzzcoffe.component.Beverage;

public class Whip extends Condiment {

  public Whip(Beverage beverage) {
    super(beverage);
  }

  @Override
  public String description() {
    return super.description() + ", Whip";
  }

  @Override
  public double cost() {
    return .10 + super.cost();
  }

}
