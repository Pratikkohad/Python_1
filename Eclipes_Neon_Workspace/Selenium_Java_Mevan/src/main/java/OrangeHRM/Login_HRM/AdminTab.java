package OrangeHRM.Login_HRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminTab extends Login_Method
{
    static WebDriver driver ;

    public static void main(String[] args) throws InterruptedException
    {

       Login_Method.browserOpen();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]")).click();

    }
}
