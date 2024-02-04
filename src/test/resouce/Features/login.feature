Feature: Login
@unrequired
Scenario: valid Login
Given when the user launches the application
And the user enters the url
When the user enters credentials
|j2ee|j2ee|
Then should login to the home page
