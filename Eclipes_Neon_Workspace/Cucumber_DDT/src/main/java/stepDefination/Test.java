package stepDefination;

import cucumber.api.java.en.*;

public class Test
{
    @Given("^User is on login page$")
    public void user_is_on_login_page() throws Throwable
    {
        System.out.println("Step 1");
    }

//    @When("^Uswer enter credencial$")
//    public void uswer_enter_credencial() throws Throwable
//    {
//        System.out.println("Step 2");
//    }

    @When("^Uswer enter (.*) and (.*)$")
    public void uswer_enter_Username_and_Password(String unamee, String Pass) throws Throwable
    {
        System.out.println(unamee +"  :- "+Pass);
    }


    @When("^Click on login button$")
    public void click_on_login_button() throws Throwable
    {
        System.out.println("Step 3");
    }

    @Then("^user is on fb dashobard$")
    public void user_is_on_fb_dashobard() throws Throwable {
        System.out.println("Step 4");
    }

}
