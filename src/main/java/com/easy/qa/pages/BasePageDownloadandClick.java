 package com.easy.qa.pages;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.easy.qa.base.Testbase;

public class BasePageDownloadandClick extends Testbase{
	public WebDriver driver;
		
		@FindBy(id="downloadButton")
		private WebElement startdownload ;
		@FindBy(xpath="//button[.='Close']")
		private WebElement clickonclose;
		
		
		public BasePageDownloadandClick(WebDriver driver)
		{
			this.driver=driver;
		PageFactory.initElements(driver,this); 
}
		
		public void clickOnDownloadButton() throws Exception
		{ 
			startdownload.click();	
			//driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
			Thread.sleep(15000);
		}
		public void clickOnCloseButton()
		{ 
			
			clickonclose.click();	
		}


}
