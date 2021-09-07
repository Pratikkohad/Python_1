package page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class OHRM_002_AdminTab_page {
    WebDriver driver;
    @FindBy(partialLinkText = "Admin")
    @CacheLookup
    WebElement Txt_admin;

    public OHRM_002_AdminTab_page(WebDriver driver) {
        this.driver = driver;
    }

    public void enterAdmin() {
        Txt_admin.sendKeys(Keys.ENTER);
    }

}
