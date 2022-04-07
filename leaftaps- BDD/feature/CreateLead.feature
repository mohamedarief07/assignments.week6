Feature: Create Lead
#Background:
#Given A chrome browser is launched
#And Load LeafTaps URL 'http://leaftaps.com/opentaps/'
#And Maximize the browser

@sanity
Scenario Outline: TC002 Create Lead Positive flow
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When The login button is clicked
Then Welcome Page is displayed
When 'CRM/SFA' Link is clicked
Then 'My Home' Page is displayed
When 'Leads' Link is clicked
Then 'My Leads' Page is displayed

When 'Create Lead' Link is clicked
Then 'Create Lead' Page is displayed

And Enter CompanyName as <CompanyName>
When FirstName as <FirstName> 
When LastName as <LastName>
When Create Lead Button is Clicked
Then 'View Lead' Page is displayed

Examples:
|CompanyName|FirstName|LastName|
|'BDD'|'Nelson'|'Mandela'|
|'POM'|'Shane'|'Warne'|

