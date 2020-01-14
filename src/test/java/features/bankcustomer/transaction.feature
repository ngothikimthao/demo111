# new feature
# Tags: optional

Feature: Customer transaction

  Background:
    Given Open Website http://www.way2automation.com/angularjs-protractor/banking/#/customer

  Scenario Outline: Customer transaction successfully
    When I login successfully with as <username>
    When I deposit successfully with amount as <depositamount>
    When I withdrawal successfully with amount as <withdrawalamount>
    And I click transactions tab
    Then I verify transactions successfully with deposit amount as <depositamount> and withdrawal amount as <withdrawalamount>

    Examples:
      | username     | depositamount | withdrawalamount |
      | Harry Potter | 4000          | 2000             |