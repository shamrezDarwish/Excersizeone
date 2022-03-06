package steps;


import io.cucumber.java8.*;
import pages.Page;

public class StepDefs extends Page implements En  {

    public StepDefs() {

	Given("I go to url (.*)$\", (final String url) ->  getUrl(url));", () ->  
	When("User Click on Animal", () ->  
	When("User fill out form with letter A", () ->  
	When("User select {int} for Max life span", (Integer int1)() -> 
	When("user can select Life Span", () -> navigateTolifespan());
	When("User should Select checkbox  to Ascending", () -> 
	When("User should click on filter", () -> Filter.click())));
	  

	}
	}
	
 


