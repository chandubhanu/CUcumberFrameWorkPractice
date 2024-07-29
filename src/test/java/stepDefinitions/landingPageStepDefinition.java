package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.landingPageObjects;
import pageObjects.pageObjectManager;
import utils.testContextSetup;

public class landingPageStepDefinition {

	public pageObjectManager pageobjectmanager;
	public testContextSetup textcontextsetu;
	public landingPageObjects landingpageobjects;

	public landingPageStepDefinition(testContextSetup textcontextsetu) {
		this.textcontextsetu = textcontextsetu;
		 this.landingpageobjects = textcontextsetu.pageobjectmanager.getLandingPage();
	}

	@Given("Verify user is on Greenkart LandingPage")
	public void verify_user_is_on_greenkart_landing_page() {
		Assert.assertTrue(landingpageobjects.getTitle().contains("Green"));
		
	}

	@When("^User search with short name (.+) and extract actual name of product$")

	public void user_search_with_short_name_and_extract_actual_name_of_product(String shortName)
			throws InterruptedException {
		// Search for the product on the landing page
		//pageobjectmanager = new pageObjectManager(textcontextsetu.driver);
		
		landingpageobjects.searchItem(shortName);
		Thread.sleep(2000);
		textcontextsetu.landingpageproductName = landingpageobjects.getProductName().split(" ")[0].trim();
		System.out.println("Landing Page Product Name: " + textcontextsetu.landingpageproductName);
		
	}
	@When("Add {string} times of the selected product to the cart")
	public void add_times_of_the_selected_product_to_the_cart(String quantity) {
		
		
			landingpageobjects.addToCart(Integer.parseInt(quantity));
		
		landingpageobjects.clickonCart();
	}

}
