package com.rushstreetinteractive.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selenide.$;
import static org.junit.Assert.assertEquals;

public class PlaceBetPage {

    private SelenideElement betButton = $(".sc-fzpans:not(:disabled)");
    private SelenideElement betValueField = $(".mod-KambiBC-stake-input");
    private SelenideElement placeBetButton = $(".mod-KambiBC-betslip__place-bet-btn");
    private SelenideElement backButton = $("button.mod-KambiBC-betslip-button");
    private SelenideElement feedbackTitle = $(".mod-KambiBC-betslip-feedback__title");
    private SelenideElement headerTitle = $(".mod-KambiBC-betslip-receipt-header__title");

    public void clickBetButton() {
        betButton.click();
    }

    public void betValue(String amount) {
        betValueField.setValue(amount);
    }

    public void clickBackButton() {
        backButton.click();
    }

    public void clickPlaceBetButton() {
        placeBetButton.should(enabled);
        placeBetButton.click();
    }

    public void verifyFeedbackTitle(String message) {
        assertEquals(message, feedbackTitle.getText());
    }

    public void verifyHeaderTitle(String message) {
        assertEquals(message, headerTitle.getText());
    }

}
