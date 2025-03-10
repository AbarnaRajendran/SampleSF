Feature:Test Case 1: Register new user and login with valid credentials
 Scenario: Create a new User in the Automation Testing Tool
    Given User launch the browser with Crorrect URl
    When verify the logo of the page
    Then click Login button 
    And create new user name
    And create new email id 
    Then Click the sign up button
    And verify the Dash board page

 Scenario: Login with valid credentials 
    Given User launch the browser with Crorrect URl
    When verify the logo of the page
    Then click Login button 
    Given enter the valid email address
    And Enter the password in the field
    Then Click the Login button
    And verify the Dash board page
     
 Scenario: Login with invalid credentials 
    Given User launch the browser with Crorrect URl
    When verify the logo of the page
  Then click Login button 
    Given enter the invalid email address
    And Enter the invalid password in the field
    Then Click the Login button
    And verify the Dash board page
     