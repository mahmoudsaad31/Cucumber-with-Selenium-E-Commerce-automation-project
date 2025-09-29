Feature: Test Logout

  Scenario: user Logout
    Given   User Navigates to HomePage
    When    User Clicks on My Account Icon
    And     User Clicks on Logout
    Then    Account Logout Page Appears
