Feature: Insurance Application Single - Quote

@sanityTest
  Scenario: Pet Insurance Dog - Page 1
    Given The User is on Pet Insurance Home Page
    When User enters the following
    |Dog|FirstDog|89109| 
    And User submits the page
    Then Pet Insurance Page 2 is loaded and Quote is displayed

@smokeTest
 Scenario: Pet Insurance Cat - Page 1
    Given The User is on Pet Insurance Home Page
    When User enters the following
    |Cat|FirstCat|90701|
    And User submits the page
    Then Pet Insurance Page 2 is loaded and Quote is displayed
