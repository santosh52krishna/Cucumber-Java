 @YPO
Feature: YPO CatalogDeleteItem UI Test
  This is the description for CatalogDeleteItem Page

  Scenario: LayOutTest For YPO CatalogDeleteItem Page Content
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
    Then I click on CartIcon
    When the CatalogModal page is displayed
    Then I click on Remove button
    When the CatalogDeleteItem page is displayed
    Then CatalogDeleteItem page content Layout is tested
  
   
    