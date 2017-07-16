package pizzashop;

import pizzashop.factory.ChicagoPizzaStore;
import pizzashop.factory.NYPizzaStore;
import pizzashop.factory.PizzaStore;
import pizzashop.product.Pizza;
import pizzashop.product.PizzaType;

public class PizzaTestDrive {

	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		
		Pizza pizza = nyStore.createPizza(PizzaType.CHEESE);
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
		
		pizza = chicagoStore.createPizza(PizzaType.CHEESE);
		System.out.println("Joel ordered a " + pizza.getName() + "\n");
		
	}

}
