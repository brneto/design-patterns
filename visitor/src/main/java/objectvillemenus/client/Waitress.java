package objectvillemenus.client;

import objectvillemenus.aggregator.Menu;
import objectvillemenus.visitor.Visitor;

import java.util.List;

import static java.util.Objects.requireNonNull;

public class Waitress {

  private final List<Menu> menus;
  private Visitor nutrition;

  public Waitress(List<Menu> menus) { this.menus = menus; }

  public void accept(Visitor visitor) {
    requireNonNull(visitor);
    this.nutrition = visitor;
  }

  public void printMenu() {
    menus.forEach(m -> {
      nutrition.visit(m);

      printMenu(m);
      System.out.printf("Rating: %s%n", nutrition.getHealthRating());
    });
  }

  private void printMenu(Menu menuItems) {
    menuItems.forEach(i -> {
      nutrition.visit(i);

      System.out.printf("%s, %.2f -- %s%n", i.getName(), i.getPrice(), i.getDescription());
      System.out.printf("Rating: %s%n", nutrition.getHealthRating());
      System.out.printf("Calories: %s%n", nutrition.getCalories());
      System.out.printf("Protein: %s%n", nutrition.getProtein());
      System.out.printf("Carbs: %s%n", nutrition.getCarbs());
    });
  }
}
