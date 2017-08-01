package dinerpancakehouse;

import dinerpancakehouse.aggregate.DinerMenu;
import dinerpancakehouse.aggregate.PancakeHouseMenu;
import dinerpancakehouse.client.Waitress;

public class MenuTestDrive {

	public static void main(String[] args) {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		
		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
		
		waitress.printMenu();
	}

}
