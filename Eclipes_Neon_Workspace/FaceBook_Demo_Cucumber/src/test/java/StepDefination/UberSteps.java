package StepDefination;

import cucumber.api.java.en.*;

public class UberSteps
{
    @Given("^User Wants to select car type \"([^\"]*)\" from uber$")
    public void user_Wants_to_select_car_type_from_uber(String arg1) throws Throwable
    {
        System.out.println("Step 1 :- "+ arg1);
    }

    @When("^User select car \"([^\"]*)\" and pickup point \"([^\"]*)\" and drop location \"([^\"]*)\"$")
    public void user_select_car_and_pickup_point_and_drop_location(String arg1, String arg2, String arg3) throws Throwable
    {
        System.out.println("Step 2 :- "+ arg1 + " "+arg2+ " "+arg2);
    }

    @Then("^Driver start the Journey$")
    public void driver_start_the_Journey() throws Throwable
    {
        System.out.println("Step 3 :- ");
    }

    @Then("^Driver ends the journey$")
    public void driver_ends_the_journey() throws Throwable
    {
        System.out.println("Step 4 :- ");
    }
    @Then("^User pays (\\d+) USD$")
    public void user_pays_USD(int arg1) throws Throwable
    {
        System.out.println("Step 5 :- "+ arg1);
        System.out.println();
    }
}
