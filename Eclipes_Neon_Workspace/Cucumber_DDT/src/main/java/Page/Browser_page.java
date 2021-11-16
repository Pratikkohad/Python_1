package Page;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Browser_page
{
    private static WebDriver driver;

    public static void opnbrws()

    {

    }

    public Browser_page()
    {
        PageFactory.initElements(driver,this);
    }
}

