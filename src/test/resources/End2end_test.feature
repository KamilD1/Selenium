Feature: Automate End2end_test
  Description: The purpose of this feature is to test end2end integration
  Scenario: Customer logged into page
    Given User is on home page
    When User click on login button
    And User enter username
    And User write password
    And User click login button
    Then Correct user is log in


