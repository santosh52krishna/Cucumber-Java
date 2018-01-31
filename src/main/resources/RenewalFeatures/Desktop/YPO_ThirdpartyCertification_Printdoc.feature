@YPO
Feature: YPO_ThirdPartyCertification Print Documentation  Page UI Test
  This is the description for ThirdPartyCertification Print Documentation Page

  Scenario: LayOutTest For YPO_ThirdPartyCertification Print Documentation Page
     Given I launch YPO Website
     And I login using Valid Credentials of a Renewal user
     When the Renewal user welcome page is displayed
     Then I click on Continue Button in Renewal Welcome page
     When Update Profile Page is Displayed
     Then I click on Save&Confirm Button
     When the Recertification page is Displayed
     Then I click on Continue Button in Recertification Page
     When the ThirdpartyCertification page is Displayed
     Then I select Print documentation
     When ThirdpartyCertification Print Documentation  Page is displayed
     Then ThirdpartyCertification Print Documentation  Page Content Layout is tested  
