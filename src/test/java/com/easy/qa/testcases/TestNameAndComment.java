package com.easy.qa.testcases;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.easy.qa.base.Testbase;
import com.easy.qa.pages.BasePage;

public class TestNameAndComment extends Testbase {
	Logger logs = Logger.getLogger(TestDownloadAndClick.class);
	
	public TestNameAndComment()
	{
		super();
	}
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initialization();
	}
	@Test
	public void submit()
	{
		logs.info("Launching the selenium easy dummy site for Entering the Data");
		
		 driver.get(prop.getProperty("url1"));
		
		
		BasePage pg = new BasePage(driver);
		logs.info("Enter the Name");
		pg.enterName();
		logs.info("Enter the Comment");
		pg.enterComment();
		logs.info("Clicling On Submit Button");
		pg.clickSubmit();
		logs.info("Varifying the Submission Msg.");
		pg.verifymsg();
					
	}
	@AfterMethod
	 public void aftermethod()
	 {
		driver.close();
	 }
	
}
	
