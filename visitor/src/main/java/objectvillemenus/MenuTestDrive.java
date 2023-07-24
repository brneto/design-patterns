package objectvillemenus;

import objectvillemenus.aggregator.Menu;
import objectvillemenus.aggregator.type.CafeMenu;
import objectvillemenus.aggregator.type.DinerMenu;
import objectvillemenus.aggregator.type.PancakeHouseMenu;
import objectvillemenus.client.Waitress;
import objectvillemenus.visitor.NutritionVisitor;
import objectvillemenus.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class MenuTestDrive {

  public static void main(String[] args) {
    List<Menu> menus = new ArrayList<>();
    menus.add(new PancakeHouseMenu());
    menus.add(new DinerMenu());
    menus.add(new CafeMenu());

    Waitress waitress = new Waitress(menus);
    Visitor nutrition = new NutritionVisitor();
    waitress.accept(nutrition);

    waitress.printMenu();
  }

}
