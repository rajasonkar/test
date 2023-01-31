package test;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;



//@RunWith(Cucumber.class)
@CucumberOptions(
		features={"F:\\workspace\\cucuberTest\\Feature\\TestBackGround.feature",
				"F:\\workspace\\cucuberTest\\Feature\\TestOrderHooks.feature"},
		glue={"stepDefinition"},
		plugin = { "pretty", "html:target/cucumber-reports",
				"json:target/cucumber-reports/Cucumber.json",
				"junit:target/cucumber-reports/Cucumber.xml"}, 
		monochrome = true,
		strict =false,
		dryRun = false//,
	//	tags={"@smokeTest"},
	//	tags={"@RegressionTest"},
	//	tags={"@RegressionTest,@End2EndTest"},
		//or condition by comma btw the annotions(",") ->run tests cases associated either with regression or ene2end
		//tags={"@RegressionTest","@End2EndTest"},
		//AND condition by comma btw the Inverted double comas("","") ->run tests cases associated with regression and end2end both
		//tags={"~@RegressionTest","@End2EndTest"},
		// ~ for ignoring that cases
		//tags={"~@RegressionTest","~@End2EndTest","~@smokeTest"}
		//above commmand ignore all the test cases associated with the annotaions and run 
		//only those test cases which does not hane any annotaions
		
		/*features = "F:\\workspace\\cucuberTest\\feature\\LogIn_Test.feature"
		,glue={"stepDefinition"}*/
		)

public class TestRunner {
	private TestNGCucumberRunner testNGCucumberRunner;
	@Test(groups = "cucumber", description = "Runs Cucumber Feature")
	public void tst(CucumberFeatureWrapper cFeature){
		testNGCucumberRunner.runCucumber(cFeature.getCucumberFeature());
		}
}

