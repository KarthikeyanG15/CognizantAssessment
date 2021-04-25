package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/feature/GuardianFeature.feature",
glue = "step",
publish = true,
monochrome = true)
public class GuardianRunner extends AbstractTestNGCucumberTests {

}
