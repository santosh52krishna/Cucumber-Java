@YPO
Feature: YPO ThirdpartyCertification Page UI Test
  This is the description for ThirdpartyCertification Page

  Scenario: LayOutTest For YPO ThirdpartyCertifiaction Page 
  	 Given I launch YPO Website
     And I login using Valid Credentials of a Renewal user
     When the Renewal user welcome page is displayed
     Then I click on Continue Button in Renewal Welcome page
     When Update Profile Page is Displayed
     Then I click on Save&Confirm Button
     When the Recertification page is Displayed
     Then I click on Continue Button in Recertification Page
     When the ThirdpartyCertification page is Displayed
     Then ThirdpartyCertification Page Content Layout is tested 
