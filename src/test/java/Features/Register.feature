@RegisterTest
Feature: Test Register Feature

  Scenario Outline: Invalidate Registry Negative Scenario
    Given User Navigates to HomePage
    When  User Clicks on My Account Icon
    And   User Click on Register
    And   User Enters Credentials "<Fname>" , "<Lname>" ,"<mail>" , "<phone>" ,"<password>"
    Then  Unsuccessfull Registry Message appears

    Examples:
      | Fname | Lname | mail  | phone | password |
      |       |       |       |       |          |
      | a     | a     | a@a.a | 1     | 1111     |
      | b     | b     | b@b.b | 123   | 2        |


  Scenario:Validate Registry Positive Scenario
    Given User Navigates to HomePage
    When  User Clicks on My Account Icon
    And   User Click on Register
    When  User Enters Credentials with random email "mahmoud" , "saad" , "012345" , "123456789"
    Then  Successfully Creation should be displayed
