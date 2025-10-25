package StudentRegistrationStepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import PageObjects.StudentRegistrationFormPageObjects;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StudentRegistrationForm 
{
	WebDriver driver;
	StudentRegistrationFormPageObjects sp;
	
	@Given("User is in Student Registration page")
	public void user_is_in_student_registration_page() 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

//	@When("user enters FirstName,Last Name,Email")
//	public void user_enters_first_name_last_name_email(String FirstName,String LastName,String Email) 
//	{
//		sp = new StudentRegistrationFormPageObjects(driver);
//		sp.enterFirstName(FirstName);
//		sp.enterLastName(LastName);
//		sp.enterEmail(Email);
//	}
	
//	@When("user enters {string},{string}, {string},{string}")
//	public void user_enters(String firstName, String lastName, String Email,String Gender) 
//	{    
//	    sp = new StudentRegistrationFormPageObjects(driver);
//		sp.enterFirstName(firstName);
//		sp.enterLastName(lastName);
//		sp.enterEmail(Email);
//		sp.selectGender(Gender);
//	}
	
	@When("user enters {string},{string}, {string} ,{string}")
	public void user_enters(String firstName, String lastName, String Email, String Gender)
	{
	        sp = new StudentRegistrationFormPageObjects(driver);
			sp.enterFirstName(firstName);
			sp.enterLastName(lastName);
			sp.enterEmail(Email);
//			JavascriptExecutor js = (JavascriptExecutor)driver;
//			js.executeScript("window.scrollBy(0,500)");
			Actions act = new Actions(driver);
			act.click(sp.selectGender()).perform();
	}

	@When("clicks on Submit button")
	public void clicks_on_submit_button() 
	{
		
	}
	
	@Then("Registration should be successful and registration details should be displayed in the popup window.")
	public void registration_should_be_successful_and_registration_details_should_be_displayed_in_the_popup_window() 
	{
		
	    
	}
	

}
