Feature: User visits google home page

  Scenario: Visit google home page
    Given user wants to search internet
    When user go to https://www.google.com
    Then user should see google home page