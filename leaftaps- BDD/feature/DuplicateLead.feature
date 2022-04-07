Feature: Duplicate Lead
#Background:
#Given A chrome browser is launched
#And Load LeafTaps URL 'http://leaftaps.com/opentaps/'
#And Maximize the browser

Scenario: TC004 Duplicate Lead Positive flow
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When The login button is clicked
Then Welcome Page is displayed
When 'CRM/SFA' Link is clicked
Then 'My Home' Page is displayed
When 'Leads' Link is clicked
Then 'My Leads' Page is displayed

When 'Find Leads' Link is clicked
Then 'Find Leads' Page is displayed

And Phone tab is clicked
And Enter the Phone Number as '9'
When Find Leads Button is Clicked
Then 'Lead List' List is displayed
When Click First Lead Link
Then 'View Lead' Page is displayed
When 'Duplicate Lead' Link is clicked
Then 'Duplicate Lead' Page is displayed
When Create Lead Button is Clicked
Then 'View Lead' Page is displayed

