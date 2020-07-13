package com.rushstreetinteractive.pages;

import com.codeborne.selenide.SelenideElement;
import com.rushstreetinteractive.hooks.Hooks;

import static com.codeborne.selenide.Selenide.$;
import static com.rushstreetinteractive.Runner.mainPage;

public class LogInPage {

    private SelenideElement menuCashier = $("#menu-cashier");
    private SelenideElement logoutButton = $("#sidebar-menu-logout");
    private SelenideElement loginButton = $("a.btn-login");
    private SelenideElement typeUsername = $("#login-form-modal-email");
    private SelenideElement typePassword = $("#login-form-modal-password");
    private SelenideElement welcomeMessage = $(".btn-modal-close");

    public void verifyStatusOfPlayer() {
        if (menuCashier.isDisplayed()) {
            mainPage.clickMenu();
            logoutButton.click();
            welcomeMessage.click();
        } else {
            Hooks.logger.info("Player is not logged in");
        }
    }

    public void clickLogInButton() {
        loginButton.click();
    }

    public void enterLogIn(String username) {
        typeUsername.setValue(username);
    }

    public void enterPassword(String password) {
        typePassword.setValue(password).pressEnter();
    }

}
