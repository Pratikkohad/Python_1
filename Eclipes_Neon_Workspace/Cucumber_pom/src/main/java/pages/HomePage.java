package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Test_Base;

public class HomePage extends Test_Base

{
    @FindBy (xpath = "//*[contains(text(), 'User: Naveen k')]")
    @CacheLookup
    WebElement userNameLable;

    @FindBy (xpath = "//*[contains(text(), 'Contacts')]")
    @CacheLookup
    WebElement contactLink;

    @FindBy (xpath = "//*[contains(text(), 'New Contact')]")
    @CacheLookup
    WebElement newContactLink;

    @FindBy (xpath = "//*[contains(text(), 'Deals')]")
    @CacheLookup
    WebElement dealsLink;

    @FindBy (xpath = "//*[contains(text(), 'Task')]")
    @CacheLookup
    WebElement taskLink;

    public HomePage()
    {
        PageFactory.initElements(driver,this);
    }
    public  String verifyHomePageTittle()
    {
        return driver.getTitle();
    }
//    public  boolean verifyCorrectUsername()
//    {
//        return userNameLable.isDisplayed();
//    }
//    public ContactPage clickonContactLink()
//    {
//        contactLink.click();
//        return ContactPage();
//    }
//
//    public DealPage clickonDealLink()
//    {
//        dealsLink.click();
//        return DealPage();
//    }
//
//    public TaskPage clickontaskLink()
//    {
//        taskLink.click();
//        return TaskPage();
//    }


    public  void clickOnNewContactLink()
    {
        Actions action = new Actions(driver);
        action.moveToElement(contactLink).build().perform();
        newContactLink.click();
    }
}
