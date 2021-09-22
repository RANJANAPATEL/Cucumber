package com.easy.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.easy.qa.base.Testbase;
import com.easy.qa.pages.BasePage;
import com.easy.qa.pages.BasePageDownloadandClick;
import com.sun.tools.sjavac.Log;

public class TestDownloadAndClick extends Testbase {
	
	Logger logs = Logger.getLogger(TestDownloadAndClick.class);
	public TestDownloadAndClick()
	{
		super();
	}
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initialization();
	}
	
	@Test
	public void downloadandclos() throws Exception
	{
		logs.warn("Exception handling is needed.");
		logs.info("Launching the selenium easy dummy site");
		 driver.get(prop.getProperty("url2"));
		BasePageDownloadandClick basepg = new BasePageDownloadandClick(driver);
		logs.info("Clicking On Downloading Button ");
		basepg.clickOnDownloadButton();
		//Thread.sleep(10000);
		//driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		logs.info("Clicking On Close Button ");
		basepg.clickOnCloseButton();
		
		
	}
	@AfterMethod
	 public void aftermethod()
	 {
		driver.close();
	 }
	
	
	
}