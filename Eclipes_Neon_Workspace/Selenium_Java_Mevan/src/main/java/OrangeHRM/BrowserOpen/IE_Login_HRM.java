package OrangeHRM.BrowserOpen;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IE_Login_HRM
{
    private static String url="https://opensource-demo.orangehrmlive.com/";
    private static String Tittle="OrangeHRM";

    public static void main(String[] args)
    {
        System.out.println("++++++++++++++++  Open Browser  ++++++++++++++");
        WebDriverManager.edgedriver().setup();

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get(url);

        if (Tittle.equals(driver.getTitle()))
        {
            System.out.println("++++++++++++++++  Verified Tittle  ++++++++++++++");
        }




    }
}
