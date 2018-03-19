Feature: Insurance Application - Multi Pet Quote
		@RegressionTest
    Scenario Outline: Pet Insurance Cat - Page 1
    Given The User is on Pet Insurance Home Page
    When User enters <pettype> <petname> <zipcode>
    And User submits the page
    Then Pet Insurance Page 2 is loaded and Quote is displayed
    
    Examples:
    |pettype|petname|zipcode|
    |Dog|SecondDog|89109|
    |Cat|SecondCat|89109|
    