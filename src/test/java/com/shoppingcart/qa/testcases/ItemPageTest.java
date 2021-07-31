package com.shoppingcart.qa.testcases;

import java.io.IOException;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.shoppingcart.qa.base.TestBase;
import com.shoppingcart.qa.pages.HomePage;
import com.shoppingcart.qa.pages.ItemsPage;
import com.shoppingcart.qa.pages.LogInPage;


public class ItemPageTest extends TestBase{
	
	public static LogInPage signinpage;
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
			signinpage = new LogInPage();
			
			homepage = signinpage.signin(prop.getProperty("emaill"), prop.getProperty("passwordd"));
			itemspage = homepage.clickMethod();
			
	 }
	 
	 @Test
		public void mouseaction() throws InterruptedException
		{
			
		    itemspage.AddProductsToCart();
			itemspage.placeOrder();
			
		}
	 
	 @AfterMethod()
		public void closeBrowser()
		{
			driver.quit();
		}
	 
}
