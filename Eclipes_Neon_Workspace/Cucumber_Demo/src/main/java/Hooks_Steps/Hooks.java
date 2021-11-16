package Hooks_Steps;

import cucumber.api.java.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks
{
    @Before
    public void Browser_open()
    {
        System.out.println("This will run before the Scenario");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://groww.in");
        driver.manage().timeouts().pageLoadTimeout(30 , TimeUnit.SECONDS);
    }

    @After
    public void TearDown(){
        System.out.println("This will run after the Scenario");
    }
}
