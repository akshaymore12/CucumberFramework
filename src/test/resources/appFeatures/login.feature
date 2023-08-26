Feature: login in the application
Scenario: login in to the application
Given user is at login page
When user enter the username
And user enter the password
And user click on the login button
Then home page should get displayed
