package com.shoppingcart.qa.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.shoppingcart.qa.base.TestBase;
import com.shoppingcart.qa.pages.HomePage;
import com.shoppingcart.qa.pages.SignInPage;

public class HomePageTest extends TestBase{
	
	public static SignInPage signinpage;
	public static HomePage homepage;
	
	public HomePageTest()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeMethod
	public void setup() throws IOException
	{
		initialise();
		signinpage = new SignInPage();
		signinpage.signinlink();
		homepage = signinpage.signin(prop.getProperty("emaill"), prop.getProperty("passwordd"));
		
		
	}
	
	@Test
	public void clickonlink() throws InterruptedException
	{
		 homepage.MouseHover();
		//homepage.clickMethod();
		//homepage.AddingToCart();
		//homepage.AddToCart();
		//homepage.ClickonCloseButton();
	}
	
	
}
