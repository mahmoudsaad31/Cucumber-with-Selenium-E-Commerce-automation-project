@TestchangeCurrency
Feature: Change Currency

  Scenario Outline: test User Switch Currencies
    Given User Navigates to HomePage
    When  User click on currency icon
    When  User Change Currency to "<currency>"
    Then  assert currency Changed Successfully to desired currency "<label>"

    Examples:
      | currency | label |
      | EUR      | €     |
      | GBP      | £     |
      | USD      | $     |

