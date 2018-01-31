@YPO
Feature: YPO CatalogItemDetailedAddNewMember UI Test
  This is the description for CatalogItemDetailedAddNewMember Page

  Scenario: LayOutTest For YPO CatalogItemDetailedAddNewMember Page Content
    Given I launch YPO Website
    And I login using Valid Credentials
    When the welcome page is displayed
    Then I click on Continue Button
    When Update Profile Page is Displayed
    Then I click on Save&Confirm Button
    When the ChooseaNetwork Page is displayed
    Then I click on Continue to catalog button
    When the Catalog page is displayed
    Then I click on a Item
    When the CatalogItemDetailed Page is displayed
    Then I click on Family member
    When the CatalogItemDetailedDropdown page is displayed
    Then I click on Add a family member
    When the CatalogItemDetailAddNewMember page is displayed
    Then CatalogItemDetailAddNewMember Page content Layout is tested
    
 
    
    

  
		