@TestSearch
Feature: Test Search

  Scenario Outline: User Search For Any Product and assert searched for desired product
    Given User Navigates to HomePage
    When  User Enter Product in search "<search_text>"
    Then  Assert Search Page Appearance of "<search_text>"

    Examples:
      | search_text |
      | mac         |
      | ipod        |
