Feature: login and register	
Scenario: Try Login and register user
	Given User is on new Home Page usingMap
	When User Navigate to new LogIn Page usingMap
	And User enters new username and password usingMap
	|username|password|
	|raja|Pass@123|
	Then new Message displayed Login Successfully usingMap
	Then User click on new register user usingMap
	And User enters the new name and Id usingMap
	|name|Id|
	|raja sonkar|raja.sonkar@raja.com|
	|sonkar raja|sonkar.raja@sonkar.co|
	And user closes the browser usingMap