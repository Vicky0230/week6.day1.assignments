package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		dryRun=false,
		features= {"src/test/java/features/Assignment.feature"},
		glue= {"assignment1"},
		monochrome=true
		)
public class RunnerClass extends AbstractTestNGCucumberTests
{
	
}
