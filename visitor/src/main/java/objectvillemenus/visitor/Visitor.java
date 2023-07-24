package objectvillemenus.visitor;

import objectvillemenus.aggregator.Menu;
import objectvillemenus.element.MenuItem;

public interface Visitor {
  void visit(MenuItem menuItem);
  void visit(Menu menu);
  int getHealthRating();
  int getCalories();
  int getProtein();
  int getCarbs();
}
