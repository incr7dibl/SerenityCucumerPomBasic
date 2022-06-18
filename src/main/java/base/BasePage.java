package base;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import net.serenitybdd.core.exceptions.NoSuchElementException;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class BasePage extends PageObject {

	/******************** Common functionality ****************/

	public WebElementFacade getElement(String locator) {
		try {
			return find(getBy(locator));

		} catch (NoSuchElementException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			return null;
		}
	}

	public List<WebElementFacade> getElements(String locator) {
		try {
			
			return findAll(getBy(locator));

		} catch (NoSuchElementException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			return null;
		}
	}
//new comment
	private By getBy(String locator) {
		// TODO Auto-generated method stub

		By by = null;

		try {
			if (locator.startsWith("id=")) {
				locator = locator.substring(3);
				by = by.id(locator);
			} else if (locator.startsWith("xpath=")) {
				locator = locator.substring(6);
				by = by.xpath(locator);
			} else if (locator.startsWith("css=")) {
				locator = locator.substring(4);
				by = by.cssSelector(locator);
			} else if (locator.startsWith("name=")) {
				locator = locator.substring(5);
				by = by.name(locator);
			} else if (locator.startsWith("link=")) {
				locator = locator.substring(5);
				by = by.linkText(locator);
			} else if (locator.startsWith("tag=")) {
				locator = locator.substring(4);
				by = by.tagName(locator);
			}
			return by;
		} catch (Throwable e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return null;
	}

	public void click(String locator) {
		/*
		 * evaluateJavascript("arguments[0].scrollIntoView(true);",
		 * getElement(locator));
		 */
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		waitFor(getElement(locator)).click();
//		waitForCondition().withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(1))
//				.until(ExpectedConditions.elementToBeClickable(getElement(locator))).click();;
		// this thing doesnt work with firefox driver for some weird reasons
	}

	public void type(String locator, String value) {
		waitFor(getElement(locator)).sendKeys(value);
	}

	public String getText(String locator) {
		return waitFor(getElement(locator)).getText();
	}

	public void moveMouseTo(String locator) {
		WebElementFacade movetoElement = waitFor(getElement(locator));

		withAction().moveToElement(movetoElement).perform();
	}

	/*********************** Business Functionality ******************/

	String itemHeading = "xpath=//div[@class='inventory_details_name large_size']";

	public String getItemHeading() {

		return getText(itemHeading);
	}

	String itemString = "css=div[class='inventory_item_name']";
	String itemPriceString = "css=div[class='inventory_item_price']";

	public void getItemNamesAndPrices() {

		List<WebElementFacade> itemsElementFacades = getElements(itemString);
		List<WebElementFacade> itemPricesElementFacades = getElements(itemPriceString);

		String itemsAndPriceString = "";
		for (int i = 0; i < itemsElementFacades.size(); i++) {
			itemsAndPriceString = itemsAndPriceString + "Item Name is: " + itemsElementFacades.get(i).getText()
					+ " And Item price is: " + itemPricesElementFacades.get(i).getText() + "\n";
		}

		System.out.println(itemsAndPriceString);
	}

}
