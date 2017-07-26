package barista.client;

import barista.implementation.Coffee;
import barista.implementation.CoffeeWithHook;
import barista.implementation.Tea;
import barista.templatemethod.CaffeineBeverage;

public class BeverageTestDrive {

	public static void main(String[] args) {
		CaffeineBeverage myTea = new Tea();
		CaffeineBeverage myCoffee = new Coffee();
		CaffeineBeverage myCoffeeWithHook = new CoffeeWithHook();
		
		System.out.println("\nMaking tea...");
		myTea.prepareRecipe();
		
		System.out.println("\nMaking coffee...");
		myCoffee.prepareRecipe();
		
		System.out.println("\nMaking coffee choosing condiments...");
		myCoffeeWithHook.prepareRecipe();
	}

}
