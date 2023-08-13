package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.factory.DriverFactory;

import utils.CommonUtils;
import utils.ElementUtils;

public class Loginpage extends BasePage 
{
	
	// WebDriver classdriver;
	ElementUtils elementUtils;
	
	@FindBy(id="input-email")
	private WebElement emailField;
	
	@FindBy(id="input-password")
	private WebElement passwordField;
	
	@FindBy(xpath="//input[@value='Login']")
	private WebElement loginButton;
	
	public Loginpage(WebDriver localdriver)
	{
		this.driver=localdriver;
		System.out.println(driver + " iam the base driver..............");
		PageFactory.initElements(driver, this);
		elementUtils = new ElementUtils(driver);
		
	}
	
    public void enterEmailAddress(String emailText)
    {	
    	// emailField.sendKeys(emailText);
    	//
		elementUtils.typeTextIntoElement(emailField, emailText,10);	
	}
	
	public void enterPassword(String passwordText) 
	{
		// passwordField.sendKeys(passwordText);
		elementUtils.typeTextIntoElement(passwordField, passwordText,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);	
	}
	
	public void clickOnLoginButton() 
	{
		// loginButton.click();
		elementUtils.clickOnElement(loginButton,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}
	

}
