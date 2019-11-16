package objectvillemenus.client;

import java.util.ArrayList;

import objectvillemenus.aggregate.Menu;

public class Waitress {

  ArrayList<Menu> menus;

  public Waitress(ArrayList<Menu> menus) {
    this.menus = menus;
  }

  public void printMenu() {
    menus.forEach(this::printMenu);
  }

  private void printMenu(Menu menuItems) {
    menuItems.forEach(e -> System.out.println(
        e.getName() + ", " +
            e.getPrice() + " -- " +
            e.getDescription()));
  }
}
