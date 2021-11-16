package Test_Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/java/Features/Login.feature",
        glue = {"StepDefination"},
        plugin = {"pretty",  "html:target/Report/reports.html",
                "json:target/Json_File/cucumber.json",
                "junit:target/XML_File/cucumber.xml"},
        strict = true,
        monochrome = true,
        dryRun= false
)
public class TestRunner {
}
