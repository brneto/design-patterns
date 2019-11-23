package objectvillemenus.client;

import java.util.List;
import objectvillemenus.aggregator.Menu;
import objectvillemenus.visitor.NutritionVisitor;

public class Waitress {

  private final List<Menu> menus;
  private final NutritionVisitor nutrition = new NutritionVisitor();

  public Waitress(List<Menu> menus) { this.menus = menus; }

  public void printMenu() {
    menus.forEach(m -> {
      nutrition.visit(m);
      printMenu(m);

      System.out.println(
          String.format("Rating: %s", nutrition.getHealthRating()));
    });
  }

  private void printMenu(Menu menuItems) {
    menuItems.forEach(i -> {
      nutrition.visit(i);

      System.out.println(
        String.format("%s, %.2f -- %s", i.getName(), i.getPrice(), i.getDescription()));
      System.out.println(
          String.format("Rating: %s", nutrition.getHealthRating()));
      System.out.println(
          String.format("Calories: %s", nutrition.getCalories()));
      System.out.println(
          String.format("Protein: %s", nutrition.getProtein()));
      System.out.println(
          String.format("Carbs: %s", nutrition.getCarbs()));
    });
  }
}
