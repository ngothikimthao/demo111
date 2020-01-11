# new feature
# Tags: optional

Feature: Manage customer
  Background:
    Given Open Website https://www.way2automation.com/angularjs-protractor/banking/#/manager

  Scenario Outline: Manage customer
    When I click customer tab
    And I click delete button with first name as <firstname>, last name as <lastname>, post code as <postcode> and account number as <accountnumber>
    Then I verify customer delete successfully with first name as <firstname>, last name as <lastname>, post code as <postcode> and account number as <accountnumber>

    Examples:
      | firstname | lastname | postcode | accountnumber |
      | Harry     | Potter   | E725JB   | 1004          |
