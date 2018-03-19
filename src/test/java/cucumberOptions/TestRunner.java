package cucumberOptions;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
//import cucumber.api.junit.Cucumber;

//@RunWith(Cucumber.class)
@CucumberOptions(
	features = "src/test/java/features",
	glue = "stepDefinitions",
	tags = "@smokeTest,@sanityTest",
	dryRun = false, 
	monochrome = true,
	strict = true,
	plugin = {"pretty","html:target/cucumber-results"
			,"json:target/results.json"
			,"junit:target/results.xml"})
public class TestRunner extends AbstractTestNGCucumberTests {

}
