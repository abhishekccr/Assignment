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

public class ItemsPage extends TestBase {
	
	public Actions action;
	
	JavascriptExecutor js;
    
	
	@FindBy(xpath = "//img[@title='Faded Short Sleeve T-shirts']")   // Clicking on Women link directs to selection page
	WebElement productone;
	
	@FindBy(xpath="//img[@title='Blouse']")
	WebElement seconditem;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]/span")
	WebElement AddtoCart;
	
	@FindBy(xpath="//span[@title='Continue shopping']//span[1]")
	WebElement continueshopping;
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/div[2]/a[1]/span")
	WebElement addtocart2;
	
	@FindBy(css="a[title='Proceed to checkout'] span")
	WebElement proceed;
	
	@FindBy(css="a[class='button btn btn-default standard-checkout button-medium'] span")
	WebElement summaryproceed;
	
	@FindBy(css="button[name='processAddress'] span")
	WebElement addressproceed;
	
	@FindBy(xpath="//input[@id='cgv']")
	WebElement shippingcheckbox;
	
	@FindBy(css="button[name='processCarrier'] span")
	WebElement shippingproceed;
	
	@FindBy(xpath="//a[@title='Pay by bank wire']")
	WebElement paybank;
	
	@FindBy(css="button[class='button btn btn-default button-medium'] span")
	WebElement confirmorder;
	
	
	public ItemsPage()
	{
		PageFactory.initElements(driver, this);
	}

	
	 public static void mousehover(WebDriver driver , WebElement element)
	   {
		   Actions a = new Actions(driver);
		   a.moveToElement(element).perform();
	   }
	
	public void AddFirstItem() throws InterruptedException
	{
		
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,720)");
		
		
	
		 Thread.sleep(2000);
		
		action = new Actions(driver);
		
  
		
	 action.moveToElement(productone).perform();
		
		
		//WebElement cart = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]/span"));
		WebDriverWait wtt = new WebDriverWait(driver , 10);
		wtt.until(ExpectedConditions.elementToBeClickable(AddtoCart));
		
		action.moveToElement(AddtoCart).click().perform();
		
		//WebElement continueshopping = driver.findElement(By.xpath("//span[@title='Continue shopping']//span[1]"));
		WebDriverWait wait = new WebDriverWait(driver , 10);
		wtt.until(ExpectedConditions.elementToBeClickable(continueshopping));
		
		action.moveToElement(continueshopping).click().perform();
		
		
	}
	
	public void AddSecondItem() throws InterruptedException
	{
		
		//action = new Actions(driver);
		
		//action.moveToElement(seconditem).perform();
		
		
		WebDriverWait wtt = new WebDriverWait(driver , 12);
		wtt.until(ExpectedConditions.elementToBeClickable(addtocart2));
		
		action.moveToElement(addtocart2).click().perform();
		
		
		//WebElement checkout = driver.findElement(By.cssSelector("a[title='Proceed to checkout'] span"));
		 js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].click()", proceed);
	    
		
		
	}
	
	public  void checkout() throws InterruptedException
	{
		summaryproceed.click();
		 addressproceed.click();
		// wtt = new WebDriverWait(driver, 5);
		// wtt.until(ExpectedConditions.elementToBeClickable(shippingcheckbox));
		 Thread.sleep(2000);
		 shippingcheckbox.click();
		 shippingproceed.click();
		 paybank.click();
		 confirmorder.click();
		
	}
	
	
	

}
