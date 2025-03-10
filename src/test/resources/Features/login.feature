Feature: Test login Functionality
 Background: Execute before all scenarios
    Given User into the Login Page
#
  #@test1
  #Scenario Outline: Check login with valid credentials
    #Given User Enter "<username>" and "<password>"
    #When Verify the logo of the current page
    #And User click the login button
    #Then Close the Browser
#
    #Examples: 
      #| username                   | password   |
      #| sabari03214-plzj@force.com | Sales@1234 |
      #
   #@test2   
  #Scenario Outline: Check Home page view all carts
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
  
  #@test4  
  #Scenario Outline: Check all menus in Dashboard Page 
    #Given User Enter "<username>" and "<password>"
    #When Verify the logo of the current page
    #And User click the login button
    #Then select Home menu
    #And select contact menu
    #Then select Accounts menu
    #Then select Sales menu
    #And select servies menu
    #Then Close the Browser
#
    #Examples: 
      #| username                   | password   |
      #| sabari03214-plzj@force.com | Sales@1234 |
      #
      #
     #
  #@test4  
  #Scenario Outline: Check Home menu Feilds
    #Given User Enter "<username>" and "<password>"
    #When Verify the logo of the current page
    #And User click the login button
    #Then Get the Recent contacts in the Homepage
    #And click the view reports tap
    #
    #
    #
#
    #Examples: 
      #| username                   | password   |
      #| sabari03214-plzj@force.com | Sales@1234 |
      #
    #@test5
  #Scenario Outline: Check Analytics in home page menu 
    #Given User Enter "<username>" and "<password>"
    #When Verify the logo of the current page
    #And User click the login button
    #When selecting the home page in dashboard page
    #Then check the analytics in the Home menu
    #Then Close the Browser
#
    #Examples: 
      #| username                   | password   |
      #| sabari03214-plzj@force.com | Sales@1234 |
      #
      #
       #@test7
  #Scenario Outline: Check Home menu Feilds
    #Given User Enter "<username>" and "<password>"
    #When Verify the logo of the current page
    #And User click the login button
    #Then Get into Accounts tab
    #And check whether all listed tap are visible in accounts
        #Then Close the Browser
    #
    #
    #
#
    #Examples: 
      #| username                   | password   |
      #| sabari03214-plzj@force.com | Sales@1234 |
 
  #@test8
  #Scenario Outline: Check sales tap in the dashboard
    #Given User Enter "<username>" and "<password>"
    #When Verify the logo of the current page
    #And User click the login button
    #Then Get into Sales tab
    #And check whether all listed tap are visible in Sales
        #Then Close the Browser
    #
    #
    #
#
    #Examples: 
      #| username                   | password   |
      #| sabari03214-plzj@force.com | Sales@1234 |
  #
  
  #@test9
  #Scenario Outline: Check the Prife details in the dashoard page
    #Given User Enter "<username>" and "<password>"
    #When Verify the logo of the current page
    #And User click the login button
    #Then select Home menu
    #And check whether view profile tap accessible 
    #Then Close the Browser
    #
    #
    #
#
    #Examples: 
      #| username                   | password   |
      #| sabari03214-plzj@force.com | Sales@1234 |