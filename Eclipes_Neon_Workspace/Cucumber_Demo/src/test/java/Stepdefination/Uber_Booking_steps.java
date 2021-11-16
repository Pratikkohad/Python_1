package Stepdefination;

import cucumber.api.java.en.*;

public class Uber_Booking_steps 
{
	@Given("^User Wants to select car type \"([^\"]*)\" from uber$")
	public void user_Wants_to_select_car_type_from_uber(String cartype) throws Throwable 
	{
	    System.out.println(cartype);
	}

	@When("^User select car \"([^\"]*)\" and pickup point \"([^\"]*)\" and drop location \"([^\"]*)\"$")
	public void user_select_car_and_pickup_point_and_drop_location(String cartype, String pickupLocation, String dropLocation) throws Throwable
	{
		System.out.println(cartype+"\n"+ dropLocation+"\n" + pickupLocation);

	}

	@Then("^Driver start the Journey$")
	public void driver_start_the_Journey() throws Throwable 
	{


	}

	@Then("^Driver ends the journey$")
	public void driver_ends_the_journey() throws Throwable 
	{


	}

	@Then("^User pays (\\d+) USD$")
	public void user_pays_USD(Integer  price) throws Throwable
	{

		System.out.println(price);
	}
}
