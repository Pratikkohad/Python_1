package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import page.OHRM_002_AdminTab_page;

public class OHRM_002_Admin {
    WebDriver driver;
    OHRM_002_AdminTab_page adminp;

    @And("User is on Admin Tab")
    public void user_is_on_admin_tab() {

        adminp = new OHRM_002_AdminTab_page(driver);

        adminp.enterAdmin();
    }

    @Then("Check all The check boxes")
    public void check_all_the_check_boxes() {


    }

}
