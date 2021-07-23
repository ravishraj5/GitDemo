package resource;

import java.io.FileInputStream;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	
	public Properties prop;
	public WebDriver driver;
	
	public WebDriver initializeDriver() throws IOException
	{
		
		 prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\A707282\\eclipse-workspace\\seleniumja\\src\\main\\java\\resource\\data.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
				if (browserName.equals("chrome"))
				{
					System.setProperty("webdriver.chrome.driver","C:\\CR\\New\\chromedriver.exe");
					 driver = new ChromeDriver();
					
	}
				else if (browserName.equals("firefox"))
				{
					driver = new ChromeDriver();
				}
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
				
			return driver;
			
			
			
	}
	
}
