#
@LoginTest
Feature: Test Login Feature

  Scenario Outline: Invalidate Login Negative Scenario
    Given User Navigates to HomePage
    When  User Clicks on My Account Icon
    And   User Click on Login
    And   User Enter Email and Password "<email>" "<password>"
    Then  Error message Should be displayed

    Examples:
      | email     | password |
      | aa@aa.com | 012      |
      | abc@e     | iiii     |
      |           |          |
      | a         | a        |
      | 1@$#      | 1@$#     |

  Scenario: Validate Login Positive Scenario
    Given User Navigates to HomePage
    When  User Clicks on My Account Icon
    And   User Click on Login
    And   User Enter Email and Password "ms@ms.com" "123456789"
    Then  Account Page appears