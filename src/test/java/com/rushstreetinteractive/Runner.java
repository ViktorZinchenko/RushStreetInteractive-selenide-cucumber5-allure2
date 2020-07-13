package com.rushstreetinteractive;

import com.codeborne.selenide.Configuration;
import com.rushstreetinteractive.pages.*;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com/rushstreetinteractive/steps", "com/rushstreetinteractive/hooks"},
        tags = {"@all"},
        plugin = {"io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm"},
        strict = true
)

public class Runner {

    public static final String BASE_URL = "https://portal-sh-c4f-stg.rushstreetinteractive.com/?page=all-games";
    public static LogInPage logInPage;
    public static PlaceBetPage placeBetPage;
    public static MainPage mainPage;

    @BeforeClass
    public static void init() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "640x1136";
        Configuration.timeout = 65 * 1000;
        setupPages();
    }

    private static void setupPages() {
        mainPage = new MainPage();
        placeBetPage = new PlaceBetPage();
        logInPage = new LogInPage();
    }

}
