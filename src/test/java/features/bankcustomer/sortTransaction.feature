# new feature
# Tags: optional

Feature: Sort transaction

  Background:
    Given Open Website http://www.way2automation.com/angularjs-protractor/banking/#/customer

  Scenario Outline: Sort transaction successfully
    When I login successfully with as <username>
    When I deposit successfully with amount as <depositamount>
    When I withdrawal successfully with amount as <withdrawalamount>
    And I click transactions tab
    And I click date time sort
    Then I verify sort transactions successfully

    Examples:
      | username     | depositamount | withdrawalamount |
      | Harry Potter | 4000          | 2000             |

