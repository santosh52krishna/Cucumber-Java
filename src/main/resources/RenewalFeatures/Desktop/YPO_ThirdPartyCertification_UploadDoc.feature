@YPO
Feature: YPO_ThirdPartyCertification Upload documents  Page UI Test
  This is the description for ThirdPartyCertification Upload documents Page

  Scenario: LayOutTest For YPO ThirdpartyCertifiaction Upload documents Page 
     Given I launch YPO Website
     And I login using Valid Credentials of a Renewal user
     When the Renewal user welcome page is displayed
     Then I click on Continue Button in Renewal Welcome page
     When Update Profile Page is Displayed
     Then I click on Save&Confirm Button
     When the Recertification page is Displayed
     Then I click on Continue Button in Recertification Page
     When the ThirdpartyCertification page is Displayed
     Then I select Upload Documents
     Then I click on Pencil Icon in Upload documents Page
     When ThirdpartyCertification Upload documents Page is displayed
     Then ThirdpartyCertification Upload documents Page Content Layout is tested  
