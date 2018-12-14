package Com.runnerClass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			features ="Features/Automation.feature",
			glue = {"Com.SignInTestCases"},
			plugin={"html:TestResult","json:jsonResult/Result.json"},
			monochrome= true
			//dryRun=true
			
)
public class RunnerClass{
}
	
	
	
	

