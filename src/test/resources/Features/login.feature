Feature: Test login Functionality
 Background: Execute before all scenarios
    Given User into the Login Page

  
  Scenario Outline: Check login with valid credentials
    Given User Enter "<username>" and "<password>"
    When Verify the logo of the current page
    And User click the login button
    Then Close the Browser

    Examples: 
      | username                   | password   |
      | sabari03214-plzj@force.com | Sales@1234 |
      
      
  Scenario Outline: Check login with valid credentials
    Given User Enter "<username>" and "<password>"
    When Verify the logo of the current page
    And User click the login button
    Then slect viw all cart
    And list out the all drop down values
    Then Close the Browser

    Examples: 
      | username                   | password   |
      | sabari03214-plzj@force.com | Sales@1234 |
  
  
  