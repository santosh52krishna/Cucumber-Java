@YPO
Feature: YPO ThirdpartyCertification_Continued_Emial Page UI Test
  This is the description for ThirdpartyCertification Page

  Scenario: LayOutTest For YPO ThirdpartyCertifiaction_Continued_Email Page 
     Given I launch YPO Website
     And I login using Valid Credentials of a Renewal user
     When the Renewal user welcome page is displayed
     Then I click on Continue Button in Renewal Welcome page
     When Update Profile Page is Displayed
     Then I click on Save&Confirm Button
     When the Recertification page is Displayed
     Then I click on Continue Button in Recertification Page
     When the ThirdpartyCertification page is Displayed
     Then I select Email Criteria To a Verifier
     Then I click on Pencil Icon in Email Criteria Page
     When ThirdpartyCertification Continued_Emial Page is displayed
     Then ThirdpartyCertification Continued_Emial Page Content Layout is tested 