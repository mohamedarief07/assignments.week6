Feature: Merge Lead
#Background:
#Given A chrome browser is launched
#And Load LeafTaps URL 'http://leaftaps.com/opentaps/'
#And Maximize the browser
@Regression
Scenario: TC006 Merge Leads Positive flow
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When The login button is clicked
Then Welcome Page is displayed
When 'CRM/SFA' Link is clicked
Then 'My Home' Page is displayed
When 'Leads' Link is clicked
Then 'My Leads' Page is displayed
When 'Merge Leads' Link is clicked
Then 'Merge Leads' Page is displayed
When From Lead Lookup is selected
And Enter First Name 'Mohamed'

When To Lead Lookup is selected
And Enter First Name 'Babu'

When Merge button is clicked
And Alert is accepted
Then 'View Lead' Page is displayed
