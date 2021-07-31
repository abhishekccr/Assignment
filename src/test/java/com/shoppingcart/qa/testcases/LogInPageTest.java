package com.shoppingcart.qa.testcases;



import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.shoppingcart.qa.base.TestBase;

import com.shoppingcart.qa.pages.LogInPage;



public class LogInPageTest extends TestBase {
	
	public static LogInPage loginpage;
	
	

	public LogInPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}



	
	 @BeforeMethod
	  public void setup() throws IOException
	  {
		   initialise();
		 
		   loginpage = new LogInPage();
		  
	  }
	 
	   @Test
	   public void Login() throws IOException
	   {
		  
		   loginpage.signin(prop.getProperty("emaill"), prop.getProperty("passwordd"));
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
