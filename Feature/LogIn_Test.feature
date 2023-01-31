#without example keyword
 Feature: Login Action
 
Scenario: Successful Login with Valid Credentials
	Given User is on Home Page
	When User Navigate to LogIn Page
	And User enters "raja.sonkar" and "Pass@123"
	Then Message displayed Login Successfully
 
	#Scenario: Successful LogOut
	#When User LogOut from the Application
	#	Then Message displayed LogOut Successfully 
	
	#with example keyword
	
	

 
Scenario Outline: Successful Login with Valid Credentials
	Given User is on Home Page
	When User Navigate to LogIn Page
	And User enters "<username>" and "<password>"
	Then Message displayed Login Successfully
 
 Examples:
 
 |usernae|password|
 |raja|sonkar|
 |sonkar|raja|
 
