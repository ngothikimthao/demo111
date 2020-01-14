# new feature
# Tags: optional

Feature: Reset transaction

  Background:
    Given Open Website http://www.way2automation.com/angularjs-protractor/banking/#/customer

  Scenario Outline: Reset transaction successfully
    When I login successfully with as <username>
    When I deposit successfully with amount as <depositamount>
    When I withdrawal successfully with amount as <withdrawalamount>
    When I click transactions tab
    And I click reset button
    Then I verify reset transactions successfully

    Examples:
      | username     | depositamount | withdrawalamount |
      | Harry Potter | 4000          | 2000             |