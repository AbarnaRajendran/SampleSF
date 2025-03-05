Feature: Test login Functionality
 Background: Execute before all scenarios
    Given User into the Login Page

  @test1
  Scenario Outline: Check login with valid credentials
    Given User Enter "<username>" and "<password>"
    When Verify the logo of the current page
    And User click the login button
    Then Close the Browser

    Examples: 
      | username                   | password   |
      | sabari03214-plzj@force.com | Sales@1234 |
      
   #@test2   
  #Scenario Outline: Check login with valid credentials
    #Given User Enter "<username>" and "<password>"
    #When Verify the logo of the current page
    #And User click the login button
    #Then select view all cart
    #And list out the all drop down values
    #Then Close the Browser
#
    #Examples: 
      #| username                   | password   |
      #| sabari03214-plzj@force.com | Sales@1234 |
  
   @test3   
  Scenario Outline: Check the contact list taps are visible 
    Given User Enter "<username>" and "<password>"
    When Verify the logo of the current page
    And User click the login button
    Then select the contact menu
    And check whether all listed tap are visible
    Examples: 
      | username                   | password   |
      | sabari03214-plzj@force.com | Sales@1234 |
  
  @test4  
  Scenario Outline: Check all menus in Dashboard Page 
    Given User Enter "<username>" and "<password>"
    When Verify the logo of the current page
    And User click the login button
    Then select Home menu
    And select contact menu
    Then select Accounts menu
    Then select Sales menu
    And select servies menu
    Then Close the Browser

    Examples: 
      | username                   | password   |
      | sabari03214-plzj@force.com | Sales@1234 |