	package StepDefination;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import org.junit.Assert;
import pages.HomePage;
import pages.Login_page;
import util.Test_Base;


public class HomePage_steps extends Test_Base
{
    Login_page lp = new Login_page();
    HomePage hp = new HomePage();
    @Given("^user open browser$")
    public void user_open_browser() throws Throwable
    {
        Test_Base.initilization();
    }

    @Then("^user is on login page$")
    public void user_is_on_login_page() throws Throwable
    {
        lp = new Login_page();
        String tittle =lp.validateLoginPageTittle();
        System.out.println("Login Tittle Page is :- "+ tittle);
        //Assert.assertEquals();
    }

    @Then("^user logs into app$")
    public void user_logs_into_app() throws Throwable
    {
       hp= lp.login(prop.getProperty("username"),prop.getProperty("password"));

    }

    @Then("^validate home page tittle$")
    public void validate_home_page_tittle() throws Throwable
    {
        String hometittle =hp.verifyHomePageTittle();
        System.out.println("Home Page tittle is :- "+ hometittle);
    }

    @Then("^validate logged in username$")
    public void validate_logged_in_username() throws Throwable
    {
        //boolean verifyName =hp.verifyCorrectUsername();
       // System.out.println(" Username is "+ verifyName);
    }
}
