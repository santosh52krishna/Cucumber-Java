@YPO
Feature: YPO Recertification Page UI Test
  This is the description for Recertification Page

  Scenario: LayOutTest For YPO Recertification Page 
     Given I launch YPO Website
     And I login using Valid Credentials of a Renewal user
     When the Renewal user welcome page is displayed
     Then I click on Continue Button in Renewal Welcome page
     When Update Profile Page is Displayed
     Then I click on Save&Confirm Button
     When the Recertification page is Displayed
     Then Recertification Page Content Layout is tested 
