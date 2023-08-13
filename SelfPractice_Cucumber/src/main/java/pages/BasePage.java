package pages;

import org.openqa.selenium.WebDriver;

import com.qa.factory.DriverFactory;

public class BasePage extends DriverFactory
{
	
	public static WebDriver driver;
	
	public static void getUrl()
	{
		getDriver().get("https://tutorialsninja.com/demo/index.php?route=account/login");
	}
	

}
