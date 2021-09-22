package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import junit.framework.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EnterdataSteps {
	WebDriver driver;
	@Given("^I navigate to link")
	 public void navigationToLink()
	 {
		 System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		     driver= new ChromeDriver();
		  driver.get("https://www.seleniumeasy.com/test/ajax-form-submit-demo.html");
	 }
	
	@Then("^verify name and comment fields are available$")
	 public void verifyNameAndCommentFields()
	 {
		WebElement titletextbox = driver.findElement(By.xpath("//input[@id='title']"));
		if(titletextbox.isDisplayed())
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		WebElement descriptiontextbox = driver.findElement(By.xpath("//textarea[@id='description']"));
		if(descriptiontextbox.isDisplayed())
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	 }
	@When("^I enter data in name and comment fields$")
	public void enterTheNameAndComment()  {
		WebElement titletextbox = driver.findElement(By.xpath("//input[@id='title']"));
		titletextbox.sendKeys("Ranjana Patel");	
		WebElement descriptiontextbox = driver.findElement(By.xpath("//textarea[@id='description']"));
		descriptiontextbox.sendKeys("I am working on dummy website");  
	}
	
	@And("^I click on submit button$")
	public void clickOnSubmitButon() {
		WebElement submitbutton = driver.findElement(By.xpath("//input[@id='btn-submit']"));
		submitbutton.click();
	}
	@Then("^verify form submitted message is displayed on screen$")
	public void verifyTheSubmitForm() throws InterruptedException 
	{
		WebElement msg = driver.findElement(By.id("submit-control"));
		Thread.sleep(3000);
		String actualmsg=msg.getText();
		String expectedmsg="Form submited Successfully!"; 
		Assert.assertEquals(expectedmsg,"Form submited Successfully!");
	}
	
	
	
	
}
