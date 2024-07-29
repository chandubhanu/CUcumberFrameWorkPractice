package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class landingPageObjects {

	
	WebDriver driver;
	public landingPageObjects(	WebDriver driver) {
		this.driver=driver;
	}
	By search=By.xpath("//input[@type='search']");
	By productName=By.cssSelector("h4.product-name");
	By topDeals=By.cssSelector("a[href='#/offers']");
	By Increment=By.cssSelector(".increment");
	By addTOCart=By.cssSelector(".product-action button");
	public void searchItem(String shortName) {
		driver.findElement(search).sendKeys(shortName);
	}

public String getProductName() {
	return driver.findElement(productName).getText();
}

public void deals() {
	driver.findElement(topDeals).click();;
	}
public String getTitle()
{
	return driver.getTitle();
	
	}

public void addToCart(int quantity) {
	int i=quantity;
	for(i=1;i<quantity;i++) {
	driver.findElement(Increment).click();
	}
}
public void clickonCart() {
	driver.findElement(addTOCart).click();
}
}
