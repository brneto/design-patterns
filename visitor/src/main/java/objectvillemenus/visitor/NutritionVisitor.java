package objectvillemenus.visitor;

import objectvillemenus.element.MenuItem;

public class NutritionVisitor implements Visitor {

  private int rating;
  private int calories;
  private int protein;
  private int carbs;

  @Override
  public void visit(MenuItem menuItem) {
    rating = menuItem.isVegetarian() ? 10 : 4;
    calories = menuItem.isVegetarian() ? 3 : 10;
    protein = menuItem.isVegetarian() ? 4 : 10;
    carbs = menuItem.isVegetarian() ? 5 : 9;
  }

  public int getHealthRating() { return rating; }

  public int getCalories() { return calories; }

  public int getProtein() { return protein; }

  public int getCarbs() { return carbs; }
}
