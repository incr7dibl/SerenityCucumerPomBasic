package steps;

import org.assertj.core.api.Assert;

import org.assertj.core.api.Assertions;
import org.assertj.core.api.SoftAssertions;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import pages.HomePage;
import pages.LoginPage;

public class SauceDemoSteps {

	LoginPage loginPage;
	HomePage homePage;

	@Step("Navigating to SauceDemo Website")
	public void navigate() {
		loginPage.openUrl("https://www.saucedemo.com/");

	}

	@Step("Doing Login")
	public void doLogin(String userName, String password) {

		loginPage.doLogin(userName, password);
	}

	@Step("Choosing new Item")
	public void choosenewItem(String userName, String itemname) {
		homePage.chooseNewItem(itemname);
//		SoftAssertions softly = new SoftAssertions();

		if (userName == "problem_user") {
			
			Assertions.assertThat(homePage.getItemHeading()!= itemname);
//			softly.assertThat(homePage.getItemHeading()).isNotEqualToIgnoringCase(itemname);
//			softly.assertAll();
		} else {
			Assertions.assertThat(homePage.getItemHeading().equalsIgnoreCase(itemname));
//			softly.assertThat(homePage.getItemHeading()).isEqualTo(itemname);
//			softly.assertAll();
		}

		
		/*
		 * Serenity.reportThat("Actual :" + homePage.getItemHeading() + ",  Expected :"
		 * + itemname, () -> {
		 * 
		 * Assert.assertTrue(homePage.getItemHeading().contains(itemname));
		 * 
		 * });
		 */
	}

	@Step("Finding Item names and their prices")
	public void findItemNameandPrices() {
		homePage.getItemNamesAndPrices();
	}

	@Step("Adding all the items")
	public void addAllItems() {
		homePage.addAllItems();
	}

	public void addIndividualItem(String itemname) throws InterruptedException {
		homePage.selectNewItem(itemname);

	}

	public void clickOnCart() {
		homePage.clickOnCart();

	}
}
