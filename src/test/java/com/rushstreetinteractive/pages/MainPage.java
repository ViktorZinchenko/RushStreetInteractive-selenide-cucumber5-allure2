package com.rushstreetinteractive.pages;

import com.codeborne.selenide.SelenideElement;
import com.rushstreetinteractive.hooks.Hooks;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.url;
import static com.rushstreetinteractive.Runner.BASE_URL;
import static org.junit.Assert.assertEquals;

public class MainPage {

    private SelenideElement menuButton = $("#menu-toggle");
    private SelenideElement menuCategory = $("#sidebar-menu-sports");
    private SelenideElement searchIcon = $(".KambiBC-applied-terms__search-icon");
    private SelenideElement searchInput = $("#KambiBC-term-search-overlay__input");
    private SelenideElement searchResult = $(".KambiBC-search-results-term");
    private SelenideElement emptyResult = $(".KambiBC-term-search-results__empty-info");
    private SelenideElement welcomeMessage = $(".btn-modal-close");

    public void checkUrl() {
        assertEquals("URL does not match", BASE_URL, url());
    }

    public void clickMenu() {
        menuButton.click();
    }

    public void clickCategory() {
        menuCategory.click();
    }

    public void searchInputValue(String value) {
        searchIcon.click();
        searchInput.setValue(value).pressEnter();
        if (emptyResult.isEnabled()) {
            Hooks.logger.info("No search results were found for " + value);
        }
        if (searchResult.isEnabled()) {
            searchResult.click();
        }
    }

    public void clickWelcomeMessage() {
        welcomeMessage.click();
    }

}
