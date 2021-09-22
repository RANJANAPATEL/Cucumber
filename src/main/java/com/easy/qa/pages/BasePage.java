package com.easy.qa.pages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.easy.qa.base.Testbase;

import org.testng.Assert;


public class BasePage extends Testbase{
	public WebDriver driver;

	@FindBy(xpath="//input[@id='title']")
	
	private WebElement titletextbox;
	@FindBy(xpath="//textarea[@id='description']")
	private WebElement descriptiontextbox;
	@FindBy(xpath="//input[@id='btn-submit']")
	private WebElement submitbutton;
	@FindBy(xpath="//div[@id='submit-control']")
	private WebElement msg;
   
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
	PageFactory.initElements(driver,this); 
	}

	public void enterName() 
	{ 
		titletextbox.sendKeys("Ranjana Patel");	
	}
	public void enterComment() 
	{ 
		 descriptiontextbox.sendKeys("I am working on dummy website");
	}
	public void clickSubmit() 
	{
		//WebDriverWait wait = new WebDriverWait(driver,30);
		//WebElement element = wait.until(ExpectedConditions.visibilityOf(submitbutton));
		
		submitbutton.click(); 
		
		/*JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("argument[0].click()",submitbutton);*/
		
		}
	
	public void verifymsg()
	{
		String expectedmsg="Form submited Successfully!"; 
		String actualmsg=msg.getText(); 
		 
		 Assert.assertEquals(expectedmsg,"Form submited Successfully!");
		
	}
	}



