package objectvillemenus.visitor;

import objectvillemenus.aggregator.Menu;
import objectvillemenus.element.MenuItem;

public class NutritionVisitor implements Visitor {

  private int rating, calories, protein, carbs;

  @Override
  public void visit(MenuItem menuItem) {
    rating = menuItem.isVegetarian() ? 10 : 4;
    calories = menuItem.isVegetarian() ? 3 : 10;
    protein = menuItem.isVegetarian() ? 4 : 10;
    carbs = menuItem.isVegetarian() ? 5 : 9;
  }

  @Override
  public void visit(Menu menu) {
    menu.forEach(m -> rating++);
  }

  @Override
  public int getHealthRating() { return rating; }

  @Override
  public int getCalories() { return calories; }

  @Override
  public int getProtein() { return protein; }

  @Override
  public int getCarbs() { return carbs; }
}
