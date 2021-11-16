package Stepdefination;

import cucumber.api.java.en.*;
import implementation.Product;
import implementation.Search;

public class Search_Steps 
{
	Product product;
	Search search;
	@Given("^I have search  field  on amazon$")
	public void i_have_search_field_on_amazon() throws Throwable
	{


	}

	@When("^I have search for product with name \"([^\"]*)\" with prise (\\d+)$")
	public void i_have_search_for_product_with_name_with_prise(String producrName, Integer price) throws Throwable 
	{

		 product = new Product(producrName, price);
	}

	@Then("^Product with name \"([^\"]*)\" Should display$")
	public void product_with_name_Should_display(String producrName) throws Throwable
	{
			search= new Search();
			String Product123 =search.displayProduct(product);
			System.out.println("The Product is :- "+Product123);

	}

}
