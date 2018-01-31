@YPO
Feature: YPO CheckoutCreditCard Page UI Test
  This is the description for CheckoutCreditCard Page

  Scenario: LayOutTest For YPO CheckoutCreditCard Page Content
    Given I launch YPO Website
    And I login using Valid Credentials
    When the welcome page is displayed
    Then I click on Continue Button
    When Update Profile Page is Displayed
    Then I click on Save&Confirm Button
    When the ChooseaNetwork Page is displayed
    Then I click on Continue to catalog button
    When the Catalog page is displayed
    And I add Items to the cart
    Then I click on ReviewShoppingCart button
    When the ShoppingCart page is displayed
    Then I click on Proceed to checkout button
    When the CodeOfConduct Page is displayed
    Then I click on save&confirm button
    When the CheckoutSelectPayment Page is displayed
    Then I select Credit Card
    When the CheckoutCreditCard Page is displayed
    Then CheckoutCreditCard Page Content layout is tested
   
   
    


   
		