package com.rushstreetinteractive.steps;

import io.cucumber.java.en.Given;

import static com.rushstreetinteractive.Runner.logInPage;
import static com.rushstreetinteractive.Runner.mainPage;
import static org.junit.Assert.assertEquals;

public class LogInSteps {

    @Given("^log in with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void log_in_with_username_and_password(String username, String password) {
        logInPage.clickLogInButton();
        logInPage.enterLogIn(username);
        assertEquals("Username does not match", "qatest", username);
        logInPage.enterPassword(password);
        assertEquals("Password does not mach", "password1", password);
        mainPage.clickWelcomeMessage();
    }

    @Given("^verify if a player is logged in or not$")
    public void verify_if_a_player_is_logged_in_or_not() {
        logInPage.verifyStatusOfPlayer();
    }

}
