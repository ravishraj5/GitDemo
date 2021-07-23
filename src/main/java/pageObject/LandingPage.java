package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
	By signin = By.xpath("//span[contains(text(),'Login')]");
	
	By popup = By.xpath("//button[contains(text(),'NO THANKS')]");
	By validate = By.xpath("//body[1]/section[1]/div[1]/div[1]/h2[1]");
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement pop()
	{
		return driver.findElement(popup);
	}
	
	public WebElement login()
	{
		return driver.findElement(signin);
	}
	
	public WebElement getTitle()
	{
		return driver.findElement(validate);
	}

}
