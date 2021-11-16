package runnertest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		 features = "src/test/resources/Features",
		 glue ={"StepDefination"}	,
		 plugin ={"pretty","json:target/Myreport/report.json"}
		)


public class TestRunner {

}
