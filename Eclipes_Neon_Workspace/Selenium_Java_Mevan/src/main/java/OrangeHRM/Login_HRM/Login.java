package OrangeHRM.Login_HRM;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login
{
    private static String url="https://opensource-demo.orangehrmlive.com/";
    private static String Tittle="OrangeHRM";
    private static WebElement Username;

    public static void main(String[] args) throws InterruptedException {
        System.out.println("++++++++++++++++  Open Browser  ++++++++++++++");
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

        if (Tittle.equals(driver.getTitle())) {
            System.out.println("++++++++++++++++  Verified Tittle  ++++++++++++++");
        }

        Username = driver.findElement(By.cssSelector("*#txtUsername"));
        Username.sendKeys("Admin");
        String name = Username.getAttribute("value");

        WebElement password = driver.findElement(By.cssSelector("*#txtPassword"));
        password.sendKeys("admin123");
        String pass = password.getAttribute("value");

        WebElement submit = driver.findElement(By.cssSelector("*[type='submit']"));
        submit.submit();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"welcome\"]")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[3]/a")).click();

    }

    }
