package com.shoppingcart.qa.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shoppingcart.qa.base.TestBase;

public class LogInPage extends TestBase   {
	
	
	
	@FindBy(xpath="//a[normalize-space()='Sign in']")
	WebElement signInButton;
	
	
	
	@FindBy(id="email")
	WebElement email;
	
	
	
	@FindBy(id="passwd")
	WebElement password;
	
	
	
	@FindBy(id="SubmitLogin")
	WebElement submitLogin;
	
	//Initializing the Page Objects
	
	public LogInPage()
	{
	     
		PageFactory.initElements(driver, this);
	}
	
	//Methods
	

	
	public String validateLoginPageTitle()
	{
		
		return driver.getTitle();
	}
	
	public HomePage signin(String em , String pwd)
	{
		signInButton.click();
		email.sendKeys(em);
		password.sendKeys(pwd);
		submitLogin.click();
		
		return new HomePage();
		
	}

}
