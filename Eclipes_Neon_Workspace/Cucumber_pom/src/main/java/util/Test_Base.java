package util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Test_Base
{
    public  static WebDriver driver;
    public  static Properties prop;

    public Test_Base()
    {
        try
        {
            prop = new Properties();
            String Config_path= "D:\\Eclipes_Neon_Workspace\\Cucumber_pom\\src\\main\\java\\Config\\Configuration.properties";
            FileInputStream fis = new FileInputStream(Config_path);

            prop.load(fis);


        }
        catch (IOException e)
        {
            e.getMessage();
        }
    }

    public  static  void initilization()
    {
        String browserName = prop.getProperty("browser");
        if (browserName.equals("chrome"))
        {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if (browserName.equals("Firefox"))
        {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(TestUtil.IMPLICATE_WAIT, TimeUnit.SECONDS);


        driver.get(prop.getProperty("url"));


    }


}
