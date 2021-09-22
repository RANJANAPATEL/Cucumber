package com.easy.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.easy.qa.util.TestUtil;

public class Testbase {

	public static WebDriver driver;
	public static Properties prop;
	public static Logger logger = null;
	
	/*public static void loadLog4j() {
		String log4jpath = System.getProperty("user.dir")+ "/log4j.properties";
		PropertyConfigurator.configure(log4jpath);*/
	
	
	public Testbase() 
	{ 
		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\GSC-30753\\eclipse-workspace\\easyseleniunassignment\\src\\main\\java\\com\\easy\\qa\\config\\config.properties");
			prop.load(ip);
		
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
         public static void initialization() throws Exception
         {
       String browserName =	 prop.getProperty("browser2");
         if(browserName.equals("firefox"))
         {
        	 System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
     		     driver= new FirefoxDriver();
         }
         else if(browserName.equals("chrome"))
         {
        	 System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
     		     driver= new ChromeDriver();
        	
		}
         else
         {
        	 System.setProperty("webdriver.edge.driver", "./Driver/msedgedriver.exe");
 		     driver= new EdgeDriver();
     }
         driver.manage().window().maximize();
        // Duration timeouts = Duration.ofSeconds(50);
         driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
         driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS); 
        // driver.get(prop.getProperty("url1"));
         }} 
