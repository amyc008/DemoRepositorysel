package com.crm.qa.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(xpath="//input[@name='username']")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@class='btn btn-small']")
	WebElement loginbtn;
	
//	@FindBy(xpath="//div[@id='login_credentials']//child::br")
//	List<WebElement> users;

	public LoginPage() throws IOException {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	//Actions
	public String getCurrentTitle()
	{
		return driver.getTitle();
	}
//	 public List<WebElement> verifyListOfUserNames()
//	 {
//		return users;
//		
//	 }
	 
	 public HomePage clickSubmit(String uname,String pw) throws IOException
	 {
		 
		 
		 username.sendKeys(uname);
		 password.sendKeys(pw);
		 loginbtn.click();
		 
		 //after login it will return the next page class object
		 return new HomePage();
	 }


	

}
