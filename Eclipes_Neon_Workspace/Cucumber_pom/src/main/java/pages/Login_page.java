package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Test_Base;

public class Login_page extends Test_Base
{


    @FindBy (name = "username")
    WebElement username;

    @FindBy (name = "password")
    WebElement password;

    @FindBy (xpath = "//*[@id=\"loginForm\"]/div/div/input")
    WebElement loginBtn;

    @FindBy (xpath = "//*[contains(text() , 'Sign Up')] ")
    WebElement signUpBtn;

    @FindBy (xpath = "//*[contains(@class, 'img-responsive')]")
    WebElement crmLogo;

    public Login_page()
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public  String validateLoginPageTittle()
    {
        return driver.getTitle();
    }

    public boolean validateCRMImage()
    {
        return crmLogo.isDisplayed();
    }

    public HomePage login (String un , String pw)
    {

        username.sendKeys(un);
        System.out.println("Username is  :- "+username.getAttribute("value"));
        password.sendKeys(pw);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", loginBtn);

        return new HomePage();
    }

}

