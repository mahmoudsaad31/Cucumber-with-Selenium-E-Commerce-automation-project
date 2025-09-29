@TestShopingCart
Feature: Test Shopping Cart

  Scenario Outline: User Adds Item To Shopping Cart
    Given  User Navigates to HomePage
    And    User Add Product to cart "<product>"
    Then   Confirmation Message Appears For Adding Product To Cart "<product>"

    Examples:
      | product |
      | MacBook |
      | iPhone  |


  Scenario Outline: User removes Items From Shopping Cart dropDown
    Given User Click on Cart Icon
    When  User Removes Specific Product From Cart "<product>"
    And   User Click on Cart Icon
    Then  Assert Product Removed From Cart Icon "<product>"
    And   User Click on Cart Icon


    Examples:
      | product |
      | iPhone  |
      | MacBook |
