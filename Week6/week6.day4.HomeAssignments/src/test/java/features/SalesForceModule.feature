Feature: Account creation in the CRM application 
   
#Background:
#   Given the user establishes the environment
#   And the user loads the url


Scenario: Verifying the successful Account creation

    
    When the user enters the username as 'vidyar@testleaf.com'
    And the user enters the password as 'Sales@123'
    And the user clicks the login button 
    When  the user clicks the App Launcher icon
    And the user clicks the viewall link
    And the user clicks the Sales link
    When the user clicks the Account tab menu
    And the user search the account search box as Anjali
    And the user clicks the first matching name
    And the user clicks the Edit option 
    When the user set type as Technology Partner
    And the user set Industry as Healthcare
    And the user enters the Billing Address as 'TestLeaf chennai'
    And the user enters the Shipping Address as 'TestLeaf chennai'
    And the user set customerpriority as low
    And the user set SLA as Silver
    And the user set Active as NO
    And the user enters the unique number in the Phno as 99807
    And the user set Upsell Opportunity as No
    Then the user clicks Save
    And user should Verify the Phno
