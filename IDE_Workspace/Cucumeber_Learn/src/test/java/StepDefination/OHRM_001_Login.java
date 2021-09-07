package StepDefination;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.openqa.selenium.chrome.ChromeOptions;
import page.OHRM_001_Login_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.logging.Logger;

public class OHRM_001_Login
{
	protected WebDriver driver;
	OHRM_001_Login_Page lp = new OHRM_001_Login_Page(driver);
	private static Logger Log = Logger.getLogger(Logger.class.getName());
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		//options.addArguments("--headless");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();

	}
	@Given("User is on Login Page")
	public void user_is_on_login_page()
	{

		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^User enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username , String password)
	{
		lp = new OHRM_001_Login_Page(driver);
		lp.enter_username(username);
		lp.enter_password(password);

	}

	@Then("Navigate to Home page")
	public void navigate_to_home_page() throws InterruptedException
	{
		
		lp = new OHRM_001_Login_Page(driver);
		lp.enter_button();
		Thread.sleep(2000);

	}
	
	
//	@After()
//	public void closeBrowser() {
//		driver.quit();
//	}
}
