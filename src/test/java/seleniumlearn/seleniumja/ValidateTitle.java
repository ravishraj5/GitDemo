package seleniumlearn.seleniumja;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import pageObject.LoginPage;
import resource.base;




public class ValidateTitle extends base {
	
	@BeforeTest
	public void intialize() throws IOException
	{
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void basepageNavigation() throws IOException

	{
		
		
		LandingPage b = new LandingPage(driver);
		//Assert.assertEquals((b.getTitle().getText()), "FEATURED COURSES");
		
		//(b.getTitle().getText());
	}
	
	@AfterTest
	public void closebrowser()
	{
		driver.close();
	}
	

}