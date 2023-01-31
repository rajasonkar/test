#with example keyword	
Feature: login and register	
Scenario Outline: Try Login and register user
	Given User is on Home Page
	When User Navigate to LogIn Page
	And User enters "<userName>" and "<password>"
	Then Message displayed Login Successfully
	Then User click on register user
	And User enters the details "<name>" and "<Id>" 
 

 
 Examples:
 
 |userName|password|name|Id|
 |raja|sonkar|raja|raja.ra@test|
 |sonkar|raja|sonkar|s.s@test|
 
