package stepDefinition;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class OrderHooks {
	private org.testng.TestRunner testRunner;
	//@BeforeMethod( =1)
	@Before(order=1)
    public void beforeScenario(){
        System.out.println("This will run before the every Scenario");
    }	
	@BeforeMethod
	@Before(order=0)
    public void beforeScenarioStart(){
        System.out.println("-----------------Start of Scenario-----------------");
    }	
	
	
//	@AfterMethod
	@After(order=0)
    public void afterScenarioFinish(){
        System.out.println("-----------------End of Scenario-----------------");
    }	
	@AfterMethod
	@After(order=1)
    public void afterScenario(){
        System.out.println("This will run after the every Scenario");
    }
}
