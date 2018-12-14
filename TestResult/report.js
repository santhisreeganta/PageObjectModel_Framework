$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/Automation.feature");
formatter.feature({
  "line": 1,
  "name": "Login Functionality of Application",
  "description": "",
  "id": "login-functionality-of-application",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Launch the \"FireFox\" browser and url is loaded",
  "rows": [
    {
      "cells": [
        "http://automationpractice.com/index.php"
      ],
      "line": 5
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "FireFox",
      "offset": 12
    }
  ],
  "location": "stepDefinition.launch_the_firefox_browser_and_is_loaded(String,DataTable)"
});
formatter.result({
  "duration": 19365363151,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "User should be able to enter valid Email adress",
  "description": "",
  "id": "login-functionality-of-application;user-should-be-able-to-enter-valid-email-adress",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "the homepage is launched verify signin option and verify the create acount header",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "enter the valid email adress in create acount page",
  "rows": [
    {
      "cells": [
        "rajeshganta87@gmail.com"
      ],
      "line": 11
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Click create button and navigate to register page",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Click on Gender radio button",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "verify personal details of Firstname, Lastname,Email,Password,Date of Birth and Checkboxes",
  "rows": [
    {
      "cells": [
        "Rajesh",
        "Ganta",
        "nandugudboy"
      ],
      "line": 17
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "verify all your address details",
  "rows": [
    {
      "cells": [
        "rajesh",
        "ganta",
        "KUKATPALLY",
        "202/125/",
        "VIDHYANAGAR",
        "NewYork",
        "Arizona",
        "52287",
        "United States",
        "otheradress",
        "23564555555",
        "9951236788",
        "nandusappartments"
      ],
      "line": 21
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Click on Register Button and Verify AccountDisplay",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.the_homepage_is_launched_verify_signin_option_and_verify_the_create_acount_header()"
});
formatter.result({
  "duration": 14133501884,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.enter_the_valid_email_adress_in_create_acount_page(DataTable)"
});
formatter.result({
  "duration": 811402546,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.click_create_button()"
});
formatter.result({
  "duration": 1097642887,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.Gender_display()"
});
formatter.result({
  "duration": 2011833812,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.Enterpersonal(DataTable)"
});
formatter.result({
  "duration": 4377609272,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.addressDetails(DataTable)"
});
formatter.result({
  "duration": 25803995678,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.ClickRegister()"
});
formatter.result({
  "duration": 2622306555,
  "status": "passed"
});
});