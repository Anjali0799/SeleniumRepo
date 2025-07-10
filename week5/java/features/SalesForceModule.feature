Feature: Account Creation in the CRM application

Scenario: Verifying the successful Account creation

	Given the user establishes the environment
    Given the user loads the url 
    When the user enters the username as bhuvanesh.moorthy@testleaf.com
    When the user enters the password as Leaf@2025
    When the user clicks the login button 
    Then the user should be navigated to the welcome page
    When the user clicks the toggle menu button from the left corner
    When the user clicks the View All from the App Launcher
    When the user clicks the Sales from the App Launcher
    When the user clicks the Accounts tab menu
    When the user clicks the New Account button from the Accounts tab
    When the user enters the Account name as Anjali
    When the user select the Public for Ownership
    When the user clicks the save button
    Then the user should be navigate to the Account page
   
   
   


