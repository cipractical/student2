package features.calculator;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class GoogleCalculatorStepDefinition {
	
	GoogleCalculatorTester myTester; 
	
	@Given("^I open google$")
	public void i_open_google() {
	    // Write code here that turns the phrase above into concrete actions
		myTester = new GoogleCalculatorTester();
		myTester.launchGoogleCalculator();
	}

	@When("^I enter \"([^\"]*)\" in search textbox$")
	public void i_enter_in_search_textbox(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		myTester.submitEquation(arg1);
	}

	@Then("^I should get result as \"([^\"]*)\"$")
	public void i_should_get_result_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String actualResult = myTester.getResult();
		Assert.assertEquals(arg1, actualResult);
	}
	
}
