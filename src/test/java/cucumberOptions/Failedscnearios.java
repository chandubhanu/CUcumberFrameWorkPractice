package cucumberOptions;

import org.testng.annotations.DataProvider;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="@target\\failedScenarios.txt",
glue="stepDefinitions",monochrome=true//tags="@PlaceOrder or @SearchOrder"
,plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class Failedscnearios extends AbstractTestNGCucumberTests{
@Override
@DataProvider(parallel=true)
	public Object[][] scenarios()
	{
		return super.scenarios();
		
	}
}
