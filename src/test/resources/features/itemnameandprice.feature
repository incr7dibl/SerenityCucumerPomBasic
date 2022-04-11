Feature: Getting names and price of all the items
  As a user I want to get names and price of all the items

  Scenario Outline: User getting names and price of all the items
    Given user navigate to the saucedemo
    When user do the login
    Then user gets the item name and price from the page
