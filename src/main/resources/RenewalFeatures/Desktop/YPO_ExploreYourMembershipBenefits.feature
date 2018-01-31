@YPO
Feature: YPO_ExploreYourMembershipBenefits Page UI Test
  This is the description for GoldTransitionOption Page 

  Scenario: LayOutTest For ExploreYourMembershipBenefits Page
    Given I launch YPO Website
    And I login using Valid Credentials of a Renewal user
    When we go to ExploreYourMembershipBenefits Page 
    Then ExploreYourMembershipBenefits Page Content Layout is tested
    