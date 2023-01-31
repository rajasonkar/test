package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SeleniumTest {
	/*private static WebDriver driver = null;
	public static void main(String[] args) {
		// Create a new instance of the Firefox driver
		System.setProperty("webdriver.gecko.driver", "F:\\geckodriver.exe");
		
        driver = new FirefoxDriver();
 
        //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
        //Launch the Online Store Website
 
        driver.get("http://www.store.demoqa.com");
 
        // Find the element that's ID attribute is 'account'(My Account) 
 
        driver.findElement(By.xpath(".//*[@id='account']/a")).click();
 
        // Find the element that's ID attribute is 'log' (Username)
 
        // Enter Username on the element found by above desc.
 
        driver.findElement(By.id("log")).sendKeys("testuser_1"); 
 
        // Find the element that's ID attribute is 'pwd' (Password)
 
        // Enter Password on the element found by the above desc.
 
        driver.findElement(By.id("pwd")).sendKeys("Test@123");
 
        // Now submit the form. WebDriver will find the form for us from the element 
 
        driver.findElement(By.id("login")).click();
 
        // Print a Log In message to the screen
 
        System.out.println("Login Successfully");
 
        // Find the element that's ID attribute is 'account_logout' (Log Out)
 
       // driver.findElement (By.xpath(".//*[@id='account_logout']/a")).click();
 
        // Print a Log In message to the screen
 
     //   System.out.println("LogOut Successfully");
 
        // Close the driver
 
        driver.quit();
 
	}
*/
	private static WebDriver driver = null;
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
       System.setProperty("webdriver.gecko.driver", "F:\\geckodriver.exe");
		
        driver = new FirefoxDriver();
        driver.get("http://www.store.demoqa.com");
        
 
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
		 driver.findElement(By.xpath(".//*[@id='account']/a")).click();
		  
	}

	@When("^User enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_UserName_and_Password(String userName, String password){
		 
	        // Find the element that's ID attribute is 'log' (Username)
	 
	        // Enter Username on the element found by above desc.
	 System.out.println(userName);
	        driver.findElement(By.id("log")).sendKeys(userName); 
	 
	        // Find the element that's ID attribute is 'pwd' (Password)
	 
	        // Enter Password on the element found by the above desc.
	 System.out.println(password);
	        driver.findElement(By.id("pwd")).sendKeys(password);
	   	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
	   // driver.quit();
	}

	@Then("^User click on register user$")
	public void user_click_on_register_user() throws Throwable {
	    Thread.sleep(1500);
		driver.findElement(By.linkText("Register")).click();
	    Thread.sleep(1500);
	}

	@Then("^User enters the details \"(.*)\" and \"(.*)\"$")
	public void user_enters_the_details(String name, String Id) throws Throwable {
		System.out.println(name);
		System.out.println(Id);
		driver.findElement(By.id("user_login")).sendKeys(name);
		 driver.findElement(By.id("user_email")).sendKeys(Id);
		    
	}
	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Throwable {
	  
	}

	@Then("^Message displayed LogOut Successfully$")
	public void message_displayed_LogOut_Successfully() throws Throwable {
	   
	}
	

}
