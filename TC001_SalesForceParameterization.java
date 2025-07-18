package Runner;


import Base.baseclass;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src/test/java/features/SalesForceModule.feature"},
glue= {"steps","Hooks"},dryRun=false,
publish=true,monochrome=true)
public class TC001_SalesForceParameterization extends baseclass{

}
