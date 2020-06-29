Feature: Login HTML Rendering

  Scenario Outline: Rendering Login Page 
  

   *Scenario Name: "AA Login: valid credentials"
    Given <userName> wants to navigate the content of <pageName>
    And User have landed on AA Login Page
    When User enters valid AA username <vun>
    And User enters valid AA password <vp>
    And User clicks on AA Login Button
    And User is on main dashboard page
    When User clicks on the property link
    Then User is on the listed properties page
    And User clicks on a property
    When User clicks on the Scheduling Page tab
    Then Calendar schedule is displayed
    And Scheduled dispatcher calendar is there "Aryana Rezai"
    When User clicks on add dispatcher button and open edit page
    When User toggles the dispatcher list on 
    Then Dispatcher list is displayed
   

    Examples:
    |userName|pageName|vun|vp|
    |QA Tester|AALoginPage|portfoliotestuser@test.com|sz4Z8PQV|
  
   
 

   