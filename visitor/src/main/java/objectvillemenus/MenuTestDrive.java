package objectvillemenus;

import java.util.ArrayList;

import java.util.List;
import objectvillemenus.aggregator.type.CafeMenu;
import objectvillemenus.aggregator.type.DinerMenu;
import objectvillemenus.aggregator.Menu;
import objectvillemenus.aggregator.type.PancakeHouseMenu;
import objectvillemenus.client.Waitress;

public class MenuTestDrive {

  public static void main(String[] args) {
    List<Menu> menus = new ArrayList<>();
    menus.add(new PancakeHouseMenu());
    menus.add(new DinerMenu());
    menus.add(new CafeMenu());

    Waitress waitress = new Waitress(menus);

    waitress.printMenu();
  }

}
