package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		          features="src/test/resources/features",
		          glue={"stepDefinitions", "AppHooks"},
		          plugin= {"pretty", "html:target/cucumber.reports/report.html"
		        		  },
		          // removes the junk in the console
		          monochrome = true,
		          // removes the unwanted red sentences in the console
		          publish = true,
		          // check the mappings ,even if the mapping is wrong ...will execute the testcases ....will give missing step file: todo:implemen me
		          strict=true,
		          // true means check the mapping ...false means check the mapping and excute
		          dryRun = false
		        )

public class TestRunner 
{

}
