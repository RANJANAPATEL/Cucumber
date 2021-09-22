package com.easy.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

import com.easy.qa.base.Testbase;

public class BasePageNameSearchAndValidate extends Testbase {
	public WebDriver driver;

	@FindBy(xpath="//h4[text()='Name: Brenda Tree']")
	private WebElement namesearch;
	
	@FindBy(xpath="//span[text()='Phone: 644-555-2222, ']")
	private WebElement phone_No;
	
	public BasePageNameSearchAndValidate(WebDriver driver)
	{
		this.driver=driver;
	PageFactory.initElements(driver,this); 
	}
	
	public void nameprint()
	{
		String name = namesearch.getText();
				System.out.println(name);
	}
	public void validatethePhone_No()
	{
		String exp_phoneno = "Phone: 644-555-2222,";
		String act_phoneno = phone_No.getText();
		System.out.println(act_phoneno);
		Assert.assertEquals(act_phoneno,exp_phoneno);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


