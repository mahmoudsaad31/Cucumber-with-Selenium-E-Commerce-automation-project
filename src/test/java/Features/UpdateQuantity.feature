@TestUpdateQuantity
Feature: Test update quantity in Shopping Cart

  Scenario Outline: User Adds Item To Shopping Cart
    Given  User Navigates to HomePage
    And    User Add Product to cart "<product>"
    Then   Confirmation Message Appears For Adding Product To Cart "<product>"

    Examples:
      | product |
      | MacBook |
      | iPhone  |

  Scenario Outline: updating product quantities in shopping cart page
    Given User Click on Cart Icon
    When  User Click On View Cart To Navigate To Shopping Cart Page
    And   User Change The Quantity of the product "<product>" "<quantity>"
    And   User Click on Update Icon for product "<product>"
    Then  The Quantity of the product Must Be Changed

    Examples:
      | product | quantity |
      | MacBook | 3        |
      | iPhone  | 5        |

  Scenario: User removes Items From Shopping Cart page
    Given User Click on Cart Icon
    When  User Click On View Cart To Navigate To Shopping Cart Page
    When  User Removes Specific Product From Shopping Cart Page "iPhone"
    Then  Assert Product Removed From Shopping Cart Page "iPhone"
    And   User Click on Cart Icon

