
Feature: I am automating HRM Application
Background: Common re_usable steps

Given user launch browser
Then user enter url as "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"


Scenario: TC_002_Addskils Record-creating skils record

And user enter username as "Admin" and password as "admin123" and clicks login as button
Then user go to skils page
Then user enters skils name as "java automation 1" and description as "java123444" and click on save button
Then click on login button
Then close the browser









