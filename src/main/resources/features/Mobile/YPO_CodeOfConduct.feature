@YPO
Feature: YPO CodeOfConduct Page UI Test
  This is the description for CodeOfConduct Page

 Scenario: LayOutTest For YPO CodeOfConduct Page Content
    Given I launch YPO Website
    And I login using Valid Credentials
    When the welcome page is displayed
    Then I click on Continue Button
    When Update Profile Page is Displayed
    Then I click on Save&Confirm Button
    When the ChooseaNetwork Page is displayed
    Then I click on continue to catalog button
    When the Catalog page is displayed
    And I add Items to the cart
    Then I click on ReviewShoppingCart button
    When the ShoppingCart page is displayed
    Then I click on Proceed to checkout button
    When the CodeOfConduct Page is displayed
    Then CodeOfConduct Page content Layout is tested 
   
		