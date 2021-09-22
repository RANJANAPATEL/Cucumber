package com.easy.qa.testcases;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.easy.qa.base.Testbase;
import com.easy.qa.pages.BasePageMsgBoxValidation;

public class TestClickOnMsgBoxValidation extends Testbase{
	Logger logs = Logger.getLogger(BasePageMsgBoxValidation.class);
	public TestClickOnMsgBoxValidation()
	{
		super();
	}
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initialization();
	}

	@Test
	public void ClickOnMsgBox()
	{
		logs.info("Launching the selenium easy dummy site");
		driver.get(prop.getProperty("url4"));
		BasePageMsgBoxValidation basemsg = new BasePageMsgBoxValidation(driver);
		logs.info("Clicling On box1");
		basemsg.autoclosablebutton();
		logs.info("Clicling On box2");
		basemsg.autoclosabledangerbutton();
		logs.info("Clicling On box3");
		basemsg.autoclosableinfobutton();
		logs.info("Clicling On box4");
		basemsg.autoclosablewarningbutton();
		logs.info("Clicling On box5");
		basemsg.normalbutton();
		logs.info("Clicling On box6");
		basemsg.normaldangerbutton();
		logs.info("Clicling On box7");
		basemsg.normalwarningbutton();
		logs.info("Clicling On box8");
		basemsg.normalinfobutton();
	}

	@Test(priority=1)

	public void validationMsgBox() 
	{
		driver.get(prop.getProperty("url4"));
		BasePageMsgBoxValidation base = new BasePageMsgBoxValidation(driver);
		logs.info("Validating msg box1");
		boolean box1 = base.autoclosablebutton();
		Assert.assertTrue(box1);
		logs.info("Validating msg box2");
		boolean box2 = base.autoclosablewarningbutton();
		Assert.assertTrue(box2);
		logs.info("Validating msg box3");
		boolean box3 = base.normalwarningbutton();
		Assert.assertTrue(box3);
		logs.info("Validating msg box4");
		boolean box4 = base.autoclosabledangerbutton();
		Assert.assertTrue(box4);
		logs.info("Validating msg box5");
		boolean box5 = base.normaldangerbutton();
		Assert.assertTrue(box5);
		logs.info("Validating msg box6");
		boolean box6 = base.autoclosableinfobutton();
		Assert.assertTrue(box6);
		logs.info("Validating msg box7");
		boolean box7 = base.normalinfobutton();
		Assert.assertTrue(box7);
		logs.info("Validating msg box8");
		boolean box8 = base.normalbutton();
		Assert.assertTrue(box8);
	}
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
}

