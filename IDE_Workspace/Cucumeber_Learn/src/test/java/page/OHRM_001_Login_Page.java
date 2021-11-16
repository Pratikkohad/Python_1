package page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class OHRM_001_Login_Page {
    WebDriver driver;
    @FindBy(how = How.ID, using = "txtUsername")
    @CacheLookup
    WebElement Txt_username;

    @FindBy(how = How.ID, using = "txtPassword")
    @CacheLookup
    WebElement Txt_Password;

    @FindBy(how = How.ID, using = "btnLogin")
    @CacheLookup
    WebElement Txt_Button;

    @FindBy(how = How.ID, using = "spanMessage")
    @CacheLookup
    WebElement Txt_SMS;


    public OHRM_001_Login_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String enter_username(String Username) 
    {
        Txt_username.sendKeys(Username);
        
        String usNAme = Txt_username.getAttribute("value");
        if (usNAme.isEmpty())
        {
            System.out.println("Username Filed is Empty :- " + usNAme);
        } else
        {
            System.out.println("Username is :- " + usNAme);
        }
        return Username;
    }

    public String enter_password(String Password) {
        Txt_Password.sendKeys(Password);
        String usPass = Txt_Password.getAttribute("value");
        if (usPass.isEmpty()) {
            System.out.println("Password Filed is Empty :- " + usPass);
        } else {
            System.out.println("Password is :- " + usPass);
        }
        return Password;

    }

    public void enter_button() {
        Txt_username.sendKeys(Keys.ENTER);
        try {
            System.out.println(Txt_SMS.getText());
        } catch (Exception e) {
            // System.out.println(e);
        }
    }
}
