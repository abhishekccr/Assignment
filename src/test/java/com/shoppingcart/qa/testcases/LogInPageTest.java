package com.shoppingcart.qa.testcases;



import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.shoppingcart.qa.base.TestBase;

import com.shoppingcart.qa.pages.LogInPage;

import io.github.bonigarcia.wdm.WebDriverManager;



public class LogInPageTest extends TestBase {
	
	public static LogInPage loginpage;
	
	

	public LogInPageTest() throws IOException 
	{
		super();
		
	}


	 @BeforeMethod
	  public void setup() throws IOException
	  {
		   initialise();
		   loginpage= new LogInPage();
		   
		   
		// This to be used when invoking Browser without referring to initialise() method of the base class.
		   
		   /*
		    WebDriverManager.chromedriver().setup();
	       WebDriver driver = new ChromeDriver();
		 
		   loginpage = new LogInPage(driver);
		   driver.manage().window().maximize();
	 	   driver.manage().deleteAllCookies();
	 	   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.get("http://automationpractice.com/index.php");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		  */
		  
	  }
	 
	   @Test
	   public void Login() throws IOException
	   {
		  
		   loginpage.signin(prop.getProperty("useremail"), prop.getProperty("userpassword"));
	   }
	   
	   @Test
	   public void loginPageTitleTest()
	   {
		  String pagetitle =  loginpage.validateLoginPageTitle();
		  
		  Assert.assertEquals(pagetitle, "My Store");
		  
	   }
	   
	   @AfterMethod()
		public void closeBrowser()
		{
			driver.quit();
		}

}
