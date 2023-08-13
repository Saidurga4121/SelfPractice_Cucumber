//package stepDefinitions;
//
//import com.qa.factory.DriverFactory;
//import io.cucumber.java.en.*;
//import pages.BasePage;
//import pages.Loginpage;
//
//
//
//public class LoginPageSteps extends BasePage
//{	
//	Loginpage lp= new Loginpage(DriverFactory.getDriver());
//	
//	
//	@Given("User navigates to login page")
//	public void user_navigates_to_login_page() 
//	{
//	    getUrl();
//	}
//	
//	
//	@When("User enters email address as {string} into email field")
//	public void user_enters_email_address_as_into_email_field(String email)
//	{
//	    lp.enterEmailAddress(email);
//	}
//
//	@When("User enters invalid password {string} into password field")
//	public void user_enters_invalid_password_into_password_field(String password) 
//	{
//	    lp.enterPassword(password);
//	}
//
//	@When("User clicks on Login button")
//	public void user_clicks_on_login_button() 
//	{
//	    lp.clickOnLoginButton();
//	}
//
//	@Then("User should get a proper warning message about credentials mismatch")
//	public void user_should_get_a_proper_warning_message_about_credentials_mismatch()
//	{
//	   
//	}
//
//	@When("User enters invalid email address as {string} into email field")
//	public void user_enters_invalid_email_address_as_into_email_field(String string) 
//	{
//	    
//	}
//
//
//
//
//}
