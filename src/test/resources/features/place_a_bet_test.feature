# language: en

@all
Feature: Scenarios for testing of betting

  @loggedOutPlayer
  Scenario Outline: Logged out player tries to place a bet

    Given open of website homepage
    Given verify if a player is logged in or not
    When enter the "<sports>" and open the events list
    Then add a sports bet to the bet slip
    And place a bet "<betAmount>"
    And get message Your bet was not placed!
    Given log in with "<userName>" and "<password>"
    And close the verify message
    And place a bet "<betAmount>"
    And verify that Your bet has been placed!

    Examples:
      | sports | betAmount | userName | password  |
      | tennis | 2.50      | qatest   | password1 |

  @loggedInPlayer
  Scenario Outline: Logged in player places a bet

    Given open of website homepage
    Given verify if a player is logged in or not
    Given log in with "<userName>" and "<password>"
    When enter the "<sports>" and open the events list
    Then add a sports bet to the bet slip
    And place a bet "<betAmount>"
    And verify that Your bet has been placed!

    Examples:
      | sports | betAmount | userName | password  |
      | soccer | 1.00      | qatest   | password1 |