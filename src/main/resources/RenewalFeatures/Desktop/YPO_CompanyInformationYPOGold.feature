@YPO
Feature: YPO CompanyInformationYPOGold Page UI Test
  This is the description for CompanyInformationYPOGold Page

  Scenario: LayOutTest For YPO CompanyInformationYPOGold Page 
  	Given I launch YPO Website
    And I login using Valid Credentials of a Renewal user
    When we go to CompanyInformationYPOGold page 
    Then CompanyInformationYPOGold Page Content Layout is tested