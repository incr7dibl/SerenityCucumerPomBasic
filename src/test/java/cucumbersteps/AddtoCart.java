package cucumbersteps;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.SauceDemoSteps;

public class AddtoCart {

	@Steps
	SauceDemoSteps sauceDemoSteps;

	@Given("User navigates to the website")
	public void user_navigates_to_the_website() {
		sauceDemoSteps.navigate();

	}

	@When("user do the login by entering {string} and {string}")
	public void user_do_the_login_by_entering_and(String string, String string2) {
		sauceDemoSteps.doLogin(string, string2);

	}

	@Then("User selects all the items")
	public void user_selects_all_the_items() {
		sauceDemoSteps.addAllItems();
	}

	@Then("User selects items")
	public void user_selects_items(DataTable dataTable) throws InterruptedException {
		List<String> itemList = dataTable.asList(String.class);

		for (String itemname : itemList) {
			sauceDemoSteps.addIndividualItem(itemname);
		}
		sauceDemoSteps.clickOnCart();
	}

}
