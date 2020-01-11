# new feature
# Tags: optional

Feature: Login into bank management

  Scenario: Login into bank management successfully
    Given Open Website https://www.way2automation.com/angularjs-protractor/banking/#/login
    When I click bank manager login
    Then I verify login into bank management successfully

