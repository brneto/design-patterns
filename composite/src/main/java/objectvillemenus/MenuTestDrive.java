package objectvillemenus;

import java.util.ArrayList;

import objectvillemenus.aggregate.CafeMenu;
import objectvillemenus.aggregate.DinerMenu;
import objectvillemenus.aggregate.Menu;
import objectvillemenus.aggregate.PancakeHouseMenu;
import objectvillemenus.client.Waitress;

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
