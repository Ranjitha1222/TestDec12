
Feature: Login Action

@billing
Scenario Outline: Successful Login with Valid Credentials
	Given User is on Home Page
	When User Navigate to LogIn Page
	And User enters "<UserName>" and "<Password>"
	Then Message displayed Login Successfully
    Then logout

	Examples:
      | UserName   | Password    |
      | testuser_1 | Test@123    |
    
@important 
Scenario: Test
    Given User is on Home Page123
    Then logout
	

   
   	