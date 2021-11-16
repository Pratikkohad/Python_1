package implementation;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Login_page
{
    Actions action;
    WebDriver driver;
    @FindBy(xpath = "(//*[@class='absolute-center btn51ParentDimension'])[1]")
    private WebElement Regester;


    @FindBy (id = "login_email1")
    private WebElement emailID;


    @FindBy (xpath ="(//span[@class='absolute-center'])[2]")
    private WebElement cntbtn;


    @FindBy(xpath ="//*[@id='login_password1']")
    private WebElement password;


    @FindBy(xpath ="(//*[@class='absolute-center'])[2]")
    private WebElement submit;

    @FindBy (xpath = "(//*[@class='otpinput88'])[1]")
    private WebElement pin;

    @FindBy(xpath ="//*[@id='mainSearch1010']")
    private WebElement search;


    public Login_page(WebDriver driver)
    {
        this.driver = driver;

        PageFactory.initElements(driver, this);
    }


   public void actReg()
   {
       Regester.sendKeys(Keys.ENTER);
   }




}
