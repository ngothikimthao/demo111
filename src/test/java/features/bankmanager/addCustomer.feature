Feature: Add customer

  Background:
    Given Open Website https://www.way2automation.com/angularjs-protractor/banking/#/manager

  Scenario Outline: Add customer successfully
    When I click add customer tab
    And I input first name as <firstname>, last name as <lastname> and post code as <postcode>
    And I click submit
    Then I verify that system is already added customer as <fullname> successfully

    Examples:
      | firstname | lastname | postcode | fullname |
      | thao      | ngo      | 550000   | thao ngo |
      | vi        | hoang    | 550000   | vi hoang |

  Scenario Outline: Add customer unsuccessfully
    When I click add customer tab
    And I input first name as <firstname>, last name as <lastname> and post code as <postcode>
    And I click submit
    Then I verify that system is already added customer as <fullname> unsuccessfully

    Examples:
      | firstname | lastname | postcode | fullname |
      | thao      |          | 550000   | thao ngo |
      |           | hoang    | 550000   | vi hoang |

