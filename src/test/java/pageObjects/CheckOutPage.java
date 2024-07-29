package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {

	
	public WebDriver driver;
	public CheckOutPage(WebDriver driver) {
		this.driver=driver;
	}
	By search=By.xpath("//input[@type='search']");
	By productName=By.cssSelector("h4.product-name");
	By topDeals=By.cssSelector("a[href='#/offers']");
	By checkout=By.cssSelector(".cart-icon");
	By Checkoutbutton=By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	By promocode=By.cssSelector(".promoBtn");
	By placeOrder=By.xpath("//button[contains(text(),'Place Order')]");
	
public void checkoutItems() {
	driver.findElement(checkout).click();
	driver.findElement(Checkoutbutton).click();
}
public boolean promoButton() {
	 return driver.findElement(promocode).isDisplayed();
}

public boolean placeOrderButton() {
	return driver.findElement(placeOrder).isDisplayed();
}

}
