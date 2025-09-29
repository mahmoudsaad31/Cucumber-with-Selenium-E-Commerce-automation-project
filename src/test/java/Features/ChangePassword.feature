@TestChangePassword
Feature: Test Change Password Functionality

  Scenario: User Change password to a new one then gets his old password again
    Given   user should be loged in with credentials "ms@ms.com" "123456789"
    When    User Clicks on My Account Icon
    And     User Click on My Account Info
    And     User Navigate to Change your password page
    And     User Enters New Password "abcdef" and press continue
    Then    Updating Password successfully message appears
    And     User Navigate to Change your password page
    And     User Enters New Password "123456789" and press continue
    Then    Updating Password successfully message appears