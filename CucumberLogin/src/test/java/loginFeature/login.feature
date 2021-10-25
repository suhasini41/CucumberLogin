Feature: Login 
Scenario Outline: Successful login
Given the user in on login page with title "Login Page"
When the user enters <username> and <password>
And clicks on Login button
Then validate login successfull only with username "LearnSelenium" and password "LearnSelenium"
Examples:
|username|password|
|"LearnSelenium"|""|
|""|"LearnSelenium"|
|"LearnSelenium"|"Learn"|
|"test123"|"LearnSelenium"|
|""|""|
|"LearnSelenium"|"LearnSelenium"|



