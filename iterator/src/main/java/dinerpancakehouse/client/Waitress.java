package dinerpancakehouse.client;

import java.util.ArrayList;

import dinerpancakehouse.aggregate.Menu;
import dinerpancakehouse.elements.MenuItem;

public class Waitress {
	ArrayList<Menu> menus;

	public Waitress(ArrayList<Menu> menus) {
		this.menus = menus;
	}

	public void printMenu() {
		for (Menu menu : menus)
			printMenu(menu);
	}

	private void printMenu(Menu menuItems) {
		for (MenuItem item : menuItems) {
			System.out.print(item.getName() + ", ");
			System.out.print(item.getPrice() + " -- ");
			System.out.println(item.getDescription());
		}
	}
}
