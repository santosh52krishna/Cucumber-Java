@YPO
Feature: YPO ChooseaNetwork Page UI Test
  This is the description for ChooseaNetwok Page

  Scenario: LayOutTest For YPO ChooseaNetwork page Content
    Given I launch YPO Website
    And I login using Valid Credentials
    When the welcome page is displayed
    Then I click on Continue Button
    When Update Profile Page is Displayed
    Then I click on Save&Confirm Button
    When the ChooseaNetwork Page is displayed
    Then the ChooseaNetwork Page content Layout is tested 

 
		