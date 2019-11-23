package objectvillemenus.client;

import java.util.List;
import objectvillemenus.aggregator.Menu;

public class Waitress {

  private final List<Menu> menus;

  public Waitress(List<Menu> menus) {
    this.menus = menus;
  }

  public void printMenu() {
    menus.forEach(this::printMenu);
  }

  private void printMenu(Menu menuItems) {
    menuItems.forEach(e -> System.out.println(
        String.format("%s, %.2f -- %s", e.getName(), e.getPrice(), e.getDescription())));
  }
}
