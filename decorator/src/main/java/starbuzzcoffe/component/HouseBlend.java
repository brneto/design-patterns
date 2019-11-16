package starbuzzcoffe.component;

public class HouseBlend implements Beverage {

  @Override
  public String description() {
    return "House Blend Coffee";
  }

  @Override
  public double cost() {
    return .89;
  }

}
