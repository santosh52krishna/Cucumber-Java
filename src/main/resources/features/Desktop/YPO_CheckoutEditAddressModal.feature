@YPO
Feature: YPO CheckoutEditAddressModal Page UI Test
  This is the description for CheckoutEditAddressModal Page

  Scenario: LayOutTest For YPO CheckoutEditAddressModal Page Content
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
    When the credit card page is displayed
    Then I click on Billing Address
    Then I click on Add an Address
    When the CheckoutEditAddressModal Page is displayed
    Then CheckoutEditAddressModal Page content layout is tested
   
   
    

   
   
		