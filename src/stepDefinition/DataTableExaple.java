package stepDefinition;

import java.util.List;
import cucumber.api.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTableExaple {
	private static WebDriver driver = null;
	@Given("^User is on new Home Page$")
	public void user_is_on_new_Home_Page() throws Throwable {
       System.setProperty("webdriver.gecko.driver", "F:\\geckodriver.exe");
		
        driver = new FirefoxDriver();
        driver.get("http://www.store.demoqa.com");
        
 
	}

	@When("^User Navigate to new LogIn Page$")
	public void user_Navigate_to_new_LogIn_Page() throws Throwable {
		 driver.findElement(By.xpath(".//*[@id='account']/a")).click();
		  
	}

	@When("^User enters new username and password$")
	public void user_enters_new_UserName_and_Password(DataTable cred){
		List<List<String>> data = cred.raw();
	        // Find the element that's ID attribute is 'log' (Username)
	 
	        // Enter Username on the element found by above desc.
	
	        driver.findElement(By.id("log")).sendKeys(data.get(0).get(0)); 
	 
	        // Find the element that's ID attribute is 'pwd' (Password)
	 
	        // Enter Password on the element found by the above desc.
	 
	        driver.findElement(By.id("pwd")).sendKeys(data.get(0).get(1));
	   	}



	@Then("^new Message displayed Login Successfully$")
	public void new_message_displayed_Login_Successfully() throws Throwable {
	   // driver.quit();
	}

	@Then("^User click on new register user$")
	public void user_click_on_new_register_user() throws Throwable {
	    Thread.sleep(1500);
		driver.findElement(By.linkText("Register")).click();
	    Thread.sleep(1500);
	}

	@Then("User enters the new name and Id$")
	public void user_enters_the_new_details(DataTable details) throws Throwable {
		List<List<String>> dtls= details.raw();
		driver.findElement(By.id("user_login")).sendKeys(dtls.get(0).get(0));
		 driver.findElement(By.id("user_email")).sendKeys(dtls.get(0).get(1));
		    
	}
	@And("user closes the browser$")
	public void user_closes_the_browser() throws Throwable {
		driver.close();   
	}
	   
	}
	


