@TestCompareList
Feature: Test Compare List

  Scenario Outline: User add Item to CompareList
    Given User Navigates to HomePage
    And   User Add Product to Compare List "<product>"
    Then  Confirmation Message Appears for adding product to compare list "<product>"

    Examples:
      | product |
      | MacBook |
      | iPhone  |
