package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	 WebDriver driver;
public  WebDriver WebDriverManager() throws IOException {
	FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\global.properties");
	Properties prop=new Properties();
	prop.load(file);
	String Maven_Browser=System.getProperty("browser");
	String Global_browser=prop.getProperty("browser");
	String BrowserName = Maven_Browser != null ? Maven_Browser: Global_browser;
	String UrlName=prop.getProperty("QAUrl");
	
	if(driver==null)
	{
		if(BrowserName.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
     driver=new ChromeDriver();
	}
	else if(BrowserName.equalsIgnoreCase("edge")) {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}
	}
driver.manage().window().maximize();
driver.get(UrlName);
	
return driver;
}
}

