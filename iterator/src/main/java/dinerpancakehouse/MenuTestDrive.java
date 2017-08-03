package dinerpancakehouse;

import java.util.ArrayList;

import dinerpancakehouse.aggregate.CafeMenu;
import dinerpancakehouse.aggregate.DinerMenu;
import dinerpancakehouse.aggregate.Menu;
import dinerpancakehouse.aggregate.PancakeHouseMenu;
import dinerpancakehouse.client.Waitress;

public class MenuTestDrive {

	public static void main(String[] args) {
		ArrayList<Menu> menus = new ArrayList<Menu>();
		menus.add(new PancakeHouseMenu());
		menus.add(new DinerMenu());
		menus.add(new CafeMenu());
		
		Waitress waitress = new Waitress(menus);
		
		waitress.printMenu();
	}

}
