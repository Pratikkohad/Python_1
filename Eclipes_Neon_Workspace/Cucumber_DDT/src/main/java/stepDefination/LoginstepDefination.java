//package stepDefination;
//
//import Page.Browser_page;
//import cucumber.api.PendingException;
//import cucumber.api.java.en.*;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Action;
//import org.openqa.selenium.interactions.Actions;
//
//import java.util.concurrent.TimeUnit;
//
//public class LoginstepDefination
//{
//    WebDriver driver;
//    private WebElement Username;
//    private WebElement Password;
//    private WebElement Login_BTN;
//    private JavascriptExecutor js;
//    private WebElement UserTitle;
//
//    @Given("^User is already on login page$")
//    public void user_is_already_on_login_page() throws Throwable
//    {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://classic.freecrm.com/login.cfm");
//
//    }
//
//    @When("^title of Login page is Free CRM$")
//    public void title_of_Login_page_is_Free_CRM() throws Throwable
//    {
//        String Tittle =driver.getTitle();
//        System.out.println("Tittle is :- "+ Tittle);
//        Assert.assertEquals("CRMPRO Log In Screen",Tittle);
//
//    }
//
//    @ Then ("^User enters (.*) and(.*)$")
//    public void user_enters_username_and_password(String username , String password)
//    {
//        Username=driver.findElement(By.xpath("//*[@name='username']"));
//        Username.sendKeys(username);
//        String Name =Username.getAttribute("value");
//        System.out.println("Username  :- "+ Name);
//
//
//        Password=driver.findElement(By.xpath(" //*[@name='password']"));
//        Password.sendKeys(password);
//        String Pass =Password.getAttribute("value");
//        System.out.println("Password  :- "+ Pass);
//    }
//
////    @ Then ("^User enters (.*) and(.*)$")
////    public void user_enters_username_and_password(String username , String password)
////    {
////        driver.findElement(By.name("username")).sendKeys(username);
////        driver.findElement(By.name("password")).sendKeys(password);
////    }
//
//    @Then("^click on login Button$")
//    public void click_on_login_Button() throws Throwable
//    {
//        Login_BTN=driver.findElement(By.xpath("//*[@class='btn btn-small']"));
//        js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].click();",Login_BTN);
//        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//    }
//
//    @Then("^User is on Home page$")
//    public void user_is_on_Home_page() throws Throwable
//    {
//        String Tittle1= driver.getTitle();
//        System.out.println("Home Page tittle is  :- "+Tittle1);
//        Assert.assertEquals("CRMPRO",Tittle1);
//    }
//
//    @When("^user mouse to new contact page$")
//    public void user_mouse_to_new_contact_page() throws Throwable
//    {
//        System.out.println("Contact Page Step1");
//        Actions action = new Actions(driver);
//        Thread.sleep(4000);
//        WebElement contactText = driver.findElement(By.xpath("//*[@id='navmenu']/ul/li[5]/a"));
//       // WebElement contactText = driver.findElement(By.linkText("Contacts"));
////        JavascriptExecutor js =  (JavascriptExecutor)driver;
////        js.executeScript("arguments[0].click();"+ contactText);
//
//
//
//       action.moveToElement(contactText).build().perform();
//
//        //action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
//        //driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
//
//    }
//
//    @Then("^Close the Browser$")
//    public void close_the_Browser() throws Throwable
//    {
//        driver.quit();
//    }
//
//}
