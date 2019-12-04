package pizzashop;

import pizzashop.factorymethod.PizzaStore;
import pizzashop.factorymethod.concrete.ChicagoPizzaStore;
import pizzashop.factorymethod.concrete.NYPizzaStore;
import pizzashop.product.pizza.Pizza;
import pizzashop.product.pizza.type.PizzaType;

public class PizzaTestDrive {

  public static void main(String[] args) {
    PizzaStore nyStore = new NYPizzaStore();
    PizzaStore chicagoStore = new ChicagoPizzaStore();

    Pizza pizza = nyStore.orderPizza(PizzaType.CHEESE);
    System.out.println("Ethan ordered a " + pizza.getName() + "\n");

    pizza = chicagoStore.orderPizza(PizzaType.CHEESE);
    System.out.println("Joel ordered a " + pizza.getName() + "\n");

  }

}
