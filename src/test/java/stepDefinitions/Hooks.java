package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.testContextSetup;

public class Hooks {
public WebDriver driver;

public testContextSetup textcontextsetup;
public Hooks(testContextSetup textcontextsetup) {
	this.textcontextsetup=textcontextsetup;
}
	
	@After
	public void before_or_after() throws IOException {
		textcontextsetup.testbase.WebDriverManager().quit();
		
	}
	@AfterStep
	public void addScreenShot(Scenario scenario) throws IOException {
		WebDriver driver=textcontextsetup.testbase.WebDriverManager();
	if(scenario.isFailed()) {
		
		File SourcePath=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		byte[] Content=FileUtils.readFileToByteArray(SourcePath);
		scenario.attach(Content, "image/png", "image");
	}
	
	}
	}

