Feature: Login HTML Rendering

  Scenario Outline: Rendering Main Dashboard Page 
  

   *Scenario Name: "AA Main Dashboard: valid credentials"
    Given <userName> wants to navigate the content of <pageName>
    And User have landed on AA Login Page
    When User enters valid AA username <vun>
    And User enters valid AA password <vp>
    And User clicks on AA Login Button
    When User is on main dashboard page
    Then User sees search filters
    And Total number of calls
    And Number of Captured calls 
    And Number of Missed calls
    And Number of Call Monitor Compliance
    And Number of Average Response Time
    And A message breakdown table
    And A list with Call types and their detailed information
   

    Examples:
    |userName|pageName|vun|vp|
    |QA Tester|AALoginPage|portfoliotestuser@test.com|sz4Z8PQV|
  
   
 

   