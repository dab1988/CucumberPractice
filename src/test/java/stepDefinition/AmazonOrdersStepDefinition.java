package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;

public class AmazonOrdersStepDefinition 
{

	@Given("^Amazon Application is logged in with a Valid User$")
	public void amazon_Application_is_logged_in_with_a_Valid_User() throws Throwable {
	   
	}

	@When("^User Click Orders Link$")
	public void user_Click_Orders_Link() throws Throwable {
	   
	}

	@And  ("^User Click on Closed Orders Link$")
	public void user_Click_on_Closed_Orders_Link() throws Throwable {
	 
	}

	@Then("^User should only see Closed Orders$")
	public void user_should_only_see_Closed_Orders() throws Throwable {
	 
	}

	@And("^User Click on Open Orders Link$")
	public void user_Click_on_Open_Orders_Link() throws Throwable {
	 
	}

	@Then("^User should only see Open Orders$")
	public void user_should_only_see_Open_Orders() throws Throwable {
	   
	}

	@And("^User Click on Cancelled Orders Link$")
	public void user_Click_on_Cancelled_Orders_Link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("^User should only see Cancelled Orders$")
	public void user_should_only_see_Cancelled_Orders() throws Throwable {
	 
	}

	@And("^User Click on Rejected Orders Link$")
	public void user_Click_on_Rejected_Orders_Link() throws Throwable {
	
	}

	@Then("^User should only see Rejected Orders$")
	public void user_should_only_see_Rejected_Orders() throws Throwable {
	
	}
	
}
