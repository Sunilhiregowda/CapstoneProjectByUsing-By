Feature: Validate menus and count links
Scenario Outline: Validate menus and count links
Given Open browser and navigate to url
When I enter the email as <email> and password as <password> and login
And count number of links and navigate to each page
Then logout
Then close browser

Examples:
|email|password|
|Anilhiregowda@gmail.com|Anilhiregowda@26|
 