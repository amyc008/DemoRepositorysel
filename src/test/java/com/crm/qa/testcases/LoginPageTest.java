package com.crm.qa.testcases;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	public LoginPage loginPage;
	HomePage homepage;
	
	public LoginPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		//calls the super class constructor upon invoking hence property is loaded
	}
    //Initializing chromedriver
	@BeforeMethod
	public void setup() throws IOException
	{
		Initialization();
		//Calling the Initialization so that driver is setup
		loginPage=new LoginPage();
		//Creating loginPage object before each method so that we can access the actions 
		
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	@Test(priority=1)
	public void TestTitle()
	{
		String ActualTitle=loginPage.getCurrentTitle();
		Assert.assertEquals("Free CRM software for customer relationship management, sales, and support.", ActualTitle);
	}
	 
	
	
	@Test(priority=2)
	public void TestLogin() throws IOException
	{
		homepage=loginPage.clickSubmit("enter uname", "enter pw");
	}

}
