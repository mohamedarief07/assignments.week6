package runner;



import io.cucumber.testng.CucumberOptions;
import steps.BaseClass;

@CucumberOptions (features = "src/test/java/feature",
glue = "steps", 
monochrome = true, 
publish = true,
tags="@smoke or @sanity")

public class RunTest extends BaseClass {
	
	
}