@YPO
Feature: YPO Grace Page UI Test
  This is the description for GracePage

  Scenario: LayOutTest For YPO Grace Page 
  	 Given I launch YPO Website
     And I login using Valid Credentials of a Renewal user
     When the Renewal user welcome page is displayed
     When we go to Grace page 
     Then Grace Page Content Layout is tested 