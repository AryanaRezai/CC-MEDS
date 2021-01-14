$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/com/realpage/components/MEDSLogin/medslogin.feature");
formatter.feature({
  "line": 1,
  "name": "Login HTML Rendering",
  "description": "",
  "id": "login-html-rendering",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8953084900,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Rendering Login Page",
  "description": "",
  "id": "login-html-rendering;rendering-login-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "QA Tester wants to navigate the content of MEDSLoginPage",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User have landed on MEDS Login Page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User enters valid MEDS username aryana.rezai@realpage.com",
  "matchedColumns": [
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User enters valid MEDS password levelone",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User clicks on MEDS Login Button",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "QA Tester",
      "offset": 0
    },
    {
      "val": "MEDSLoginPage",
      "offset": 43
    }
  ],
  "location": "CucumberStepDefinitions.open_site(String,String)"
});
formatter.result({
  "duration": 1510849300,
  "status": "passed"
});
formatter.match({
  "location": "MEDSLoginStepDefinitions.User_have_landed_on_MEDS_Login_Page()"
});
formatter.result({
  "duration": 142618800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "aryana.rezai@realpage.com",
      "offset": 32
    }
  ],
  "location": "MEDSLoginStepDefinitions.User_enters_valid_MEDS_username(String)"
});
formatter.result({
  "duration": 952036700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "levelone",
      "offset": 32
    }
  ],
  "location": "MEDSLoginStepDefinitions.User_enters_valid_MEDS_password(String)"
});
formatter.result({
  "duration": 178871800,
  "status": "passed"
});
formatter.match({
  "location": "MEDSLoginStepDefinitions.User_clicks_on_MEDS_Login_Button()"
});
formatter.result({
  "duration": 1417988400,
  "status": "passed"
});
formatter.after({
  "duration": 3471622400,
  "status": "passed"
});
});