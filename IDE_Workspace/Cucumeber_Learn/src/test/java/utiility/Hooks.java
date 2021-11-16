package utiility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.* ;

public class Hooks
{
	WebDriver driver;
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		//options.addArguments("--headless");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();

	}

    @After
    public void afterScenario(){
        System.out.println("This will run after the Scenario");
    }
}
