package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinitionFile 
{

	@Given("^Open the Uber App$")
	public void open_the_Uber_App() throws Throwable {
	 
	}

	@When("^Search for the \"([^\"]*)\" card$")
	public void search_for_the_card(String carType) throws Throwable 
	{
		System.out.println(carType);
	}

	@When("^Enter Pick Up Location \"([^\"]*)\" and Drop Location \"([^\"]*)\"$")
	public void enter_Pick_Up_Location_and_Drop_Location(String PickUpLocation, String DropLocation) throws Throwable
	{
		System.out.println(PickUpLocation +"  "+DropLocation);
	}

	@When("^Board the Cab after \"([^\"]*)\" minutes and starts the Journey$")
	public void board_the_Cab_after_minutes_and_starts_the_Journey(String Time) throws Throwable 
	{
		 System.out.println(Time);
	}

	@When("^Drop on Drop Point \"([^\"]*)\"$")
	public void drop_on_Drop_Point(String DropLocation) throws Throwable 
	{
		 System.out.println(DropLocation);
	}

	@Then("^Pay the Fair Rs (\\d+)$")
	public void pay_the_Fair_Rs(int price) throws Throwable 
	{
	    System.out.println(price);
	}

	
}
