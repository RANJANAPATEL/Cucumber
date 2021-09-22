package com.easy.qa.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.easy.qa.base.Testbase;

public class BasePageMsgBoxValidation extends Testbase {
	
	public WebDriver driver;

	@FindBy(xpath="//button[@id='autoclosable-btn-success']")
	private WebElement autoclosablebutton;
	@FindBy(xpath="//button[@id='normal-btn-success']")
	private WebElement normalbutton;
	@FindBy(xpath="//button[@id='autoclosable-btn-warning']")
	private WebElement autoclosablewarningbutton;
	@FindBy(xpath="//button[@id='normal-btn-warning']")
	private WebElement normalwarningbutton;
	@FindBy(xpath="//button[@id='autoclosable-btn-danger']")
	private WebElement autoclosabledangerbutton;
	@FindBy(xpath="//button[@id='normal-btn-danger']")
	private WebElement normaldangerbutton;
	@FindBy(xpath="//button[@id='autoclosable-btn-info']")
	private WebElement autoclosableinfobutton;
	@FindBy(xpath=" //button[@id='normal-btn-info']")
	private WebElement normalinfobutton;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-autocloseable-success']")
	private WebElement autocloseablesuccessmsg;
	@FindBy(xpath="//div[@class='alert alert-warning alert-autocloseable-warning']")
	private WebElement autocloseablewarningmsg;
	@FindBy(xpath="//div[@class='alert alert-warning alert-normal-warning']")
	private WebElement normalwarningmsg;
	@FindBy(xpath="//div[@class='alert alert-danger alert-autocloseable-danger']")
	private WebElement autocloseabledangermsg;
	@FindBy(xpath="//div[@class='alert alert-danger alert-normal-danger']")
	private WebElement normaldangermsg;
	@FindBy(xpath="//div[@class='alert alert-info alert-autocloseable-info']")
	private WebElement autocloseableinfomsg;
	@FindBy(xpath="//div[@class='alert alert-info alert-normal-info']")
	private WebElement normalinfomsg;
	@FindBy(xpath="//div[@class='alert alert-success alert-normal-success']")
	private WebElement normalsuccessmsg;
	

	public BasePageMsgBoxValidation(WebDriver driver)
	{
		this.driver=driver;
	PageFactory.initElements(driver,this); 
	}

	public boolean autoclosablebutton()
	{
		autoclosablebutton.click();
		return true;
	}
	public boolean normalbutton()
	{
	normalbutton.click();
	return true;
	}
	public boolean autoclosablewarningbutton()
	{
		autoclosablewarningbutton.click();
		return true;
	}
	public boolean normalwarningbutton()
	{
	
		normalwarningbutton.click();
		return true;
	}
	public boolean autoclosabledangerbutton()
	{
		autoclosabledangerbutton.click();
		return true;
	}
	public boolean normaldangerbutton()
	{
		normaldangerbutton.click();
		return true;
	}
	public boolean autoclosableinfobutton()
	{
		autoclosableinfobutton.click();
		return true;
	}
	public boolean normalinfobutton()
	{
		normalinfobutton.click();
		return true;
		
	}
	public void autocloseablesuccessmsg() 
	{
		String fetch = autocloseablesuccessmsg.getText();
		System.out.println(fetch);
		Assert.assertTrue(true);  
	
	}
	/*public void autocloseablewarningmsg()
	{
		String fetch1 = autocloseablewarningmsg.getText();
		System.out.println(fetch1);
		Assert.assertTrue(true);  
	}
	public void normalwarningmsg()
	{
		String fetch2 = normalwarningmsg.getText();
		System.out.println(fetch2);
		Assert.assertTrue(true);  
	}
	public void autocloseabledangermsg()
	{
		String fetch3 = autocloseabledangermsg.getText();
		System.out.println(fetch3);
		Assert.assertTrue(true);  
	}
	public void normaldangermsg()
	{
		String fetch4 = normaldangermsg.getText();
		System.out.println(fetch4);
		Assert.assertTrue(true);  
	}
	public void  autocloseableinfomsg()
	{
		String fetch5 = autocloseableinfomsg.getText();
		System.out.println(fetch5);
		Assert.assertTrue(true);  
	}
	public void normalsuccessmsg()
	{
		String fetch6 = normalsuccessmsg.getText();
		System.out.println(fetch6);
		Assert.assertTrue(true);  
	}
	public void normalinfomsg()
	{
		String fetch7 = normalinfomsg.getText();
		System.out.println(fetch7);
		Assert.assertTrue(true);  
	}*/
	
		
	
	}