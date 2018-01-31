@YPO
Feature: YPO Update profile UI Test
  This is the description for Update Profile Page

Scenario: LayOutTest For YPO Update Page Content
    Given I launch YPO Website
    And I login using Valid Credentials
    When the welcome page is displayed
    Then I click on Continue Button
    When Update Profile Page is Displayed
    Then Update Profile Page Content Layout is tested 
