$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/bankmanager/searchCustomer.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# new feature"
    },
    {
      "line": 2,
      "value": "# Tags: optional"
    }
  ],
  "line": 4,
  "name": "Search customer",
  "description": "",
  "id": "search-customer",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 9,
  "name": "Search customer successfully",
  "description": "",
  "id": "search-customer;search-customer-successfully",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "I login bank manager successfully",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I click customer tab",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I input key search as \u003ckeysearch\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I verify that system is already showed customer has \u003ckeysearch\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "search-customer;search-customer-successfully;",
  "rows": [
    {
      "cells": [
        "keysearch"
      ],
      "line": 16,
      "id": "search-customer;search-customer-successfully;;1"
    },
    {
      "cells": [
        "P"
      ],
      "line": 17,
      "id": "search-customer;search-customer-successfully;;2"
    },
    {
      "cells": [
        "v"
      ],
      "line": 18,
      "id": "search-customer;search-customer-successfully;;3"
    },
    {
      "cells": [
        "i"
      ],
      "line": 19,
      "id": "search-customer;search-customer-successfully;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "Open Website https://www.way2automation.com/angularjs-protractor/banking/#/login",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.way2automation.com/angularjs-protractor/banking/#/login",
      "offset": 13
    }
  ],
  "location": "CommonTest.user_already_on_home_page(String)"
});
formatter.result({
  "duration": 6804697500,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Search customer successfully",
  "description": "",
  "id": "search-customer;search-customer-successfully;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "I login bank manager successfully",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I click customer tab",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I input key search as P",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I verify that system is already showed customer has P",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "CommonTest.loginBankManagerSuccessfully()"
});
formatter.result({
  "duration": 6131937000,
  "status": "passed"
});
formatter.match({
  "location": "CommonTest.clickCustomerTab()"
});
formatter.result({
  "duration": 3119362100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "P",
      "offset": 22
    }
  ],
  "location": "SearchCustomerTest.setKeySearch(String)"
});
formatter.result({
  "duration": 3301816500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "P",
      "offset": 52
    }
  ],
  "location": "SearchCustomerTest.verifySearchCustomerSuccessfully(String)"
});
formatter.result({
  "duration": 2203396800,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "Open Website https://www.way2automation.com/angularjs-protractor/banking/#/login",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.way2automation.com/angularjs-protractor/banking/#/login",
      "offset": 13
    }
  ],
  "location": "CommonTest.user_already_on_home_page(String)"
});
formatter.result({
  "duration": 1070982200,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Search customer successfully",
  "description": "",
  "id": "search-customer;search-customer-successfully;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "I login bank manager successfully",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I click customer tab",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I input key search as v",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I verify that system is already showed customer has v",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "CommonTest.loginBankManagerSuccessfully()"
});
formatter.result({
  "duration": 6137006800,
  "status": "passed"
});
formatter.match({
  "location": "CommonTest.clickCustomerTab()"
});
formatter.result({
  "duration": 3143182000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "v",
      "offset": 22
    }
  ],
  "location": "SearchCustomerTest.setKeySearch(String)"
});
formatter.result({
  "duration": 3231360400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "v",
      "offset": 52
    }
  ],
  "location": "SearchCustomerTest.verifySearchCustomerSuccessfully(String)"
});
formatter.result({
  "duration": 2195835800,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "Open Website https://www.way2automation.com/angularjs-protractor/banking/#/login",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.way2automation.com/angularjs-protractor/banking/#/login",
      "offset": 13
    }
  ],
  "location": "CommonTest.user_already_on_home_page(String)"
});
formatter.result({
  "duration": 1056371600,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Search customer successfully",
  "description": "",
  "id": "search-customer;search-customer-successfully;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "I login bank manager successfully",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I click customer tab",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I input key search as i",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I verify that system is already showed customer has i",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "CommonTest.loginBankManagerSuccessfully()"
});
formatter.result({
  "duration": 6144617700,
  "status": "passed"
});
formatter.match({
  "location": "CommonTest.clickCustomerTab()"
});
formatter.result({
  "duration": 3162362500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "i",
      "offset": 22
    }
  ],
  "location": "SearchCustomerTest.setKeySearch(String)"
});
formatter.result({
  "duration": 3248449600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "i",
      "offset": 52
    }
  ],
  "location": "SearchCustomerTest.verifySearchCustomerSuccessfully(String)"
});
formatter.result({
  "duration": 2453407200,
  "status": "passed"
});
});