Feature: Login HTML Rendering

  Scenario Outline: Rendering Login Page 
  

   *Scenario Name: "MEDS Login: valid credentials"
    Given <userName> wants to navigate the content of <pageName>
    And User have landed on MEDS Login Page
    When User enters valid MEDS username <vun>
    And User enters valid MEDS password <vp>
    And User clicks on MEDS Login Button
   

    Examples:
    |userName|pageName|vun|vp|
    |QA Tester|MEDSLoginPage|aryana.rezai@realpage.com|levelone|

   
 

   