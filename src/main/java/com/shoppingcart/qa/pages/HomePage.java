package com.shoppingcart.qa.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.shoppingcart.qa.base.TestBase;

public class HomePage extends TestBase{
	

	
	

	@FindBy(xpath = "//a[@title='Women']")   
	WebElement womenSectionLink;

	 // This code can be used to invoke the code from the Browser without referring to initialise() method of the base class. 
	 /*
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	*/
	
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	

	
	public ItemsPage clickMethod() throws InterruptedException
	{
	womenSectionLink.click();
	return new ItemsPage();
	
	//return new ItemsPage(driver); // This to be used when invoking Browser without referring to initialise() method of the base class.
	
	}
	
	
	public String validateWomenPageTitle()
	{
		return driver.getTitle();
	}

	
	
	
}
