package barista.client;

import barista.implementation.Coffee;
import barista.implementation.Tea;
import barista.templatemethod.CaffeineBeverage;

public class BeverageMakerTest {

	public static void main(String[] args) {
		CaffeineBeverage myTea = new Tea();
		CaffeineBeverage myCoffee = new Coffee();
		
		myTea.prepareRecipe();
		
		myCoffee.prepareRecipe();
	}

}
