# new feature
# Tags: optional

Feature: Customer withdrawal

  Background:
    Given Open Website http://www.way2automation.com/angularjs-protractor/banking/#/customer

  Scenario Outline: Customer withdrawal successfully
    When I login successfully with as <username>
    When I deposit successfully with amount as <depositamount>
    And I click withdrawal tab
    And I type withdrawal amount as <amount>
    And I click withdraw button
    Then I verify withdrawal successfully with amount as <amount>

    Examples:
      | username     | amount | depositamount |
      | Harry Potter | 2000   | 4000          |
