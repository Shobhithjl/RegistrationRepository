package PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StudentRegistrationFormPageObjects 
{
	@FindBy(id="firstName")
	private WebElement txtFirstName;
	
	@FindBy(id="lastName")
	private WebElement txtLastName;
	
	@FindBy(id="userEmail")
	private WebElement txtEmail;
	
	@FindBy(xpath="//input[@value='Male']")
	private WebElement maleSelect;
	
	@FindBy(xpath="//input[@value='Female']")
	private WebElement femaleSelect;
	
	@FindBy(xpath="//input[@value='Other']")
	private WebElement otherSelect;
	
	public StudentRegistrationFormPageObjects(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void enterFirstName(String firstName)
	{
		txtFirstName.sendKeys(firstName);
	}
	
	public void enterLastName(String lastName)
	{
		txtLastName.sendKeys(lastName);
	}
	
	public void enterEmail(String emailId)
	{
		txtEmail.sendKeys(emailId);
	}
	
	public WebElement selectGender()
	{
		return maleSelect;
		
//		if(Gender.equalsIgnoreCase("Male") && !maleSelect.isSelected())
//		{
//			maleSelect.click();
//		}
//		else if(Gender.equalsIgnoreCase("Female") && !femaleSelect.isSelected())
//		{
//			femaleSelect.click();
//		}
//		else
//		{
//			otherSelect.click();
//		}
	}
}
