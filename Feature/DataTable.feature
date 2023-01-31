Feature: login and register	
Scenario: Try Login and register user
	Given User is on new Home Page
	When User Navigate to new LogIn Page
	And User enters new username and password
	|raja|Pass@123|
	Then new Message displayed Login Successfully
	Then User click on new register user
	And User enters the new name and Id
	|raja sonkar|raja.sonkar@raja.com|
	And user closes the browser