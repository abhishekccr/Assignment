package com.shoppingcart.qa.pages;


import java.io.IOException;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shoppingcart.qa.base.TestBase;

public class SignInPage  extends TestBase {
	
	
	
	@FindBy(xpath="//a[normalize-space()='Sign in']")
	WebElement signin;
	
	@FindBy(xpath = "//input[@id='email']")
	WebElement email;
	
	@FindBy(xpath = "//input[@id='passwd']")
	WebElement password;
	
	@FindBy(xpath="//button[@id='SubmitLogin']")
	WebElement submit;
	
	public SignInPage()
	{
	    PageFactory.initElements(driver, this);
	}
	
	//Method
	
	
	
	public SignInPage signinlink() throws IOException
	{
		signin.click();
		return new SignInPage();
	}
	
	public HomePage signin(String em , String pwd)
	{
		email.sendKeys(em);
		password.sendKeys(pwd);
		submit.click();
		
		return new HomePage();
		
	}

}
