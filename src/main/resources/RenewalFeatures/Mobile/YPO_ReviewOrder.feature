@YPO
Feature: YPO ReviewOrder Page UI Test
  This is the description for ReviewOrder Page

 Scenario: LayOutTest For YPO ReviewOrder Page Content
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
    Then I click on save&confirm button
    When the CheckoutSelectPayment Page is displayed
    Then I select Check/wire
    Then I click on Review Order
    When the ReviewOrder page is displayed
    Then ReviewOrder Page content layout is tested
 
     
   
		