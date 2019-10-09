Feature: Application Log In

  
  Scenario: log in with valid credentials
    Given open the browser and enter the url
    When I enter the username
    And I enter the password
    And I hit the submit button
    Then I validate I logged in successfully
    

  
 

  
