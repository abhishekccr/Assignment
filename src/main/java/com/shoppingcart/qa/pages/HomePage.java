package com.shoppingcart.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.shoppingcart.qa.base.TestBase;

public class HomePage extends TestBase{
	
	
	
	public Actions action;

	@FindBy(xpath = "//a[@title='Women']")   // Clicking on Women link directs to selection page
	WebElement wmn;
	
	@FindBy(xpath="//img[@title='Faded Short Sleeve T-shirts']")
	WebElement firstitem;
	
	@FindBy(xpath="//img[@title='Blouse']")
	WebElement seconditem;
	
	@FindBy(xpath="//span[contains(Text(),’Add to cart’)]")
	WebElement AddtoCart;
	
	@FindBy(xpath="//span[@title='Close window']")
	WebElement close;
	
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void MouseHover() throws InterruptedException
	{
		action = new Actions(driver);
		action.moveToElement(firstitem).build().perform();
		Thread.sleep(3000);
	}
	/*public void clickMethod() throws InterruptedException
	{
	wmn.click();
	Thread.sleep(3000);
	
	//WebDriverWait wait = new WebDriverWait(driver,2) ; //Create utility for this in util class
	//wait.until(ExpectedConditions.visibilityOf(wmn));
	
	
	}*/
	
	public void AddingToCart() throws InterruptedException
	
	{
		wmn.click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("argument[0].scrollIntoView(true)", firstitem);
		
		action.moveToElement(firstitem).build().perform();
		Thread.sleep(3000);
	}
	
	public void AddToCart() throws InterruptedException
	{
		AddtoCart.click();
		Thread.sleep(2000);
		
	}
	
	public void ClickonCloseButton()
	{
		close.click();
	}
	
	/*public void clickUsingJavaScriptExecutor()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
	}
	*/
	
	
	
}
