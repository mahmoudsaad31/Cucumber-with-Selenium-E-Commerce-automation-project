@TestWishList
Feature: Test Adding items to Wish List

  Scenario: : User sould be loged in
    Given user should be loged in with credentials "ms@ms.com" "123456789"
    Then  User Navigates to HomePage

  Scenario Outline: user add four item to wish list
    When   user add product to wish list '<products>'
    Then  Confirmation Message Appears for adding product to wish list '<products>'

    Examples:
      | products         |
      | MacBook          |
      | iPhone           |
      | Apple Cinema 30" |
      | Canon EOS 5D     |