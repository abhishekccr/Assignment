package com.shoppingcart.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.shoppingcart.qa.base.TestBase;

public class HomePage extends TestBase{
	

	
	public Actions action;

	@FindBy(xpath = "//a[@title='Women']")   // Clicking on Women link directs to selection page
	WebElement womenLink;

	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public ItemsPage clickMethod() throws InterruptedException
	{
	womenLink.click();
	return new ItemsPage();
	
	//WebDriverWait wait = new WebDriverWait(driver,2) ; //Create utility for this in util class
	//wait.until(ExpectedConditions.visibilityOf(wmn));
	
	}
	
	
	public String validateWomenPageTitle()
	{
		return driver.getTitle();
	}

	
	
	
}
