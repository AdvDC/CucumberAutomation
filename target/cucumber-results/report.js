$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Insurance Application Single - Quote",
  "description": "",
  "id": "insurance-application-single---quote",
  "keyword": "Feature"
});
formatter.before({
  "duration": 272886,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Pet Insurance Dog - Page 1",
  "description": "",
  "id": "insurance-application-single---quote;pet-insurance-dog---page-1",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@sanityTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "The User is on Pet Insurance Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters the following",
  "rows": [
    {
      "cells": [
        "Dog",
        "FirstDog",
        "89109"
      ],
      "line": 7
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User submits the page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Pet Insurance Page 2 is loaded and Quote is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.login()"
});
formatter.result({
  "duration": 38692425048,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.enterFollowingDetails(DataTable)"
});
formatter.result({
  "duration": 374340953,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.submitPage1()"
});
formatter.result({
  "duration": 271691599,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.verifyPage2Quote()"
});
formatter.result({
  "duration": 10498128132,
  "status": "passed"
});
formatter.before({
  "duration": 115312,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Pet Insurance Cat - Page 1",
  "description": "",
  "id": "insurance-application-single---quote;pet-insurance-cat---page-1",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "The User is on Pet Insurance Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "User enters the following",
  "rows": [
    {
      "cells": [
        "Cat",
        "FirstCat",
        "90701"
      ],
      "line": 15
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "User submits the page",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Pet Insurance Page 2 is loaded and Quote is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.login()"
});
formatter.result({
  "duration": 20124637837,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.enterFollowingDetails(DataTable)"
});
formatter.result({
  "duration": 502807651,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.submitPage1()"
});
formatter.result({
  "duration": 265505169,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.verifyPage2Quote()"
});
formatter.result({
  "duration": 10386556844,
  "status": "passed"
});
formatter.after({
  "duration": 232436,
  "status": "passed"
});
});