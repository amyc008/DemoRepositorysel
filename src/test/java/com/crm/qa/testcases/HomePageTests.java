package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.Tasks;
import com.crm.qa.util.TestUtil;

public class HomePageTests extends TestBase {
	public HomePage hp;
	LoginPage loginPage;
	TestUtil tu;
	
	public HomePageTests() throws IOException
	{
		super();
		
	}
	
	@BeforeMethod
	public void setup() throws IOException
	{
		Initialization();
		loginPage=new LoginPage();
		hp=loginPage.clickSubmit("enter uname", "enter pw");
		tu=new TestUtil();
	}
	@AfterMethod
	public void teardown()
	{
		driver.switchTo().parentFrame();
		driver.quit();
	}
	
	@Test(priority=1)
	public void clickTest() throws IOException
	{
		tu.switchFrame();
		hp.clickContacts();
		hp.clickBack();
		tu.switchFrame();
		hp.clickDeals();
		hp.clickBack();
		tu.switchFrame();
		hp.clickTasks();
		
	}
	
	

}
