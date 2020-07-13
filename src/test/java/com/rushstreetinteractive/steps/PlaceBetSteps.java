package com.rushstreetinteractive.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.rushstreetinteractive.Runner.placeBetPage;

public class PlaceBetSteps {

    @Then("^add a sports bet to the bet slip$")
    public void add_a_sports_bet_to_the_bet_slip() {
        placeBetPage.clickBetButton();
        ;
    }

    @And("^place a bet \"([^\"]*)\"$")
    public void place_a_bet(String amount) {
        placeBetPage.betValue(amount);
        placeBetPage.clickPlaceBetButton();
    }

    @And("^get message ([^\"]*)$")
    public void verify_if(String message) {
        placeBetPage.verifyFeedbackTitle(message);
    }

    @And("^verify that ([^\"]*)$")
    public void verify_that(String message) {
        placeBetPage.verifyHeaderTitle(message);
    }

    @And("^close the verify message$")
    public void close_the_verify_message() {
        placeBetPage.clickBackButton();
    }

}
