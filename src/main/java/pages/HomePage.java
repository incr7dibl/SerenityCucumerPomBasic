package pages;

import base.BasePage;

public class HomePage extends BasePage {

	public void chooseNewItem(String itemName) {
		click("link=" + itemName); // this thing doesnt work with firefox driver for some weird reasons

	}
}
