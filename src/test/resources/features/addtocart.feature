Feature: Adding items to cart from homepage
As a user I should be able to add items to the cart

Scenario: User adding all the items from homepage
Given User navigates to the website
When user do the login by entering "standard_user" and "secret_sauce"
Then User selects all the items

Scenario: User adding individual item
Given User navigates to the website
When user do the login by entering "standard_user" and "secret_sauce"
Then User selects items
 |Sauce Labs Backpack|               
 |Sauce Labs Bike Light|             
 |Sauce Labs Bolt T-Shirt|           
 |Sauce Labs Fleece Jacket|          
 |Sauce Labs Onesie|
 |Test.allTheThings() T-Shirt (Red)| 
