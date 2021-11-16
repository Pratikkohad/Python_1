package stepDefination;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Data_Step_TAble
{
//	WebDriver driver;
//	private WebElement Username;
//	private WebElement Password;
//	private WebElement Login_BTN;
//	private JavascriptExecutor js;
//	private WebElement UserTitle;
//
//	    @Given("^User is already on login page$")
//	    public void user_is_already_on_login_page() throws Throwable
//	    {
//	        WebDriverManager.chromedriver().setup();
//	        driver = new ChromeDriver();
//	        driver.manage().window().maximize();
//	        driver.get("https://classic.freecrm.com/login.cfm");
//
//	    }
//
//	    @When("^title of Login page is Free CRM$")
//	    public void title_of_Login_page_is_Free_CRM() throws Throwable
//	    {
//	        String Tittle =driver.getTitle();
//	        System.out.println("Tittle is :- "+ Tittle);
//	        Assert.assertEquals("CRMPRO Log In Screen",Tittle);
//
//	    }
//
//
//	    @Then("^User enters username and password$")
//	    public void user_enters_username_and_password(DataTable Credentials) throws Throwable
//	    {
//	        List<List<String>> data =Credentials.raw();
//	        Username=driver.findElement(By.xpath("//*[@name='username']"));
//	        Username.sendKeys(data.get(0).get(0));
//
//	        Password=driver.findElement(By.xpath(" //*[@name='password']"));
//	        Password.sendKeys(data.get(0).get(1));
//	    }
//
//	        @Then("^click on login Button$")
//	    public void click_on_login_Button() throws Throwable
//	    {
//	        Login_BTN=driver.findElement(By.xpath("//*[@class='btn btn-small']"));
//	        js = (JavascriptExecutor) driver;
//	        js.executeScript("arguments[0].click();",Login_BTN);
//	        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//	    }
//
//	    @Then("^User is on Home page$")
//	    public void user_is_on_Home_page() throws Throwable
//	    {
//	        String Tittle1= driver.getTitle();
//	        System.out.println("Home Page tittle is  :- "+Tittle1);
//	        Assert.assertEquals("CRMPRO",Tittle1);
//	    }
//	@When("^user mouse to new deal page$")
//	public void user_mouse_to_new_deal_page() throws Throwable
//	{
//		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//		driver.switchTo().frame("mainpanel");
//		Actions action = new Actions(driver);
//		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
//		driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
//
//	}
//
//	@Then("^user enters deal details$")
//	public void user_enters_deal_details(DataTable table) throws Throwable
//	{
//		List<List<String>> data =table.raw();
//		System.out.println(data);
//
//		WebElement ID=driver.findElement(By.id("title"));
//		ID.sendKeys(data.get(0).get(0));
//		System.out.println(ID.getAttribute("value"));
//		driver.findElement(By.id("amount")).sendKeys(data.get(0).get(1));
//		driver.findElement(By.id("probability")).sendKeys(data.get(0).get(2));
//		driver.findElement(By.id("commission")).sendKeys(data.get(0).get(3));
//	}
//
//	    @Then("^Close the Browser$")
//	    public void close_the_Browser() throws Throwable
//	    {
//            driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//	        driver.quit();
//	    }
}
