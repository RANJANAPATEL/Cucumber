package com.easy.qa.testcases;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.easy.qa.base.Testbase;
import com.easy.qa.pages.BasePageNameSearchAndValidate;

public class TestNameSearchAndValidation extends Testbase{
	Logger logs = Logger.getLogger(TestDownloadAndClick.class);
	public TestNameSearchAndValidation()
	{
		super();
	}
	@BeforeMethod
	public void setup() throws Exception
	{
		initialization();
	}
	@Test
	public void searchAndValidate()
	{
		logs.info("Launching the selenium easy dummy site for Name Search Brenda tree and Validate the Phone no.");
		 driver.get(prop.getProperty("url3"));
		BasePageNameSearchAndValidate basepage = new BasePageNameSearchAndValidate(driver);
		logs.info("Printing the Name");
		basepage.nameprint();
		logs.info("Validate the Phone No.");
		basepage.validatethePhone_No();
	
	}
	@AfterMethod
	 public void aftermethod()
	 {
		driver.close();
	 }
	
	
	
	
	
}
