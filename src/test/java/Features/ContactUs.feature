@TestContactUs
Feature: Test Contact Us Page

  Scenario: Verify user can access Contact Us page and Complete his information
    Given User Navigates to HomePage
    When  User Click on Telephone Icon
    Then  You must be in Contact Us page
    When  User fill the required information "mahmoud" , "ms@ms.com" , "test automation" and click submit
    Then  The enquiry must be successfully sent to the store owner