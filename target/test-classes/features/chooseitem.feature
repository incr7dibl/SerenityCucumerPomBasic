Feature: Choosing all the items
  As a user I want to choose all items

  Scenario Outline: User choosing all the items
    Given user navigate to the website
    When user do the login with username <username> and password <password>
    Then user choose the <item> item

    Examples: 
      | username                | password     | item                              |
      | standard_user           | secret_sauce | Sauce Labs Backpack               |
      | standard_user           | secret_sauce | Sauce Labs Bike Light             |
      | standard_user           | secret_sauce | Sauce Labs Bolt T-Shirt           |
      | standard_user           | secret_sauce | Sauce Labs Fleece Jacket          |
      | standard_user           | secret_sauce | Sauce Labs Onesie                 |
      | standard_user           | secret_sauce | Test.allTheThings() T-Shirt (Red) |
      | problem_user            | secret_sauce | Sauce Labs Backpack               |
      | problem_user            | secret_sauce | Sauce Labs Bike Light             |
      | problem_user            | secret_sauce | Sauce Labs Bolt T-Shirt           |
      | problem_user            | secret_sauce | Sauce Labs Fleece Jacket          |
      | problem_user            | secret_sauce | Sauce Labs Onesie                 |
      | problem_user            | secret_sauce | Test.allTheThings() T-Shirt (Red) |
      | performance_glitch_user | secret_sauce | Sauce Labs Backpack               |
      | performance_glitch_user | secret_sauce | Sauce Labs Bike Light             |
      | performance_glitch_user | secret_sauce | Sauce Labs Bolt T-Shirt           |
      | performance_glitch_user | secret_sauce | Sauce Labs Fleece Jacket          |
      | performance_glitch_user | secret_sauce | Sauce Labs Onesie                 |
      | performance_glitch_user | secret_sauce | Test.allTheThings() T-Shirt (Red) |
