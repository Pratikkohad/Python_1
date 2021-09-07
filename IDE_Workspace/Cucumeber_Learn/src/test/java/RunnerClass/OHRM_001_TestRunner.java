package RunnerClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.testng.Reporter;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features",
        glue = {"StepDefination"},
        plugin = {"pretty", "summary", "html:target/Report/reports.html",
                "json:target/Json_File/cucumber.json",
                "junit:target/XML_File/cucumber.xml"}
)

public class OHRM_001_TestRunner {

}
