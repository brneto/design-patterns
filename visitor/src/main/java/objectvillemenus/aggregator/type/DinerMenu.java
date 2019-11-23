package objectvillemenus.aggregator.type;

import java.util.Iterator;

import objectvillemenus.aggregator.Menu;
import objectvillemenus.element.MenuItem;
import objectvillemenus.iterator.DinerMenuIterator;

public class DinerMenu implements Menu {

  private static final int MAX_ITEMS = 6;
  private int numberOfItems = 0;
  private final MenuItem[] menuItems = new MenuItem[MAX_ITEMS];

  public DinerMenu() {
    addItem("Vegetarian BLT",
        "(Fakin’) Bacon with lettuce & tomato on whole wheat",
        true, 2.99);

    addItem("BLT",
        "Bacon with lettuce & tomato on whole wheat",
        false, 2.99);

    addItem("Soup of the day",
        "Soup of the day, with a side of potato salad",
        false, 3.29);

    addItem("Hotdog",
        "A hot dog, with saurkraut, relish, onions, topped with cheese",
        false, 3.05);
  }

  private void addItem(String name, String description, boolean vegetarian, double price) {
    MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
    if (numberOfItems >= MAX_ITEMS) {
      System.err.println("Sorry, menu is full! Can’t add item to menu");
    } else {
      menuItems[numberOfItems] = menuItem;
      numberOfItems = numberOfItems + 1;
    }
  }

  @Override
  public Iterator<MenuItem> iterator() {
    return new DinerMenuIterator(menuItems);
  }
}
