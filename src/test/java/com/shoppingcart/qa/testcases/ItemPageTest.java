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
import com.shoppingcart.qa.pages.HomePage;
import com.shoppingcart.qa.pages.ItemsPage;
import com.shoppingcart.qa.pages.LogInPage;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ItemPageTest extends TestBase{
	
	public static LogInPage loginpage;
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
		   loginpage = new LogInPage();
		   homepage = loginpage.signin(prop.getProperty("useremail"), prop.getProperty("userpassword"));
			itemspage = homepage.clickMethod();
		   
			/*  This to be used when invoking Browser without referring to initialise() method of the base class.
			 
		     WebDriverManager.chromedriver().setup();
	         WebDriver driver = new ChromeDriver();
		     signinpage = new LogInPage(driver);
	       
			 driver.manage().window().maximize();
		 	 driver.manage().deleteAllCookies();
		 	 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		     driver.get("http://automationpractice.com/index.php");
			 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
		*/
			
	 }
	 
	 @Test
		public void validateAddItemsToCart() throws InterruptedException
		{
			
		    itemspage.AddProductsToCart();
			itemspage.placeOrder();
			String confirmOrderMessagetitle = itemspage.validateConfirmOrderMessage();
			
			Assert.assertEquals(confirmOrderMessagetitle, "Order confirmation - My Store");
		
		}
	 
	 @AfterMethod()
		public void closeBrowser()
		{
			driver.quit();
		}
	 
}
