package steps;


import io.cucumber.java8.*;
import pages.Page;

public class StepDefs extends Page implements En  {

    public StepDefs() {
        Given("I go to url (.*)$", (final String url) ->  getUrl(url));
        Then ("I check page title", () -> checkTitle());
        When("I can log in with the following {string} and {string}", (String string, String string2) -> login(string,string2));
        Then("I am logged in", () -> validateloggedIn());
        Then("I can navigate to the weather page", () -> navigateToWeatherPage());
        Then("I can search for the weather in {string}", (String city) -> searchCity(city));
        Then("I have searched for the weather in {string}", (String city) -> searchCity(city));
        Then("I can add to my locations", () -> addToMyLocation());
        

    }


    }


