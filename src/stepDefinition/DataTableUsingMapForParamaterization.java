/**
 * 
 */
package stepDefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Lenovo
 *
 */
public class DataTableUsingMapForParamaterization {
	private static WebDriver driver = null;
	@Given("^User is on new Home Page usingMap$")
	public void user_is_on_new_Home_Page_usingMap() throws Throwable {
       System.setProperty("webdriver.gecko.driver", "F:\\geckodriver.exe");
		
        driver = new FirefoxDriver();
        driver.get("http://www.store.demoqa.com");
        
 
	}

	@When("^User Navigate to new LogIn Page usingMap$")
	public void user_Navigate_to_new_LogIn_Page_usingMap() throws Throwable {
		 driver.findElement(By.xpath(".//*[@id='account']/a")).click();
		  
	}

	@When("^User enters new username and password usingMap$")
	public void user_enters_new_UserName_and_Password_usingMap(DataTable cred){
		for(Map<String,String> data :cred.asMaps(String.class, String.class)){
	        // Find the element that's ID attribute is 'log' (Username)
	 
	        // Enter Username on the element found by above desc.
	
	        driver.findElement(By.id("log")).sendKeys(data.get("username")); 
	 
	        // Find the element that's ID attribute is 'pwd' (Password)
	 
	        // Enter Password on the element found by the above desc.
	 System.out.println("pwd:"+data.get("password"));
	        driver.findElement(By.id("pwd")).sendKeys(data.get("password"));
	   	}

	}

	@Then("^new Message displayed Login Successfully usingMap$")
	public void new_message_displayed_Login_Successfully_usingMap() throws Throwable {
	   // driver.quit();
	}

	@Then("^User click on new register user usingMap$")
	public void user_click_on_new_register_user_usingMap() throws Throwable {
	    Thread.sleep(1500);
		driver.findElement(By.linkText("Register")).click();
	    Thread.sleep(1500);
	}

	@Then("User enters the new name and Id usingMap$")
	public void user_enters_the_new_details_usingMap(DataTable details) throws Throwable {
		for(Map<String,String> dtls: details.asMaps(String.class,String.class)){
			driver.findElement(By.id("user_login")).clear();
			driver.findElement(By.id("user_login")).sendKeys(dtls.get("name"));
			driver.findElement(By.id("user_email")).clear();
			driver.findElement(By.id("user_email")).sendKeys(dtls.get("Id"));
		}
	}
	@And("user closes the browser usingMap$")
	public void user_closes_the_browser_usingMap() throws Throwable {
		driver.close();   
	}
	   
}
