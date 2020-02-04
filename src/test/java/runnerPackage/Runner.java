package runnerPackage;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
	
		features= {"/trackDfectAmazonDemo/src/test/java/AmazonFeature.feature"},
		
		glue="stepDefinition"
		
		)
	
	


public class Runner {

}
