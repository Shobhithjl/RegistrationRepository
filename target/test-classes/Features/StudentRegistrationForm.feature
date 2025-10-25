Feature:Student Registration Form

Scenario Outline:This testcase automates student registration form

Given User is in Student Registration page
When user enters "<FirstName>","<LastName>", "<Email>" ,"<Gender>"
And clicks on Submit button
Then Registration should be successful and registration details should be displayed in the popup window.

Examples:
|FirstName||LastName||Email||Gender|
|Shobhith||JL||shobith.jl@gmail.com||Male|

