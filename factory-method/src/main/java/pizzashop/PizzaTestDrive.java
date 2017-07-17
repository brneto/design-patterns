package pizzashop;

import pizzashop.factorymethod.PizzaStore;
import pizzashop.factorymethod.concrete.CaliforniaPizzaStore;
import pizzashop.factorymethod.concrete.ChicagoPizzaStore;
import pizzashop.factorymethod.concrete.NYPizzaStore;
import pizzashop.product.Pizza;
import pizzashop.product.type.PizzaType;

public class PizzaTestDrive {

	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		PizzaStore californiaStore = new CaliforniaPizzaStore();
		
		Pizza pizza = nyStore.orderPizza(PizzaType.CHEESE);
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
		
		pizza = chicagoStore.orderPizza(PizzaType.CHEESE);
		System.out.println("Joel ordered a " + pizza.getName() + "\n");
		
		pizza = californiaStore.orderPizza(PizzaType.CHEESE);
		System.out.println("Someone ordered a " + pizza.getName() + "\n");
		
	}

}
