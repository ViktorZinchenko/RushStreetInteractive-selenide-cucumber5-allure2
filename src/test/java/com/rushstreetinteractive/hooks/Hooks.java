package com.rushstreetinteractive.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.codeborne.selenide.Selenide.clearBrowserLocalStorage;
import static com.codeborne.selenide.Selenide.clearBrowserCookies;
import static com.codeborne.selenide.Selenide.open;
import static com.rushstreetinteractive.Runner.BASE_URL;
import static com.rushstreetinteractive.util.ScreenshotMaker.makeScreenShoot;
import static io.cucumber.java.Status.PASSED;

public class Hooks {
    public static Logger logger = LoggerFactory.getLogger(Hooks.class);

    @Before
    public void startScenario(Scenario scenario) {
        logger.info("------------------------------------------------------------");
        logger.info("Run scenario - '" + scenario.getName() + "'");
        logger.info("------------------------------------------------------------");
        open(BASE_URL);
    }

    @After
    public static void checkScenarioResult(Scenario scenario) {
        logger.info("------------------------------------------------------------");
        logger.info("Scenario '" + scenario.getName() + "' - " + scenario.getStatus());
        logger.info("------------------------------------------------------------");
        if (!scenario.getStatus().equals(PASSED)) {
            makeScreenShoot();
        }
        clearBrowserLocalStorage();
        clearBrowserCookies();
    }

}
