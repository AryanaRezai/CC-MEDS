Feature: Login HTML Rendering

  Scenario Outline: Rendering Login Page 
  

   *Scenario Name: "AA: Add Dispatcher"
    Given <userName> wants to navigate the content of <pageName>
     And User have landed on AA Login Page
    When User enters valid AA username <vun>
    And User enters valid AA password <vp>
    And User clicks on AA Login Button
    And User is on main dashboard page
    When User clicks on the property link
    Then User is on the listed properties page
    And User clicks on a property
    Then Four navigation tabs are displayed
    When User clicks on the Dispatch Lists tab
    Then The Dispatcher table is displayed 
    When User clicks on the add Dispatcher
    Then An Edit window opens
    Then User enters dispatcher name <dispatchername>
    And User selects a dispatcher type
    And User enters dispatcher date
    And User enters dispatcher day
    And User enters dispatcher time
    And User selects a dispatcher color
    And User selects a technician
    And User submits dispatcher
    And User makes sure that submitted dispatcher is in the list

   

    Examples:
    |userName|pageName|vun|vp|dispatchername|
    |QA Tester|AALoginPage|portfoliotestuser@test.com|sz4Z8PQV|Aryana Rezai|
  
   
 

   