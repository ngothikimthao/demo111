# new feature
# Tags: optional

Feature: Customer deposit

  Background:
    Given Open Website http://www.way2automation.com/angularjs-protractor/banking/#/customer

  Scenario Outline: Deposit successfully
    When I login successfully with as <username>
    And I click deposit tab
    And I type deposit amount as <amount>
    And I click deposit button
    Then I verify add deposit successfully with amount as <amount>

    Examples:
      | username     | amount |
      | Harry Potter | 2000   |
      | Harry Potter | 2000   |