package stepDefinition;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Hooks {
	//global hooks run before every scenario
	@BeforeMethod
	public void beforeScenario(){
    System.out.println("This will run before the every Scenario");
}

@AfterMethod
public void afterScenario(){
    System.out.println("This will run after the every Scenario");
}
//tagged hooks run accordingly as defined in feature file
@BeforeMethod
@Before("@First")
public void beforeFirst(){
    System.out.println("This will run only before the First Scenario");
}	

@BeforeMethod
@Before("@Second")
public void beforeSecond(){
    System.out.println("This will run only before the Second Scenario");
}	

@BeforeMethod
@Before("@Third")
public void beforeThird(){
    System.out.println("This will run only before the Third Scenario");
}

@AfterMethod
@After("@First")
public void afterFirst(){
    System.out.println("This will run only after the First Scenario");   
}	

@AfterMethod
@After("@Second")
public void afterSecond(){
    System.out.println("This will run only after the Second Scenario");   
}	

@AfterMethod
@After("@Third")
public void afterThird(){
    System.out.println("This will run only after the Third Scenario");   
}	}
