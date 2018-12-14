Feature: Login Functionality of Application

Background:
    Given  Launch the "FireFox" browser and url is loaded
          |http://automationpractice.com/index.php|

Scenario: User should be able to enter valid Email adress

When the homepage is launched verify signin option and verify the create acount header
Then enter the valid email adress in create acount page
                     |rajeshganta87@gmail.com|
Then Click create button and navigate to register page

Then Click on Gender radio button

Then verify personal details of Firstname, Lastname,Email,Password,Date of Birth and Checkboxes
 |Rajesh|Ganta|nandugudboy|
 

 Then verify all your address details
 |rajesh|ganta|KUKATPALLY|202/125/|VIDHYANAGAR|NewYork|Arizona|52287|United States|otheradress|23564555555|9951236788|nandusappartments|
 
 Then Click on Register Button and Verify AccountDisplay
 
 
 
 
            