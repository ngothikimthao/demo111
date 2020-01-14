# new feature
# Tags: optional

Feature: Bank customer login

  Background:
    Given Open Website http://www.way2automation.com/angularjs-protractor/banking/#/customer

  Scenario Outline: Bank customer login successfully
    When I click username as <username>
    And I click customer login button
    Then I verify that customer login successfully with name as <username>

    Examples:
      | username     |
      | Harry Potter |