package OrangeHRM.BrowserOpen;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox_Login_HRM
{
    private static String url="https://opensource-demo.orangehrmlive.com/";
    private static String Tittle="OrangeHRM";

    public static void main(String[] args)
    {
        System.out.println("++++++++++++++++  Open Browser  ++++++++++++++");
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(url);

        if (Tittle.equals(driver.getTitle()))
        {
            System.out.println("++++++++++++++++  Verified Tittle  ++++++++++++++");
        }




    }
}
