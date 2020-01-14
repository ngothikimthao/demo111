# new feature
# Tags: optional

Feature: Search customer

  Background:
    Given Open Website https://www.way2automation.com/angularjs-protractor/banking/#/login

  Scenario Outline: Search customer successfully
    When I login bank manager successfully
    When I click customer tab
    And I input key search as <keysearch>
    Then I verify that system is already showed customer has <keysearch>

    Examples:
      | keysearch |
      | P         |
      | v         |
      | i         |