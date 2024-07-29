package utils;

import java.io.IOException;

import pageObjects.pageObjectManager;

public class testContextSetup {

	public String landingpageproductName;
	public String offerPageProductName;
public pageObjectManager pageobjectmanager;
public TestBase testbase;
public GenericUtils genericutils;
	public testContextSetup() throws IOException {
		testbase=new TestBase();
		pageobjectmanager = new pageObjectManager(testbase.WebDriverManager());
		genericutils=new GenericUtils(testbase.WebDriverManager());
	}
}
