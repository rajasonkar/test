@FunctionalTestTag
Feature: Tagging Test	
@smokeTest
Scenario: Test1
	Given Test1 test Case

	@RegressionTest
Scenario: Test2
	Given Test2 test Case
	@End2EndTest
Scenario: Test3
	Given Test3 test Case
	@smokeTest@End2EndTest
Scenario: Test4
	Given Test4 test Case
	@smokeTest@RegressionTest
Scenario: Test5
	Given Test5 test Case
	@smokeTest@RegressionTest
Scenario: Test6
	Given Test6 test Case
	@smokeTest@End2EndTest
Scenario: Test7
	Given Test7 test Case
	@smokeTest@End2EndTest@RegressionTest
Scenario: Test8
	Given Test8 test Case
	
	Scenario: Test9
	Given Test9 test Case