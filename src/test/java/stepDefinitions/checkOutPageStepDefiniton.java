package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageObjects.CheckOutPage;
import pageObjects.pageObjectManager;
import utils.testContextSetup;

public class checkOutPageStepDefiniton {

	public pageObjectManager pageobjectmanager;
	testContextSetup textcontextsetu;
	public CheckOutPage checkoutpage;

	public checkOutPageStepDefiniton(testContextSetup textcontextsetu) {
		this.textcontextsetu = textcontextsetu;
		this.checkoutpage=textcontextsetu.pageobjectmanager.checkoutpage();
	}

	
	@Then("verify user has ability to enter promocode and place the order")
	public void verify_user_has_ability_to_enter_promocode_and_place_the_order() {
		
		Assert.assertTrue(checkoutpage.promoButton());
		Assert.assertTrue(checkoutpage.placeOrderButton());
	}
	
	@Then("^User proceeds to checkout and validate the (.+) items in checkoutpage$")
	public void User_proceeds_to_checkout_and_validate_the_items_in_checkoutpage(String Name) throws InterruptedException 
	{
		checkoutpage.checkoutItems();
		Thread.sleep(5000);
	}

}
