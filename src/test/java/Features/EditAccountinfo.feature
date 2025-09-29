@TestEditAccountInfo

Feature:Test Editing Account Information

  Scenario: Test change Account Info and then return it back
    Given   user should be loged in with credentials "ms@ms.com" "123456789"
    When    User Clicks on My Account Icon
    And     User Click on My Account Info
    And     User Navigate to Edit account information page
    And     User Change Credentials to "yousef" , "anwer" , "01234567" and press Continue button
    Then    Account Edition Message Appears
    And     User Navigate to Edit account information page
    And     User Change Credentials to "mahmoud" , "saad" , "01234567" and press Continue button
    Then    Account Edition Message Appears