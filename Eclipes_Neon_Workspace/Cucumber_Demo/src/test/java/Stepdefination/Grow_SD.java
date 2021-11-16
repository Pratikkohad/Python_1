package Stepdefination;

import cucumber.api.java.en.*;
import implementation.Login_page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Grow_SD
{
    WebDriver driver;
    @Given("^User is on Grow Page$")
    public void user_is_on_Grow_Page() throws Throwable
    {
        System.out.println("User is on Login Page");
    }

    @When("^User click on Register Button$")
    public void user_click_on_Register_Button() throws Throwable
    {
        Login_page p = new Login_page(driver);
                p.actReg();
    }

    @Then("^User Enters Email_Id (.*)$")
    public void user_Enters_Email_Id(String Email_ID) throws Throwable
    {

    }

    @Then("^Click on Continue button$")
    public void click_on_Continue_button() throws Throwable {

    }

    @Then("^User enters Password (.*)$")
    public void user_enters_Password (String Password) throws Throwable {

    }

    @Then("^Click on Submit button$")
    public void click_on_Submit_button() throws Throwable {

    }

    @Then("^User enters Pin (\\d+)$")
    public void user_enters_Pin(int Pins) throws Throwable {

    }

}
