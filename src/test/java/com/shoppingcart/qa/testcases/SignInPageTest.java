package com.shoppingcart.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.shoppingcart.qa.base.TestBase;

import com.shoppingcart.qa.pages.SignInPage;

public class SignInPageTest extends TestBase{
	
	public static SignInPage spp;
	
	
	
	public SignInPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}



	
	 @BeforeMethod
	  public void setup() throws IOException
	  {
		   initialise();
		  
		   spp = new SignInPage();
		  
		  
		  
	  }
	 
	   @Test
	   public void click() throws IOException
	   {
		    spp.signinlink();
		    spp.signin(prop.getProperty("emaill"), prop.getProperty("passwordd"));
	   }
	   
	   @AfterMethod()
		public void closeBrowser()
		{
			driver.quit();
		}

}
