Feature: Homepage display and verifying active links and  checkboxes present in the Dressespage in application.
Scenario: This scenario is to validate whether all the links are active and checkboxes present.
    Given Firefox browser is launched and url is loaded
    |http://automationpractice.com/index.php|
   # When the Women menu and the submenu of it is clicked and opened
   # Then Verify no.of active links present in the Dresses page of application
 
 Scenario: Verify no.of checkboxes are checked in the submenu of Dresses page.
  Given Dresses page is dispalyed with all the options
 # When  in catogeries click on Casual Dreses, Evening Dresses,Summer Dresses checkboxes
 # Then Verify checkboxes are clicked or not in the catogories list