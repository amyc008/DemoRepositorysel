package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class Tasks extends TestBase {

	@FindBy(xpath="//input[@name='cs_keyword']")
	WebElement keyWord;
	
	@FindBy(xpath="//input[@name='cs_submit' and @class='button' and @type='submit']")
	WebElement searchButton;
	
	public Tasks() throws IOException {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	public void enterKeyWord()
	{
		keyWord.sendKeys("Selenium");
		
	}
	
	public void SearchButton()
	{
		searchButton.click();
	}

}
