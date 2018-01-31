@YPO
Feature: YPO WelcomePage UI Test
  This is the description for Welcome Page Header

 Scenario: LayOutTest For YPO Welcome Page Content
    Given I launch YPO Website
    And I login using Valid Credentials
    When the welcome page is displayed
    Then Welcome Page Content Layout is tested 
