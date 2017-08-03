package dinerpancakehouse.client;

import java.util.ArrayList;

import dinerpancakehouse.aggregate.Menu;

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
		menuItems.forEach(e -> System.out.println(
								e.getName() + ", " + 
								e.getPrice() + " -- " + 
								e.getDescription()));
	}
}
