@TestProductDetails
Feature: Test product details

  Scenario Outline: test product details Appeared when clicking on specific product
    Given User Navigates to HomePage
    When  User Click On Specific Product "<product>"
    Then  The product's Details Page Must Be Appeared "<product>"

    Examples:
      | product |
      | MacBook |
      | iPhone  |