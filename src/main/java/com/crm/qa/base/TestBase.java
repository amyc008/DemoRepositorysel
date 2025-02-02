package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//We s
//Base class that will be extended by all classes test,pages and util
//has 2 methods one is initialization which chooses the driver
//constructor which picks values provided for driver in config.properties
public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() throws IOException
	{
		try
		{
			prop=new Properties();
			FileInputStream ip=new FileInputStream("enter path");
			prop.load(ip);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
	
	
	public static void Initialization()
	{
		//String browserName=prop.getProperty("browser").toString();
		String browserName="Chrome";
		if(browserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "enter path");
			driver=new ChromeDriver();
			
		}
		
		if(browserName=="Firefox")
		{
			System.setProperty("webdriver.firefox.driver", "enter path");
			driver=new FirefoxDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.get(prop.getProperty("url"));
		driver.get("https://classic.crmpro.com");
	}
	

}
