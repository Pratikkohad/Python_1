package runnertest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
		(
		 features = "src/main/resources/Grow_Login.feature",
		 glue ={"implementation"}	,
		 //tags ="@Smoke",
				 plugin = {"html:bin/cucumber-junit/htmloutput",
						 "junit:bin/cucumber-junit/Webpage.xml",
						 "pretty"
				 },
		 dryRun = true
		)


public class TestRunner {

}
