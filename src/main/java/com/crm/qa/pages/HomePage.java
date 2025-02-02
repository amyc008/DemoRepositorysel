package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{

	@FindBy(xpath="//a[text()='Contacts']")
	WebElement contacts;
	
	
	@FindBy(xpath="//a[text()='Deals']")
	WebElement deals;
	
	@FindBy(xpath="//a[text()='Tasks']")
	WebElement tasks;
	
	
	
	
	public HomePage() throws IOException {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	//Actions
	
	public void clickContacts()
	{
		
		contacts.click();
	}
	
	public void clickDeals()
	{
		
		deals.click();
	}
	
	public Tasks clickTasks() throws IOException
	{
		
		tasks.click();
		return new Tasks();
	}
	
	public void clickBack()
	{
		driver.navigate().back();
	}

}
