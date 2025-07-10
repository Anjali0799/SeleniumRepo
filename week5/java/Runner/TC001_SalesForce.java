package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features= {"src/test/java/features/SalesForceModule.feature"},glue= {"steps"} ,publish=true)
public class TC001_SalesForce extends AbstractTestNGCucumberTests{

	

	

}
