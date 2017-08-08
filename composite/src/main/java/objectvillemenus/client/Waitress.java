package objectvillemenus.client;

import objectvillemenus.component.MenuComponent;

public class Waitress {
	MenuComponent allMenus;

	public Waitress(MenuComponent allMenus) {
		this.allMenus = allMenus;
	}

	public void printMenu() {
		allMenus.print();
	}

	public void printVegetarianMenu() {
		System.out.println("\nVEGETARIAN MENU\n----");
		for (MenuComponent component : allMenus) {
			try {
				if (component.isVegetarian()) {
					component.print();
				}
			} catch (UnsupportedOperationException e) {}
		}
	}

}
