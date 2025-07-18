package week6.day4.bddrunner;

import org.testng.annotations.DataProvider;

import week6.day4.base.*;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/java/features/SalesForceModule.feature"},
glue = {"week6.day4.pages"},dryRun = false, publish = true , monochrome = true)

public class SalesForce_TC001 extends CommonMethods{
	
	 @DataProvider(parallel = true)
	    public Object[][] scenarios() {
	        return super.scenarios();
	    }
}
