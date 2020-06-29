Feature: Login HTML Rendering

  Scenario Outline: Rendering Login Page 
  

   *Scenario Name: "AA Login: valid credentials"
    Given <userName> wants to navigate the content of <pageName>
    And User have landed on AA Login Page
    When User enters valid AA username <vun>
    And User enters valid AA password <vp>
    And User clicks on AA Login Button
   

    Examples:
    |userName|pageName|vun|vp|
    |QA Tester|AALoginPage|portfoliotestuser@test.com|sz4Z8PQV|
    |QA Tester|AALoginPage|propertytestuser@test.com|Lkdo2TuF|
   
 

   