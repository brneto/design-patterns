package starbuzzcoffe.component;

public class DarkRoast implements Beverage {

  @Override
  public String description() {
    return "Dark Roast Coffee";
  }

  @Override
  public double cost() {
    return .99;
  }

}
