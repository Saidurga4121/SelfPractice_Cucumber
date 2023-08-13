package stepDefinitions;

import java.util.List;
import java.util.Map;

import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasePage;
import pages.HomePage;
import pages.RegisterPage;
import utils.CommonUtils;

public class RegisterSteps extends BasePage
{
	
	RegisterPage registerPage= new RegisterPage(DriverFactory.getDriver());
	HomePage homePage= new HomePage(DriverFactory.getDriver());
	
	@Given("User navigates to Register Account page")
    public void User_navigates_to_Register_Account_page()
    {
		getUrl();
		homePage.clickOnMyAccount();
		registerPage=homePage.selectRegisterOption();
		
    }
	
	@Then("User enters the details into below fields")
	public void user_enters_the_details_into_below_fields(DataTable dataTable) 
	{
		// ..........................using list.....................................................
		 List<List<String>> data=dataTable.asLists(String.class);
		 System.out.println(data+" iam the data");
		 for(int i=0;i<data.size();i++)
			 
		 {
			 System.out.println(data.size()+ " iam in i ");
			 System.out.println(data.get(i).size() +" iam in j");
			 for(int j=0;i<data.get(i).size()-1;j++)
			 {
				 System.out.println(i +" ------- "+ j);
				 System.out.println(data.get(i).get(j));
			 }
			 System.out.println("iam done");
		 }
		// registerPage.enterFirstName(data.get(0).get(0));
        // registerPage.enterLastName(data.get(0).get(1));
        // registerPage.enterTelephoneNumber(data.get(0).get(2));
        // registerPage.enterPassword(data.get(0).get(3));
		// registerPage.enterConfirmPassword(data.get(0).get(3));
	
		// .....................using maps when only one data is there...............................
        // List<Map<String, String>>data =dataTable.asMaps(String.class,String.class);    
        // registerPage.enterFirstName(data.get(0).get("firstName"));
        // registerPage.enterLastName(data.get(0).get("lastName"));
        // registerPage.enterTelephoneNumber(data.get(0).get("telephone"));
        // registerPage.enterPassword(data.get(0).get("password"));
        // registerPage.enterConfirmPassword(data.get(0).get("password"));
		
		// ...........using maps when multiple data is there using for each loop....................
//		List<Map<String, String>>data1=dataTable.asMaps(String.class,String.class);
//		
//		for(Map<String,String> mapData: data1)
//		{
//		 registerPage.enterFirstName(mapData.get("firstName"));
//         registerPage.enterLastName(mapData.get("lastName"));
//         registerPage.enterTelephoneNumber(mapData.get("telephone"));
//         registerPage.enterPassword(mapData.get("password"));
//         registerPage.enterConfirmPassword(mapData.get("password"));
//		}
	
	}
	
	@Given("User selects Privacy Policy")
	public void user_selects_privacy_policy() {
	   
	}

	@Given("User clicks on Continue button")
	public void user_clicks_on_continue_button() {
	   
	}

	@Then("User account should get created successfully")
	public void user_account_should_get_created_successfully() {
	    
	}


}
