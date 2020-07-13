package com.rushstreetinteractive.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static com.rushstreetinteractive.Runner.mainPage;

public class MainPageSteps {

    @Given("^open of website homepage$")
    public void open_of_website_homepage() {
        mainPage.checkUrl();
    }

    @When("^enter the \"([^\"]*)\" and open the events list$")
    public void enter_the_sport_and_open_the_events_list(String value) {
        mainPage.clickMenu();
        mainPage.clickCategory();
        mainPage.searchInputValue(value);
    }

}
