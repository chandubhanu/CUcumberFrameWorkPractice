package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageObjects.landingPageObjects;
import pageObjects.offersPage;
import pageObjects.pageObjectManager;
import utils.testContextSetup;

public class OfferPageStepDefinition {

	testContextSetup textcontextsetu;
public pageObjectManager pageobject;

	public OfferPageStepDefinition(testContextSetup textcontextsetu) {
		this.textcontextsetu = textcontextsetu;
	}

	@Then("^User search for the (.+) shortname name in offers page$")
	public void user_search_for_the_same_short_name_in_offers_page_to_check_if_the_product_exist(String ShortName)
			throws InterruptedException {
		offersPage offerpage = textcontextsetu.pageobjectmanager.getoffersPage();
		switchTOOfferPage();

		offerpage.searchItem(ShortName);

		Thread.sleep(1000);
		textcontextsetu.offerPageProductName = offerpage.getProductName();
		System.out.println(textcontextsetu.offerPageProductName);

	}

	// Single resposibility principle
	public void switchTOOfferPage() {
		// if(textcontextsetu.driver.getCurrentUrl().equalsIgnoreCase("https://rahulshettyacademy.com/seleniumPractise/#/offers"))
		// {
		//pageobject=new pageObjectManager(textcontextsetu.driver);
		landingPageObjects landingpageobjects = textcontextsetu.pageobjectmanager.getLandingPage();
		landingpageobjects.deals();
		textcontextsetu.genericutils.switchWindowToChild();

	}

	@Then("validate product name in offers page matching with landing page")
	public void validate_product_name_in_offers_page_matching_with_landing_page() {
		Assert.assertEquals(textcontextsetu.landingpageproductName, textcontextsetu.offerPageProductName,
				"Product names mismatch");
	}
}
