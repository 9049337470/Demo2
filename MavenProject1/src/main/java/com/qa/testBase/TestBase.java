package com.qa.testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.utility.WebDriverListener;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase 
{
   public static WebDriver driver;
   EventFiringWebDriver e_driver;
   WebDriverListener listener;
   
	@BeforeMethod

	public void start()
	{
		String abc="chrome";
		if(abc.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
		}
		else if(abc.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();
		}
		else if(abc.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else
		{
			System.out.println("Please Enter valid URl of browsser");
		}
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//listenere code
		
		EventFiringWebDriver e_driver=new EventFiringWebDriver(driver);
		WebDriverListener listener=new WebDriverListener();
		e_driver.register(listener);
		driver=e_driver;
	   }
	@AfterMethod
	public void tearDown() //tearDown
	{
		driver.quit();
	}
	
	

}
