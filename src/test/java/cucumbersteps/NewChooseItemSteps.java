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

public class NewChooseItemSteps {

	@Steps

	SauceDemoSteps sauceDemoSteps;

	@Given("user navigate to the website")
	public void user_navigate_to_the_website() {
		sauceDemoSteps.navigate();

	}

	@When("user do the login with username {} and password {}")
	public void user_do_the_login_with_username_standard_user_and_password_secret_sauce(String userName,
			String password) {
		// Write code here that turns the phrase above into concrete actions
		sauceDemoSteps.doLogin(userName, password);
	}

	@Then("user choose the {} item")
	public void user_choose_the_item(String itemName) {
		sauceDemoSteps.choosenewItem(itemName);
	}
}
