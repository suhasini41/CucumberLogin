package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/loginFeature/login.feature",
		glue="stepDefs",
		dryRun=false,
		strict=true,
		monochrome=true
		)
public class TestRunner
{

}
