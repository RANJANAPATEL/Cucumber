package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
	
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features ="C:\\Users\\GSC-30753\\eclipse-workspace\\CucumberScript\\src\\test\\java\\Features", 
			glue={"stepdefinitions"}
	
	)
	
	public class TestRunner {
		
	
}
