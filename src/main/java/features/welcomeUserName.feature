# new feature
# Tags: optional

Feature: Welcome user name

  Scenario: Welcome user name
    Given I Open welcome user name page https://www.way2automation.com/angularjs-protractor/banking/#/login
    Then I verify ready login page
    When I click account number
    Then I verify account number is correct
  
    Scenario Outline: Welcome user name
      Given I Open welcome user name page <website>
      Then I verify ready login page
      When I click account number
      Then I verify account number is correct <accountNumber>
      Examples:
        |website                                                             |accountNumber|
        |https://www.way2automation.com/angularjs-protractor/banking/#/login |   1004      |