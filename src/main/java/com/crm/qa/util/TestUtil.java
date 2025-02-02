package com.crm.qa.util;

import java.io.IOException;

import com.crm.qa.base.TestBase;

public class  TestUtil extends TestBase {
	//Util class wull have common selenium methods to be used by all
	
	public TestUtil() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public void switchFrame()
	{
	  driver.switchTo().frame("mainpanel");
	}

}
