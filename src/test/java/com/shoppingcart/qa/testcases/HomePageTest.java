package com.shoppingcart.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.shoppingcart.qa.base.TestBase;
import com.shoppingcart.qa.pages.HomePage;
import com.shoppingcart.qa.pages.ItemsPage;
import com.shoppingcart.qa.pages.LogInPage;

public class HomePageTest extends TestBase{
	
	public static LogInPage signinpage;
	public static HomePage homepage;
	public static ItemsPage itemspage;
	
	public HomePageTest()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeMethod
	public void setup() throws IOException
	{
		initialise();
		signinpage = new LogInPage();
		//signinpage.signinlink();
		homepage = signinpage.signin(prop.getProperty("emaill"), prop.getProperty("passwordd"));
		
	}

	
 @Test
 public void womenPageTitleTest() throws InterruptedException
 {
	 homepage.clickMethod(); 
	 String womenpagetitle = homepage.validateWomenPageTitle();
	 Assert.assertEquals(womenpagetitle, "Women - My Store");
 }
 
	@AfterMethod()
	public void closeBrowser()
	{
		driver.quit();
	}
	
}
