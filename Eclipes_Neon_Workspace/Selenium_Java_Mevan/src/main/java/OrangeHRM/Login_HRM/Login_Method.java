package OrangeHRM.Login_HRM;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Method
{
    private static String url="https://opensource-demo.orangehrmlive.com/";
    private static String Tittle="OrangeHRM";
    private static WebElement Username;
    private static  WebDriver driver;


    public static void browserOpen() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

        Username = driver.findElement(By.cssSelector("*#txtUsername"));
        Username.sendKeys("Admin");
        String name = Username.getAttribute("value");

        WebElement password = driver.findElement(By.cssSelector("*#txtPassword"));
        password.sendKeys("admin123");
        String pass = password.getAttribute("value");

        WebElement submit = driver.findElement(By.cssSelector("*[type='submit']"));
        submit.submit();


    }
}
