@TestForgottenPassword
Feature: Test Forget password Feature

  Scenario: Check Forgotten Password Functionality Positive Scenario
    Given User Navigates to HomePage
    When  User Clicks on My Account Icon
    And   User Click on Login
    And   User Click On Forgotten Password Button
    And   User Enters Valid Email "h@h.c"
    Then  Assert confirmation link has been sent email