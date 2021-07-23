package seleniumlearn.seleniumja;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import pageObject.LoginPage;
import resource.base;

public class HomePageTest extends base {
	
	@BeforeTest
	public void intialize() throws IOException
	{
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@Test(dataProvider="getData")
	public void basepageNavigation(String username,String password) throws IOException

	{
		
		driver.get(prop.getProperty("url"));
		
		LandingPage b = new LandingPage(driver);
		b.pop().click();
		b.login().click();
		LoginPage lb = new LoginPage(driver);
		lb.Email().sendKeys(username);
		lb.password().sendKeys(password);
		lb.login().click();
		
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[1][2];
		data[0][0]="ravishraj85@gmail.com";
		data[0][1]="password";
		return data;
	}
	
	@AfterTest
	public void closebrowser()
	{
		driver.close();
	}

}