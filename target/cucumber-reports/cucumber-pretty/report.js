$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/features/welcomeUserName.feature");
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
  "name": "Welcome user name",
  "description": "",
  "id": "welcome-user-name",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "Welcome user name",
  "description": "",
  "id": "welcome-user-name;welcome-user-name",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I Open welcome user name page https://www.way2automation.com/angularjs-protractor/banking/#/login",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I verify ready login page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I click account number",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I verify account number is correct",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.way2automation.com/angularjs-protractor/banking/#/login",
      "offset": 30
    }
  ],
  "location": "welcomeUserNameTest.Open_banking_website(String)"
});
formatter.result({
  "duration": 8841425000,
  "status": "passed"
});
formatter.match({
  "location": "welcomeUserNameTest.verify_ready_login_page()"
});
formatter.result({
  "duration": 22207716400,
  "status": "passed"
});
formatter.match({
  "location": "welcomeUserNameTest.click_account_number()"
});
formatter.result({
  "duration": 6248019800,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenarioOutline({
  "line": 12,
  "name": "Welcome user name",
  "description": "",
  "id": "welcome-user-name;welcome-user-name",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 13,
  "name": "I Open welcome user name page \u003cwebsite\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "I verify ready login page",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I click account number",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I verify account number is correct \u003caccountNumber\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": "welcome-user-name;welcome-user-name;",
  "rows": [
    {
      "cells": [
        "website",
        "accountNumber"
      ],
      "line": 18,
      "id": "welcome-user-name;welcome-user-name;;1"
    },
    {
      "cells": [
        "https://www.way2automation.com/angularjs-protractor/banking/#/login",
        "1004"
      ],
      "line": 19,
      "id": "welcome-user-name;welcome-user-name;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 19,
  "name": "Welcome user name",
  "description": "",
  "id": "welcome-user-name;welcome-user-name;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 13,
  "name": "I Open welcome user name page https://www.way2automation.com/angularjs-protractor/banking/#/login",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "I verify ready login page",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I click account number",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I verify account number is correct 1004",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.way2automation.com/angularjs-protractor/banking/#/login",
      "offset": 30
    }
  ],
  "location": "welcomeUserNameTest.Open_banking_website(String)"
});
formatter.result({
  "duration": 6037892900,
  "status": "passed"
});
formatter.match({
  "location": "welcomeUserNameTest.verify_ready_login_page()"
});
formatter.result({
  "duration": 21694157300,
  "status": "passed"
});
formatter.match({
  "location": "welcomeUserNameTest.click_account_number()"
});
formatter.result({
  "duration": 6239940100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1004",
      "offset": 35
    }
  ],
  "location": "welcomeUserNameTest.verify_account_number_correct(String)"
});
formatter.result({
  "duration": 6150584400,
  "status": "passed"
});
});