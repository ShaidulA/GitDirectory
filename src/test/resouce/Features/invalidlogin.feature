Feature: invalid
@required
Scenario Outline: invalid Login
Given when the user launches the application
And the user enters the url
When the user enters "<username>" and "<password>"
Then should login throws error message
Examples:
|username|password|
|j2ee123| j2ee123|
|j2ee133|j2ee134|
|j2ee145|j2ee158|