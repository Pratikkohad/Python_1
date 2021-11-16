package Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Login1
{
    private static  WebDriver driver;

    public static void oepnBrowser()
    {
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_ Launching Browser-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        WebDriverManager.chromedriver().setup();
        ChromeOptions option = new ChromeOptions();
       option.addArguments("--headless");
        driver=  new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com");
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "OrangeHRM");
    }
    public static void PanellHRM()
    {
        String Pannel =driver.findElement(By.xpath(" //*[@id=\"frmLogin\"]")).getText();
        System.out.println(Pannel);


    }//*[@id="content"]/div[2]/span

    public static void Login_HRM()
    {
        String usernametxt = driver.findElement(By.xpath("//*[@id=\"divUsername\"]/span")).getText();

        String Passwordtxt = driver.findElement(By.xpath("//*[@id=\"divPassword\"]/span")).getText();


        WebElement Username_V = driver.findElement(By.id("txtUsername"));
        Username_V.sendKeys("Admin");

        WebElement Password_V = driver.findElement(By.id("txtPassword"));
        Password_V.sendKeys("admin123");

        System.out.println(usernametxt + ": " + Username_V.getAttribute("value"));
        System.out.println(Passwordtxt + ": " + Password_V.getAttribute("value"));

        driver.findElement(By.id("btnLogin")).click();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public static void admin_Tab() {
        String s = driver.getCurrentUrl();
        String[] part = s.split("/");
        String p1 = part[4];
        Assert.assertNotEquals(p1, driver.getTitle());
        if (p1.equals("dashboard"))
        {
            System.out.println("We are on Dashboard");
            WebElement AdminTab = driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]"));
            AdminTab.click();

                List<WebElement> sys = driver.findElements(By.xpath("//*[@id ='frmList_ohrmListComponent']//td"));
            Iterator<WebElement> sysittr = sys.iterator();
            while (sysittr.hasNext())
            {
                System.out.println(" "+sysittr.next().getText().toString());

            }
            System.out.println();
            }
        }

}
