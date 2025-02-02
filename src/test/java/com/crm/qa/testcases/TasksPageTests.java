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

public class TasksPageTests extends TestBase {
	public HomePage hp;
	LoginPage loginPage;
	TestUtil tu;
	Tasks task;
	
	public TasksPageTests() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeMethod
	public void setup() throws IOException
	{
		Initialization();
		loginPage=new LoginPage();
		tu=new TestUtil();
		task=new Tasks();
		hp=loginPage.clickSubmit("enter uname ", "enter pw");
		tu.switchFrame();
		hp.clickTasks();
		
		
		
	}
	
	@Test
	public void verifyKeyWordSearch()
	{
		task.enterKeyWord();
		task.SearchButton();
	}
	@AfterMethod
	public void teardown()
	{
		driver.switchTo().defaultContent();
		driver.quit();
	}
	
	

}
