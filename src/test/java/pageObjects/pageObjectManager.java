package pageObjects;

import org.openqa.selenium.WebDriver;



public class pageObjectManager {
	
	public landingPageObjects landingpageobjects;
	public WebDriver driver;
	public offersPage offerspage;
	public CheckOutPage checkoutpage;
	public pageObjectManager(WebDriver driver) {
		this.driver=driver;
	}
	public landingPageObjects getLandingPage() {
		landingpageobjects=new landingPageObjects(driver);
		return landingpageobjects;
	}
	
	public offersPage getoffersPage() {
		offerspage=new offersPage(driver);
		return offerspage;
	}
	public CheckOutPage checkoutpage() {
		checkoutpage=new CheckOutPage(driver);
		return checkoutpage;
	}
	
}
