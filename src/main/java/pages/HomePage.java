package pages;

import java.util.Iterator;
import java.util.List;

import base.BasePage;

import net.serenitybdd.core.pages.WebElementFacade;

public class HomePage extends BasePage {
	String additembuttons = "xpath=//button[@class='btn btn_primary btn_small btn_inventory']";
	String cart = "xpath=//a[@class='shopping_cart_link']";
	String removeItemString = "xpath=//button[@class='btn btn_secondary btn_small cart_button']";
	String additem = "xpath=//button[@class='btn btn_primary btn_small btn_inventory']";
	String backToProducts = "xpath=//button[@id='back-to-products']";

	public void chooseNewItem(String itemName) {
		click("link=" + itemName); // this thing doesnt work with firefox driver for some weird reasons

	}

	public void addAllItems() {
		List<WebElementFacade> additem = getElements(additembuttons);
		for (WebElementFacade item : additem) {
			item.click();
		}

		clickOnCart();
		List<WebElementFacade> removeitem = getElements(removeItemString);
		for (WebElementFacade remove : removeitem) {
			remove.click();
		}
	}

	public void selectNewItem(String itemName) {

		click("link=" + itemName);
		getDriver().navigate().refresh();

		click(additem);

		click(backToProducts);
	}

	public void clickOnCart() {
		click(cart);
	}
}
