package com.shoppingcart.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.shoppingcart.qa.base.TestBase;
import com.shoppingcart.qa.pages.HomePage;
import com.shoppingcart.qa.pages.ItemsPage;
import com.shoppingcart.qa.pages.SignInPage;

public class ItemPageTest extends TestBase{
	
	public static SignInPage signinpage;
	public static HomePage homepage;
	public static ItemsPage itemspage;
	
	 public ItemPageTest()
	{
		super();
	}

	 
	 @BeforeMethod
	 public void setup() throws IOException, InterruptedException
	 {
		    initialise();
			signinpage = new SignInPage();
			signinpage.signinlink();
			homepage = signinpage.signin(prop.getProperty("emaill"), prop.getProperty("passwordd"));
			itemspage = homepage.clickMethod();
			//WebDriverWait wt = new WebDriverWait();
			
	 }
	 
	 @Test
		public void mouseaction() throws InterruptedException
		{
			 itemspage.AddFirstItem();
			
			itemspage.AddSecondItem();
			itemspage.checkout();
			 
			
		}
	 
	 @AfterMethod()
		public void closeBrowser()
		{
			driver.quit();
		}
	 
}
