package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class offersPage {

	public WebDriver driver;
	
	public offersPage(WebDriver driver) {
		this.driver=driver;
	}

	By search=By.xpath("//input[@type='search']");
	By productName=By.cssSelector("td:nth-child(1)");
	
	
	  public void searchItem(String shortName) {
	        // Clear the existing text in the search input field
	        driver.findElement(search).clear();
	        // Enter the search term
	        driver.findElement(search).sendKeys(shortName);
	    }


public String getProductName() {
	return driver.findElement(productName).getText();
}

}
