package cucumbersteps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import steps.SauceDemoSteps;

public class GetItemNameAndPriceStep {
	
	@Steps
	SauceDemoSteps sauceDemoSteps;

	@Given("user navigate to the saucedemo")
	public void user_navigate_to_the_saucedemo() {
		// Write code here that turns the phrase above into concrete actions
		sauceDemoSteps.navigate();
	}

	@When("user do the login")
	public void user_do_the_login() {
		sauceDemoSteps.doLogin("standard_user", "secret_sauce");
	}

	@Then("user gets the item name and price from the page")
	public void user_gets_the_item_name_and_price_from_the_page() {
		sauceDemoSteps.findItemNameandPrices();
	}
}
