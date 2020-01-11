Feature: Customer Login
Background:
    Given I Open banking website http://www.way2automation.com/angularjs-protractor/banking/#/login
  Scenario: Customer Login

    When I click Customer Login button
    When I click user select
    When I chose the user name
    Then I verify login successfully
    When I click login button
    Then I verify logout successfully
    When I click logout button


  Scenario Outline: Customer Login
    Given I Open banking website <website>
    When I click Customer Login button
    When I click user select
    When I chose the user name
    Then I verify login successfully
    When I click login button
    Then I verify logout successfully
    When I click logout button


    Examples:
      | website                                                            |
      | http://www.way2automation.com/angularjs-protractor/banking/#/login |